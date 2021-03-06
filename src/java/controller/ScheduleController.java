package controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.ScheduleDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Properties;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.TimeslotBean;

/**
 *
 * @author it3530103
 */
@ManagedBean
@ViewScoped
public class ScheduleController implements Serializable
{
    private ArrayList<TimeslotBean> timeslots;
    private String results;
    private String chosenID;
    private String chosenName;
    private String status;
    private String email;  
    
    public ScheduleController(){
        //timeslots = null;
        results = "";
        chosenID = "";
        chosenName = "";
        status = "";
        email = ""; 
    }
    
    public String getTimeslots()
    {
        timeslots = ScheduleDAO.searchTimeslots();
        
        String str = "";    //temp string
        str += "<table border=\"1\" cellpadding=\"5px\">";
            str += "<tr>";
            str += "<td><b>ID</b></td>";
            str += "<td><b>TimeSlot</b></td>";
            str += "<td><b>GroupName</b></td>";
            str += "</tr>";
        
        if(timeslots == null){
            str += "</table><br/><br/>";
            str += "NO AVAILABLE TIMES! null";
            
            results = str;
            return results;
        }
        if(timeslots.isEmpty()){
            str += "</table><br/><br/>";
            str += "NO AVAILABLE TIMES!";
            
            results = str;
            return results;
        }
        for(int i = 0; i < timeslots.size(); i++){
            TimeslotBean temp = timeslots.get(i);
            str += "<tr>";
            
            str += "<td>"+temp.getId()+"</td>";
            str += "<td>"+temp.getTimeslot()+"</td>";

            if(!temp.getAvailable())    
                str += "<td><font color=\"red\">"+temp.getAvailableString()+""
                        + "</font></td>";
            else
                str += "<td><font color=\"green\"><b>"+temp.getAvailableString()+""
                        + "</font></b></td>";
                
            str += "</tr>";
        }
            str += "</table>";
            
        results = str;
        return results;
    }
    
    public void takeTimeSlot(AjaxBehaviorEvent event)
    {
        timeslots = ScheduleDAO.searchTimeslots();
        
        if(timeslots == null){
            status = "<font color=\"red\"><b>Cannot Process Request at this time!</b></font>";
                    return;
        }
        
        try{
            int id = Integer.parseInt(chosenID);
            
            if(chosenID.equals("") || id < 0 || id >= timeslots.size()){
                    status = "<font color=\"red\"><b>Please select an appropriate Time Slot ID</b></font>";
                    return;
            }
            if(email.equals("")){ //user not logged in
                    status = "<font color=\"red\"><b>Please Login to schedule an appointment!</b></font>";
                    return;
            }
            
            String emailStatus = sendEmail();
            if(!emailStatus.equals("")){ //user not logged in
                    status = "<font color=\"red\"><b>"+emailStatus+"</b></font>";
                    return;
            }
            
            status = ScheduleDAO.takeTimeslot(id, email);
        }
        catch(NumberFormatException nfe)  
        {  
            status = "<font color=\"red\"><b>Please select an appropriate Time Slot ID</b></font>";  
        }  
    }

    //for taking a time slot
    public String getChosenID() {
        return chosenID;
    }
    public String getChosenName() {
        return chosenName;
    }
    public String getStatus() {
        return status;
    }
    public void setChosenID(String chosenID) {
        this.chosenID = chosenID;
    }
    public void setChosenName(String chosenName) {
        this.chosenName = chosenName;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    private String validateEmail()
    {
        
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
        
        //verify e-mail
       String emailStatus = this.validateEmail();
       
       if(!(emailStatus.equals("")))
       {
           return emailStatus; 
       }
       
       // Recipient's email ID needs to be mentioned.
        String to = email; 

        // Sender's email ID needs to be mentioned
        String from = "jdber@ilstu.edu";

        // Assuming you are sending email from this host
        String host = "smtp.ilstu.edu";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.user", "bmsalm"); // if needed
        properties.setProperty("mail.password", "omlette666"); // if needed

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
            message.setSubject("Your appointment with Agland Inc.");

            // Send the actual HTML message, as big as you like
            message.setContent("Thank you for scheduling an appointment!"
                    + "<br><br>We will see you from " 
                    + this.timeslots.get(Integer.parseInt(chosenID)).getTimeslot()
                    + "<br> Please do not be late. Thank you very much."
                    + "<br><br>Agland Illinois Services Inc.",
                    "text/html");

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully...."); 
            
        }catch (MessagingException e) {
            System.out.println("Error sending email: "+e.getMessage());
            return ("Appointment Scheduled! However, we are unable to send your welcome email at this time: <br/>"
                    + e.getMessage()
                    +":<br>");
        } 
        
        return "";
    }
    
    public void changeEmail(String email) {
        this.email = email;
    }
}
