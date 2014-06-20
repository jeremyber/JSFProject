/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import DAO.SigninDAO;
import java.io.Serializable;
import java.util.Properties;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.LoginBean;
import model.UserBean;

/**
 *
 * @author root
 */
@ManagedBean
@SessionScoped
public class SignupController implements Serializable 
{
    private UserBean theUserModel;
    private LoginBean theLoginModel;
    
    private String confirmationPassword;
    private String confirmationEmail;
    
    private String usernameAvailability;
    
    private String response;
    
    public SignupController() {
        theUserModel = new UserBean();
        theLoginModel = new LoginBean();   //new user
        confirmationPassword = "";
        confirmationEmail = "";
    }
    
/////////////////////////
/////Model Accessors/////
/////////////////////////
    
    public LoginBean getTheLoginModel() {
        return theLoginModel;
    }
    public void setTheModel(LoginBean theLoginModel) {
        this.theLoginModel = theLoginModel;
    }
    
    public UserBean getTheUserModel() {
        return theUserModel;
    }
    public void setTheUserModel(UserBean theUserModel) {
        this.theUserModel = theUserModel;
    }
    
    public String getResponse() 
    {
        response = "";
        response = validateForm();   //see if the information entered is appropriate
        
        if(response.equals(""))  //if validation good, try to write new user to DB
        {
            response = createProfile(); //commit profile to database
        }
        else
        {   //will return errors with validation
            return "Creating profile was unsuccessful: <br>"+response; 
        }
        
        return response;    //if this line is reached, profile creation was successful
    }
    
    public void setResponse(String r){
        this.response = r;
    }
    
/////////////////////////////   
//////Validation Methods/////
/////////////////////////////
 
    public void validateUsername(AjaxBehaviorEvent event)
    {
        //check if username is within bounds
        if(!(theUserModel.getUsername().length() <= 32 &&
                theUserModel.getUsername().length() >= 4))
            usernameAvailability = "<font color = \"orange\">"
                    + "Username must be between 4-25 characters."
                    + "</font>";
        
        //check db for existing username
        else if(!SigninDAO.usernameAvailable(theUserModel).equals(""))
            usernameAvailability = "<font color = \"red\">"
                    +"Username is aready taken!"
                    + "</font>";
        
        else
            usernameAvailability = "<font color = \"green\">"
                    +"Username available"
                    + "</font>";
    }
    
    public String validateForm()
    {
        response = "";
       
        //check if all credentials have been filled
        if(theUserModel.getUsername().equals(""))
           response+=  "- Failed to supply a username<br>";
        if(theUserModel.getFirstname().equals(""))
           response+=  "- Failed to supply a first name<br>";
        if(theUserModel.getLastname().equals(""))
           response+=  "- Failed to supply a last name<br>";
        
        if(theLoginModel.getPassword().equals(""))
           response+=  "- Failed to supply a password<br>";
        if(confirmationPassword.equals(""))
           response+=  "- Failed to supply a re-entered password<br>";
        
        if(theUserModel.getEmail().equals(""))
           response+=  "- Failed to supply an Email address<br>";
        if(confirmationEmail.equals(""))
           response+=  "- Failed to supply an re-entered Email address<br>";
        
        if(theLoginModel.getSecurityq().equals(""))
           response+=  "- Failed to supply a security question<br>";
        if(theLoginModel.getSecuritya().equals(""))
           response+=  "- Failed to supply a security answer<br>";
        
        //return if any field empty
        if(!response.equals(""))
            return response; 
        
        //check first name length
        if(!(theUserModel.getFirstname().length() <= 32 &&
                theUserModel.getFirstname().length() >= 4))
            return "First name length must be between 4-25 characters.";
        
        //check if passwords match
        if(!(theLoginModel.getPassword().equals(confirmationPassword)))
            return "Passwords entered do not match.";
        
        //check if passwords match
        if(!(theUserModel.getEmail().equals(confirmationEmail)))
            return "Emails entered do not match.";
        
        //check first name length
        if(!(theUserModel.getFirstname().length() <= 32 &&
                theUserModel.getFirstname().length() >= 2))
            return "First name length must be between 2-25 characters.";
        
        //check last name length
        if(!(theUserModel.getLastname().length() <= 32 &&
                theUserModel.getLastname().length() >= 2))
            return "Last name length must be between 2-25 characters.";
        
        //validate email address
        response = validateEmail();
        if(!(response.equals("")))
            return response;//error with email
        
        //contact database to see if username is already taken.
        theLoginModel.setUsername(theUserModel.getUsername());  //duplicate username into loginbean
        theUserModel.setPermissions(2);
        return SigninDAO.usernameAvailable(theUserModel); //should return "" upon success
    }
    
    public String createProfile() 
    {
        // Doing anything with the object after this?
        response = SigninDAO.createProfile(theUserModel , theLoginModel); 
        
        if (response.equals(""))
        {
            //send welcome email
            response = sendEmail();
            
                            //for testing
            return response;/* + "<br/>" 
                    + theUserModel.toString()
                    + theLoginModel.toString();*/
        }
        else
            return response; 
    
    }
    
    private String validateEmail(){
        String email = theUserModel.getEmail();
        int last_index = email.length() - 1;
        int at_pos = -1;
        boolean at_seen = false;
        boolean dot_seen = false;

        //see if only one @
        for(int j = 0; j < email.length(); j++)
        {	
            if(email.charAt(j) == '@')
            {			
                if((j != 0 && j != last_index) && at_seen == false)
                {
                    at_pos = j; 
                    at_seen = true; //encountered an @
                }
                else
                {
                    if(j == 0 || j == last_index)
                        return("Email Error: @ cannot appear at beginning or end of email-address");
                    else
                        return("Email Error: @ cannot appear more than once in an email-address");
                }
            }
        }

        if(at_seen == false)	//no @ encountered		
                return ("Email Error: No @ found");

        //check for periods / position 
        for(int k = 0; k < email.length(); k++)
        {	
            if(email.charAt(k) == '.')
            {			
                if(k == 0 || k == last_index || k == (at_pos + 1))	//period at beginning, right after @, or end 
                {
                    return("Email Error: Period cannot appear at beginning, right after @, or end!");
                }
                if(k > (at_pos + 1))
                {
                    dot_seen = true; 
                }
            }
        }

        if(dot_seen == false)	//no . encountered	
            return("Email Error: No period found");

        return "";  //validation good
    }

    private String sendEmail()
    {
       // Recipient's email ID needs to be mentioned.
        String to = theUserModel.getEmail();

        // Sender's email ID needs to be mentioned
        String from = "bmsalm@ilstu.edu";

        // Assuming you are sending email from this host
        String host = "smtp.ilstu.edu";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.user", "bmsalm"); // if needed
        //properties.setProperty("mail.password", "omlette666"); // if needed

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Thank you for registering!");

            // Send the actual HTML message, as big as you like
            message.setContent(theUserModel.getFirstname()+ ", <br>" 
                    + "Thank you for registering!"
                    + "<br><br>Username: "+theUserModel.getUsername()
                    + "<br>Password: "+theLoginModel.getPassword()
                    + "<br><br>Agland Illinois Services Inc.",
                    "text/html");

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully...."); 
            
        }catch (MessagingException e) {
            System.out.println("Error sending email: "+e.getMessage());
            return "Profile Created! However, we are unable to send your welcome email at this time:<br>"
                    + e.getMessage()
                    +":<br>";
        } 
        
        return "Profile Created! Please Login to continue...";
    }
    
    //confirmation field getters/setters 
    public String getConfirmationPassword(){
        return confirmationPassword;
    }
    public String getConfirmationEmail(){
        return confirmationEmail;
    }
    public String getUsernameAvailability(){
        return usernameAvailability;
    }
    
    public void setConfirmationPassword(String p){
        this.confirmationPassword = p;
    }
    public void setConfirmationEmail(String e){
        this.confirmationEmail = e;
    }
    public void setUsernameAvailability(String u){
        this.usernameAvailability = u;
    }
}

