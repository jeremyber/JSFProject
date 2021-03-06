/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import DAO.CartDAO;
import DAO.ListingDAO;
import DAO.UserDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Properties;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.Cart;
import model.ListingBean;
import model.LoginBean;
import model.UserBean;

/**
 *
 * @author bmsalm
 */

@ManagedBean
@SessionScoped
public class UserController implements Serializable 
{
    private UserBean theUserModel;
    private LoginBean theLoginModel;
    private Cart theCartModel;
    private String addedToCart;
    
    //for password retrival 
    private String passRetrieveSignal;
    private String verificationOfAnswer;
    private String securityGuess;
    private String unsubscribed;
    private String newsletterValidation;
    
    public UserController() {
        theUserModel = new UserBean();
        theLoginModel = new LoginBean();   //new user
        theCartModel = new Cart();
        addedToCart="";
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
    
    
/////////////////////////////////////////////    
//////Sign-In and Sign-Out Functionality/////
/////////////////////////////////////////////
 
    public String Login()
    {
        if(UserDAO.attemptLogin(theLoginModel))
        {
            if(setCurrentUser())
                return "search.xhtml";
        }
   
        return "loginfailed.xhtml";
    }
    
    public String Logout()
    {
        this.theLoginModel = new LoginBean();
        this.theUserModel = new UserBean();
        
        return "index.xhtml";
    }
    
    private boolean setCurrentUser()
    {
        //will update the user model by reference
        return UserDAO.getUserInformation(this.theUserModel, theLoginModel.getUsername(), this.theCartModel);  
    }
    
    
////////////////////////////////////////////////////////////
/////Persistence getters for accessing user information/////
////////////////////////////////////////////////////////////
    
    public String getCurrentUsername(){
        return theUserModel.getUsername();
    }
    public String getCurrentEmail(){
        return theUserModel.getEmail();
    }
    public String getCurrentFirstName(){
        return theUserModel.getFirstname();
    }
    public String getCurrentLastName(){
        return theUserModel.getLastname();
    }
    public int getCurrentPermissions(){
        return theUserModel.getPermissions();
    }
    
    //get info to supply header
    public String getHeaderInfo()
    {
        //Error
        if(theUserModel == null)
            return "<a href=\"./login.xhtml\">Login</a> | "
                    +"<a href=\"./signup.xhtml\">Sign-Up   </a>";
            
        //NOT logged in
        if(getCurrentUsername().equals(""))
            return "<a href=\"./login.xhtml\">Login</a> | "
                    +"<a href=\"./signup.xhtml\">Sign-Up   </a>";
        
        //logged in
        return getCurrentUsername()+ " | " + "   <a href=\"./viewcart.xhtml\">View Cart(" + this.theCartModel.getNumItemsInCart() + ")" + " | " +
                    "<a href=\"./logout.xhtml\">Logout   </a>";
                
    }
    

    
    //display listing link for logged in admins
    public String getListingLink()
    {
        if(theUserModel == null)
            return "";
            
        //NOT logged in OR not admin
        if(getCurrentUsername().equals("") || getCurrentPermissions() != 1)
            return "";
        
        //logged in as admin
        return "<a href=\"./newlisting.xhtml\" id=\"menu-item\">&#215; <u>Admin:</u> Post a new Listing</a>";
    }
    
    public String getNewsletter()
    {
        if(theUserModel == null)
            return "";
        
        //Not logged in OR not admin
        if(getCurrentUsername().equals("") || getCurrentPermissions()!= 1)
           return "";
        
        //logged in admin
        return "<a href=\"./sendnewsletter.xhtml\" id=\"menu-item\">&#215; <u>Admin:</u> Send newsletter</a>";
    }
    
    public String getUpdateListing()
    {
          if(theUserModel == null)
            return "";
        
        //Not logged in OR not admin
        if(getCurrentUsername().equals("") || getCurrentPermissions()!= 1)
           return "";
        
        //logged in admin
        return "<a href=\"./updatelisting.xhtml\" id=\"menu-item\">&#215; <u>Admin:</u> Update Listing</a>";
    }
  
//////////////////////////////////////////////
/////Functionality for Password retrieval/////
//////////////////////////////////////////////
    public String attemptPasswordRetrieval()
    {
        if(UserDAO.checkUsername(theLoginModel, theUserModel))
        {

            return "securityquestion.xhtml";
        }
        else
        {
            this.setPassRetrieveSignal("Username not found.");
            return "retrievepassword.xhtml";
        }
    }
    public void retrievePassword()
    {
       if(UserDAO.retrievePassword(theLoginModel.getUsername()))
         this.setPassRetrieveSignal("Your temporary pasword has been emailed to you.");
       else
       {
           this.setPassRetrieveSignal("Your account could not be located. Please try again.");
       }

    }
    
    public void checkSecurityAnswer()
{
     if(theLoginModel.getSecuritya().equalsIgnoreCase(securityGuess))
     {
         UserDAO.changePassword(theLoginModel);
         sendPasswordEmail();
         this.setVerificationOfAnswer("Email Sent.");
     }
     else
     {
        this.setVerificationOfAnswer("Answer was incorrect. Please try again.");
     }
}

    private String sendPasswordEmail()
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
              message.setSubject("Agland Password Reset");

              // Send the actual HTML message, as big as you like
              message.setContent("Hello!"+ ", <br>" 
                      + "Your password has been updated so you can log in"
                      + "<br><br>Your new password is: " + theLoginModel.getPassword()
                      + "<br> Please update it to a new password that you won't forget it once you login."
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
    
    public String addToCart(ListingBean listing)
    {
        if(theUserModel.getUsername().equals(""))  //must be signed in to add to cart
            return "login.xhtml";
        this.setAddedToCart(theCartModel.addToCart(listing, this.theUserModel.getUsername()));
        return "viewcart.xhtml";
    }
    public String removeItemFromCart()
    {
        String tempName = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("username");
        int listingID = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("listingID"));
        
        ArrayList<ListingBean> tempListings = this.theCartModel.getItems();
        System.out.println(listingID);
        boolean found = false;
        int i = 0;
        for(; i <tempListings.size() && !found; i++)
        {
            if(tempListings.get(i).getListingID() == listingID)
            {
               break;
            }
        }
        
        tempListings.remove(i);
        this.theCartModel.setItems(tempListings);
        
        CartDAO.removeItem(listingID, tempName);
        return "viewcart.xhtml";
    }
    
    public String checkout()
    {
        for(int i = 0; i<theCartModel.getItems().size(); i++)
        {
            ListingDAO.removeListing(theCartModel.getItems().get(i).getListingID());
        }
        this.theCartModel = new Cart();
        
        //need to update search controller to reflect removed items
      /**  SearchController search = (SearchController)FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get("searchController");
        search.setResults(SearchDAO.searchProperties(search.getTheSearchModel()));
        */
        
        return "viewcart.xhtml";
    }
    public String getItemsInCart()
    {
        return this.theCartModel.displayItemsInCart(theUserModel.getUsername());
    }
    
    public void unsubscribe()
    {
        if(!theUserModel.getEmail().equals(""))
        {
           if(UserDAO.changeEmail(theUserModel, ""))
               this.setUnsubscribed("Successfully unsubscribed from e-mail!");
        }
        else
        {
            this.setUnsubscribed("Could not find e-mail. Try logging in.");
        }
            
    }
    
    
    public String sendEmails()
    {
         String tempEmail = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("email");
        
        ArrayList<String> tempEmails = this.theUserModel.getEmails();
        boolean found = false;
        int i = 0;
        for(; i <tempEmails.size() && !found; i++)
        {
            if(tempEmails.get(i).equals(tempEmail))
            {
               break;
            }
        }
        
        tempEmails.remove(i);
        this.theUserModel.setEmails(tempEmails);
        
        //send newsletter email
        this.sendNewsletterEmails(tempEmail);
        
        this.setNewsletterValidation("Email Sent to " + tempEmail + "!");
        return "sendnewsletter.xhtml";
    }

     public String getPassRetrieveSignal() {
         return passRetrieveSignal;
     }

     public void setPassRetrieveSignal(String passRetrieveSignal) {
         this.passRetrieveSignal = passRetrieveSignal;
     }

     public String getVerificationOfAnswer() {
         return verificationOfAnswer;
     }

     public void setVerificationOfAnswer(String verificationOfAnswer) {
         this.verificationOfAnswer = verificationOfAnswer;
     }

     public String getSecurityGuess() {
         return securityGuess;
     }

    public void setSecurityGuess(String securityGuess) {
         this.securityGuess = securityGuess;
     }

    public Cart getTheCartModel() {
        return theCartModel;
    }

    public void setTheCartModel(Cart theCartModel) {
        this.theCartModel = theCartModel;
    }

    public String getAddedToCart() {
        return addedToCart;
    }

    public void setAddedToCart(String addedToCart) {
        this.addedToCart = addedToCart;
    }

    public String getUnsubscribed() {
        return unsubscribed;
    }

    public void setUnsubscribed(String unsubscribed) {
        this.unsubscribed = unsubscribed;
    }
    
    
     private String sendNewsletterEmails(String emailToSend)
     {
        // Recipient's email ID needs to be mentioned.
          String to = emailToSend;

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
              message.setSubject("Hello from Agland!");

              ArrayList<ListingBean> listings = ListingDAO.getListings();
              String presentListings = "";
              int listingNo = 1;
              for(int i = 0; i<listings.size(); i+=3)
              {
                  
                  presentListings+="<b>"+listingNo+")"+listings.get(i).getTitle() + "</b><br/>";
                  presentListings+="Estimated at $" + listings.get(i).getPrice() + "<br/>";
                  presentListings+="Listed on " + listings.get(i).getListingDate() + "<br/><br/>";
                  listingNo++;
              }
              // Send the actual HTML message, as big as you like
              message.setContent("Hello, "+ theUserModel.getFirstname() + ", <br>" 
                      + "Here are some of our properties in case you were interested!<br>"
                      + presentListings
                      + "Thank you for subscribing to our emails! Have a good day!",
                      "text/html");

              // Send message
              Transport.send(message);
              System.out.println("Sent message successfully...."); 

          }catch (MessagingException e) {
              System.out.println("Error sending email: "+e.getMessage());
              return "Email Sent! However, we are unable to send your welcome email at this time:<br>"
                      + e.getMessage()
                      +":<br>";

          } 

          return "Newsletter Sent!";

     }

    public String getNewsletterValidation() {
        return newsletterValidation;
    }

    public void setNewsletterValidation(String newsletterValidation) {
        this.newsletterValidation = newsletterValidation;
    }
    
}
