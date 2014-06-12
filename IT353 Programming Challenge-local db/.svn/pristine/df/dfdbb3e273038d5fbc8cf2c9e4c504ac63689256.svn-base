package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.TimeslotBean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author it3530103
 */
public class ScheduleDAO 
{
    
    public static ArrayList<TimeslotBean> searchTimeslots()
    {       
        ArrayList<TimeslotBean> timeslots = new ArrayList(); 
        ResultSet results;  //results of query
        Statement stmt;     //build query statement
        
        //get new connection to db
        Connection dbConnection = ConnectionManager.getNewConnection();
        
        //search terms should be "" if no term entered
        try 
        {
            stmt = dbConnection.createStatement();
            String queryString = "SELECT * FROM project.Schedule";
            
            System.out.println(queryString);    //for testing
            results = stmt.executeQuery(queryString);   //execute insert
            
            while(results.next())   //read from result set
            {

                TimeslotBean temp = new TimeslotBean();

                temp.setId(results.getInt("id"));
                temp.setTimeslot(results.getString("timeslot"));
                temp.setAvailable(results.getBoolean("available"));
                temp.setTakenBy(results.getString("groupname"));

                timeslots.add(temp);
                
            }
            
            stmt.close();
            dbConnection.close();   //close connection
            
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null; 
        }

        return timeslots; 
    }
    
    public static String takeTimeslot(int id, String groupName)
    {
        //get new connection to db
        Connection dbConnection = ConnectionManager.getNewConnection();
        ResultSet results;  //results of query
        Statement qstmt, ustmt;     //build query statement
        
        //search terms should be "" if no term entered
        try 
        {
            qstmt = dbConnection.createStatement();
            String queryString = "SELECT * FROM project.Schedule WHERE id = "+id
                    +" AND available = 1";
            
            System.out.println(queryString);    //for testing
            results = qstmt.executeQuery(queryString);   //execute insert
            
            if(results.next())   //read from result set
            {
                ustmt = dbConnection.createStatement();
                String updateString = "UPDATE project.Schedule "+
                        "SET available = 0, groupname = \'"+groupName+
                         "\' WHERE id = "+id;
                
                System.out.println(updateString);    //for testing
                int rows = qstmt.executeUpdate(updateString);   //execute insert
                
                ustmt.close();
            }
            else
            {
                return "<font color=\"red\"><b>Someone beat you to this time slot! <br/> "
                        + "Please select another!</b></font>";
            }
            qstmt.close(); 
            dbConnection.close();   //close connection
            
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return "<font color=\"red\"><b>Something went wrong! - " 
                    + e.getMessage()+"</b></font>"; 
        }
        
        return "<font color=\"green\"><b>You got the time slot!</b></font>";
    }
    
}
