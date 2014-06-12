package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.LoginBean;
import model.UserBean;

/**
 *
 * @author bmsalm
 */

public class SigninDAO {
    
    public static String usernameAvailable(UserBean userProfile) {
        
        ResultSet results;
        
        //get new connection to db
        Connection dbConnection = ConnectionManager.getNewConnection();
        Statement stmt;
        try 
        {
            stmt = dbConnection.createStatement();    //build query statement
            String queryString = 
                    "SELECT * FROM project.Users WHERE username = '"
                    + userProfile.getUsername() +"'";
                    
            results= stmt.executeQuery(queryString);   //execute insert

            if(results.next())
                return "ERROR CREATING NEW USER: Username is already taken!<br>";
            
            stmt.close();
            dbConnection.close();   //close connection
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return "ERROR CREATING NEW USER: SQLException: - "+ "<br>" + e.getMessage(); 
        }

        return "";   //if this line is reached, successfully validated info
    }
        
    //call ONLY AFTER all validation is completed
    public static String createProfile(UserBean userProfile, LoginBean loginProfile) {
        
        //get new connection to db
        Connection dbConnection = ConnectionManager.getNewConnection();

        try {      
            //insert into user table
            Statement insertUserStatement = dbConnection.createStatement();    //build insert statement
            String insertString = 
                    "INSERT INTO project.Users VALUES "
                    + "('" + userProfile.getUsername().toLowerCase()
                    + "','" + userProfile.getEmail()
                    + "','" + userProfile.getFirstname()
                    + "','" + userProfile.getLastname()
                    + "', 2"
                    + ")";
            insertUserStatement.executeUpdate(insertString);   //execute insert
            System.out.println("user insert string = " + insertString);
            
            //insert into logininfo table
            Statement insertLoginStatement = dbConnection.createStatement();    //build insert statement
            insertString = 
                    "INSERT INTO project.Login VALUES "
                    + "('" + userProfile.getUsername().toLowerCase()
                    + "','" + loginProfile.getPassword()
                    + "','" + loginProfile.getSecurityq()
                    + "','" + loginProfile.getSecuritya()
                    + "')";
            insertLoginStatement.executeUpdate(insertString);   //execute insert
            String temp = "login insert string = " + insertString;

            dbConnection.close();
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return "ERROR CREATING NEW USER: SQLException: - "+ "<br>"+e.getMessage(); 
        }
        
        return "";
    }
}
