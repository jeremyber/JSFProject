package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Cart;
import model.ListingBean;
import model.LoginBean;
import model.UserBean;

/**
 *
 * @author bmsalm
 */

public class UserDAO {
    
    public static boolean attemptLogin(LoginBean userCredentials) 
    {
        boolean success = false; 

        //get new connection to db
        Connection dbConnection = ConnectionManager.getNewConnection();
        Statement stmt;
        ResultSet results;
        
        try 
        {
            stmt = dbConnection.createStatement();    //build query statement
            String queryString = 
                    "SELECT * FROM project.Login WHERE username = '"
                    + userCredentials.getUsername().toLowerCase() +"'";        

            results= stmt.executeQuery(queryString);   //execute insert

            if(results.next())
            {
                success = results.getString("password").equals(userCredentials.getPassword());
            }

            stmt.close();
            dbConnection.close();   //close connection
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

        return success; 
    }
    
    public static boolean getUserInformation(UserBean authenicatedUser, String username, Cart cartBean)
    {
        boolean success = false; 

        //get new connection to db
        Connection dbConnection = ConnectionManager.getNewConnection();
        Statement stmt;
        ResultSet results;
        
        try 
        {
            stmt = dbConnection.createStatement();    //build query statement
            String queryString = 
                    "SELECT * FROM project.Users WHERE username = '"
                    + username.toLowerCase() +"'";        

            results = stmt.executeQuery(queryString);   //execute insert

            if(results.next())
            {
                authenicatedUser.setUsername(results.getString("username"));
                authenicatedUser.setEmail(results.getString("email"));
                authenicatedUser.setFirstname(results.getString("firstname"));
                authenicatedUser.setLastname(results.getString("lastname"));
                authenicatedUser.setPermissions(results.getInt("permissions"));          
            }
            
             String queryCart = 
                    "SELECT * FROM project.Users u join project.Cart c on u.username = c.username join project.listings l on "
                    + "l.listingid = c.listingid WHERE u.username = '"
                    + username.toLowerCase() +"'";    
             
             results = stmt.executeQuery(queryCart);
             ArrayList<ListingBean> listings = new ArrayList();
             while(results.next())
             {
                 ListingBean temp = new ListingBean();
                 temp.setListingDate(results.getTimestamp("ListingDate"));
                 temp.setListingID(results.getInt("ListingID"));
                 temp.setOwnerID(results.getString("OwnerID"));
                 temp.setPrice(results.getDouble("Price"));
                 temp.setPropertyID(results.getInt("PropertyID"));
                 temp.setTax(results.getDouble("TAX"));
                 temp.setTitle(results.getString("Title"));
                 listings.add(temp);
             }
             
             cartBean.setItems(listings);

            stmt.close();
            dbConnection.close();   //close connection
            
            success = true;
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        
        return success;
    }
   
    
    public static boolean retrievePassword(String username)
    {
        ResultSet passwords;
        boolean success = false;
        
        //get connection to database for password retrieval
        try 
        {
            Connection dbConnection = ConnectionManager.getNewConnection();
            Statement stmt = dbConnection.createStatement();    //build query statement
            String queryString = ""; //query for user here, something like SELECT PASSWORD FROM LOGIN WHERE USERNAME = user.getUsername;
            passwords = stmt.executeQuery(queryString);   //execute query
            
            if(passwords.next())
            {
                //if in here, password was found, send email, change password in db to random data
            }
    
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

        return success;   //if this line is reached, successfully sent password
    }
     
     public static boolean checkUsername(LoginBean user, UserBean email)
     {
        boolean foundUser = false; 

        //get new connection to db
        Connection dbConnection = ConnectionManager.getNewConnection();
        Statement stmt;
        ResultSet results;

        try 
        {
            stmt = dbConnection.createStatement();    //build query statement
            String queryString = 
                    "SELECT * FROM project.Login l join project.Users u on l.username = u.username WHERE l.username = '"
                    + user.getUsername().toLowerCase() +"'";        

            results= stmt.executeQuery(queryString);   //execute insert

            if(results.next())
            {
                email.setEmail(results.getString("Email"));
                user.setSecurityq(results.getString("SECURITYQ"));
                user.setSecuritya(results.getString("SECURITYA"));
                foundUser = true;
            }

            stmt.close();
            dbConnection.close();   //close connection

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

        return foundUser;   //if user found, true, else false
     }
     
     public static void changePassword(LoginBean user)
     {
         
        char[] characters ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8',
            '9'};

        int rand;
        String tempPassword = "";
        for(int i = 0; i < 8; i++)
        {
              tempPassword+= "" + characters[(int) (Math.random()*36)];   
        }

        user.setPassword(tempPassword);
        
        //get new connection to db
        Connection dbConnection = ConnectionManager.getNewConnection();
        Statement stmt;

         String updatePassword = "Update project.Login SET password=\'"+tempPassword +"\'"
                    + " WHERE USERNAME = \'" + user.getUsername() + "\'";

         try
         {
             stmt = dbConnection.createStatement();
             int row =  stmt.executeUpdate(updatePassword);
             stmt.close();
             dbConnection.close();
         }
         catch (SQLException e) 
         {
            System.err.println(e.getMessage());
        }      
     }
     
     public static boolean changeEmail(UserBean user, String changeEmail)
     {
          

        //get new connection to db
        Connection dbConnection = ConnectionManager.getNewConnection();
        Statement stmt;

        try 
        {
            stmt = dbConnection.createStatement();    //build query statement
            String updateEmail = 
                    "Update project.Users Set Email = \'" + changeEmail + "\' where username = \'" + user.getUsername() + "\'";    

            int rows = stmt.executeUpdate(updateEmail);   //execute update
          

            stmt.close();
            dbConnection.close();   //close connection
            
            if(rows>0) return true;

        } catch (SQLException e) 
        {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
     }
     
     public static ArrayList<String> getAllEmails()
     {
        //get new connection to db
        Connection dbConnection = ConnectionManager.getNewConnection();
        Statement stmt;
        
        ArrayList<String> emails = new ArrayList();

        try 
        {
            stmt = dbConnection.createStatement();    //build query statement
            String getEmails = 
                    "Select Email from project.users";    

           ResultSet emailList = stmt.executeQuery(getEmails);   //execute update
          
           while(emailList.next())
           {
               emails.add(emailList.getString("Email"));
           }
            stmt.close();
            dbConnection.close();   //close connection
            
           

        } catch (SQLException e) 
        {
            System.err.println(e.getMessage());
            return null;
        }
        return emails; 
     }
}
