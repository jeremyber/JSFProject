/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.ListingBean;
import model.PropertyBean;

/**
 *
 * @author root
 */
public class CartDAO 
{
    public static boolean addItem(ListingBean listing, String username)
    {
        Connection dbConnection = ConnectionManager.getNewConnection();
        try
        {
            Statement stmt = dbConnection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String insertItem = "Insert into project.Cart Values(" +  listing.getListingID() + ", \'" + username + "\')";
            stmt.executeUpdate(insertItem);

           
       }
       catch(SQLException e)
       {
           System.err.println(e.getMessage());
           return false;
       }
        return true;
   }
    
   public static boolean removeItem(int listing, String username)
   {
          Connection dbConnection = ConnectionManager.getNewConnection();
        try
        {
            Statement stmt = dbConnection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String removeItem = "Delete from project.Cart where listingid = "+ listing + "and username = \'" + username +"\'";
            stmt.executeUpdate(removeItem);

           
       }
       catch(SQLException e)
       {
           System.err.println(e.getMessage());
           return false;
       }
        return true;
   }
}
