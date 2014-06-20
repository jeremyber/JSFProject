/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import model.ListingBean;
import model.SearchBean;

/**
 *
 * @author it3530122
 */
public class SearchDAO 
{
    public static ArrayList<ListingBean> searchProperties(SearchBean search)
    {
        String searchTerms = search.getSearchTerm(); 
        String minPrice = search.getMinPrice(); 
        String maxPrice = search.getMaxPrice();
        
        ArrayList<ListingBean> listings = new ArrayList(); 
        ResultSet results;  //results of query
        Statement stmt;     //build query statement
        
        //get new connection to db
        Connection dbConnection = ConnectionManager.getNewConnection();
        
        //search terms should be "" if no term entered
        try 
        {
            stmt = dbConnection.createStatement();
            String queryString = "SELECT * FROM project.Listings";
            String conditionString = "";
            
            if(! minPrice.equals(""))
            {
                conditionString += ("price >= " + minPrice);
            }
            if(! maxPrice.equals(""))
            {
                if(! conditionString.equals(""))
                    conditionString += " AND ";
                
                conditionString += ("price <= " + maxPrice);
            }

            if(! conditionString.equals(""))
                queryString += (" WHERE " + conditionString);
            
            System.out.println(queryString);
            
            results = stmt.executeQuery(queryString);   //execute insert
            
            //handle search terms
            if(!searchTerms.equals(""))
            {
                while(results.next())   //read from result set
                {
                    String current_title = results.getString("title");
                    
                    //build Listing Bean and add to array
                    //if title contains search
                    if((current_title.toLowerCase()).contains(searchTerms.toLowerCase())) 
                    {
                        ListingBean temp = new ListingBean();
                        
                        temp.setListingID(results.getInt("listingID"));
                        temp.setPropertyID(results.getInt("propertyID"));
                        temp.setOwnerID(results.getString("ownerID"));
                        temp.setTitle(results.getString("title"));
                        temp.setPrice(results.getDouble("price"));
                        temp.setTax(results.getDouble("tax"));
                        temp.setListingDate(results.getTimestamp("listingDate"));
                    
                        listings.add(temp);
                    }
                }
            }
            else
            {
                while(results.next())   //read from result set
                {
                    ListingBean temp = new ListingBean();

                    temp.setListingID(results.getInt("listingID"));
                    temp.setPropertyID(results.getInt("propertyID"));
                    temp.setOwnerID(results.getString("ownerID"));
                    temp.setTitle(results.getString("title"));
                    temp.setPrice(results.getDouble("price"));
                    temp.setTax(results.getDouble("tax"));
                    temp.setListingDate(results.getTimestamp("listingDate"));

                    listings.add(temp);
                }
            }
            
            stmt.close();
            dbConnection.close();   //close connection
            
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null; 
        }

        return listings; 
    }
}
