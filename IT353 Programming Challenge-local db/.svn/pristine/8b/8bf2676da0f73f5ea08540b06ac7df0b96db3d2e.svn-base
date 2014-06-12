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
import java.util.ArrayList;
import model.ListingBean;
import model.PropertyBean;

/**
 *
 * @author root
 */
public class ListingDAO 
{
    public static void postListing(ListingBean listing, PropertyBean property, String ownerid)
    {
        Connection dbConnection = ConnectionManager.getNewConnection();
        try
        {
            Statement stmt = dbConnection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
          
            
            String insertProperty = "Insert into project.properties Values(DEFAULT, \'" + ownerid + "\', \'" +property.getPropertyName() + "\', \'" 
                    + property.getPropertySize() + "\', \'" +  property.getCroppingSize() + "\', \'" + property.getZoningType() 
                    + "\', \'" + property.getBuildings() + "\', \'" 
                    + property.getSoilTypes() + "\', \'" + property.getAvgProductivity() + "\', \'" + property.getLegalDescription() + "\', \'" 
                    +  property.getAddress() + "\', \'" + property.getCounty() + "\', \'" + property.getCity() + "\', \'" + property.getState() 
                    + "\', \'" + property.getZipcode() + "\', \'" + property.getPictureURL() 
                    + "\')";
            System.out.println(insertProperty);
            stmt.executeUpdate(insertProperty);
            
            //get last property id
            String query = "Select PropertyID From Project.Listings";
            ResultSet rs = stmt.executeQuery(query);
            rs.last();
            int id = rs.getInt("PropertyID")+1;   //next property id
           
            String insertListing = "Insert into project.listings (PropertyID, OwnerID, Title, Price, Tax, ListingDate, ViewCount) "
                                 + "Values("
                                 + id + ", \'" + ownerid
                                 + "\', \'" + listing.getTitle() + "\', " + listing.getPrice() 
                                 + ", " + listing.getTax() + ", TIMESTAMP(\'" + listing.getListingDate() + "\'), 0)";

            System.out.println(insertListing);
            stmt.executeUpdate(insertListing);





        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
   
    public static ListingBean getListing(String listingID)
    {
        Connection dbConnection = ConnectionManager.getNewConnection();
        try
        {
            Statement stmt;
            stmt = dbConnection.createStatement();

            String queryString = "Select * From Project.Listings WHERE listingID = "+listingID;
            System.out.println(queryString);   
            
            ResultSet results = stmt.executeQuery(queryString);   //execute insert
            
            ListingBean temp = null;
            
            if(results.next())   //read from result set
            {
                temp = new ListingBean();

                temp.setListingID(results.getInt("listingID"));
                temp.setPropertyID(results.getInt("propertyID"));
                temp.setOwnerID(results.getString("ownerID"));
                temp.setTitle(results.getString("title"));
                temp.setPrice(results.getDouble("price"));
                temp.setTax(results.getDouble("tax"));
                temp.setListingDate(results.getTimestamp("listingDate"));
                temp.setViewCount(results.getInt("viewcount"));
            }
            
            stmt.close();
            dbConnection.close();   //close connection
            
            return temp;
       }
       catch(SQLException e)
       {
           System.err.println(e.getMessage());
           return null;
       }
   }
    
    
    public static ArrayList<ListingBean> getListings()
    {
        Connection dbConnection = ConnectionManager.getNewConnection();
        try
        {
            Statement stmt;
            stmt = dbConnection.createStatement();

            String queryString = "Select * From Project.Listings";
            System.out.println(queryString);   
            
            ResultSet results = stmt.executeQuery(queryString);   //execute insert
            
            ArrayList<ListingBean> listings = new ArrayList();
            ListingBean temp = null;
            
            while(results.next())   //read from result set
            {
                temp = new ListingBean();

                temp.setListingID(results.getInt("listingID"));
                temp.setPropertyID(results.getInt("propertyID"));
                temp.setOwnerID(results.getString("ownerID"));
                temp.setTitle(results.getString("title"));
                temp.setPrice(results.getDouble("price"));
                temp.setTax(results.getDouble("tax"));
                temp.setListingDate(results.getTimestamp("listingDate"));
                temp.setViewCount(results.getInt("viewcount"));
                listings.add(temp);
            }
            
            stmt.close();
            dbConnection.close();   //close connection
            
            return listings;
       }
       catch(SQLException e)
       {
           System.err.println(e.getMessage());
           return null;
       }
   }
    
    public static boolean removeListing(int ListingID)
    {
        Connection dbConnection = ConnectionManager.getNewConnection();
        try
        {
            Statement stmt;
            stmt = dbConnection.createStatement();

            String removeString = "Delete From Project.Listings WHERE listingID = "+ListingID;  
            
            int rows = stmt.executeUpdate(removeString);   //execute insert
            
          
            stmt.close();
            dbConnection.close();   //close connection
            
            return true;
       }
       catch(SQLException e)
       {
           System.err.println(e.getMessage());
           return false;
       }
    }
    
    public static String getListingEmail(ListingBean listing)
    {
         Connection dbConnection = ConnectionManager.getNewConnection();
         String email = "";
        try
        {
            Statement stmt;
            stmt = dbConnection.createStatement();
            
            String getEmail = "Select Email from project.Users u Join project.Listings l on u.username = l.ownerid where listingid = " + listing.getListingID();
            
            
            
            ResultSet rs = stmt.executeQuery(getEmail);
            
            
            if(rs.next())
            {
                email = rs.getString("Email");
            }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
            return null;
        }
        
        return email;
        
    }
    
    public static void updateListing(ListingBean listing, PropertyBean property)
    {
        Connection dbConnection = ConnectionManager.getNewConnection();
        try
        {
            Statement stmt = dbConnection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
          
            
            String updateProperty =  "Update project.properties "
                                    + "SET propertyname = \'" + property.getPropertyName()
                                    + "\', propertysize = \'" + property.getPropertySize()
                                    + "\', croppingsize = \'" + property.getCroppingSize()
                                    + "\', zoningtype = \'"   + property.getZoningType()
                                    + "\', buildings = \'"    + property.getBuildings()
                                    + "\', soiltypes = \'"    + property.getSoilTypes()
                                    + "\', avgproductivity = \'" + property.getAvgProductivity()
                                    + "\', legaldescription = \'" + property.getLegalDescription()
                                    + "\', address = \'"      + property.getAddress()
                                    + "\', county = \'"       + property.getCounty()
                                    + "\', city = \'"         + property.getCity()
                                    + "\', state = \'"        + property.getState()
                                    + "\', zipcode = \'"      + property.getZipcode()
                                    + "\', pictureurl = \'"   + property.getPictureURL()
                                    + "\' WHERE propertyid = " + property.getPropertyID();
            System.out.println(updateProperty);
            stmt.executeUpdate(updateProperty);
            
            String updateListing = "Update project.listings "
                                  + "SET title = \'" + listing.getTitle()
                                  + "\', price = "   + listing.getPrice()
                                  +   ", tax = "     + listing.getTax()
                                  +   ", listingdate = TIMESTAMP(\'" + listing.getListingDate() + "\')"
                                  + " Where listingid = " + listing.getListingID();
                    
            System.out.println(updateListing);
            stmt.executeUpdate(updateListing);





        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    public static ListingBean getMostViewedListing()
    {
             Connection dbConnection = ConnectionManager.getNewConnection();
             ListingBean mostViewed = null;
        try
        {
            Statement stmt = dbConnection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
          
            
            String queryMostViewed =  "Select * From project.listings";
            System.out.println(queryMostViewed);
            ResultSet rs = stmt.executeQuery(queryMostViewed);
            
            
            int viewCount = 0;
            while(rs.next())
            {
                if(rs.getInt("ViewCount") > viewCount)
                {
                    viewCount = rs.getInt("ViewCount");
                    mostViewed = new ListingBean();
                    mostViewed.setListingID(rs.getInt("ListingID"));
                    mostViewed.setPropertyID(rs.getInt("PropertyID"));
                    mostViewed.setOwnerID(rs.getString("ownerid"));
                    mostViewed.setTitle(rs.getString("Title"));
                    mostViewed.setPrice(rs.getDouble("Price"));
                    mostViewed.setTax(rs.getDouble("Tax"));
                    mostViewed.setListingDate(rs.getTimestamp("ListingDate"));
                    mostViewed.setViewCount(rs.getInt("ViewCount"));
                }
                    
            }
           
         
            stmt.close();
            dbConnection.close();   //close connection




        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
            return null;
        }
        return mostViewed;
    }
    
    public static void incrementViewCount(int listingid)
    {
          Connection dbConnection = ConnectionManager.getNewConnection();
          
        try
        {
            Statement stmt;
            stmt = dbConnection.createStatement();

            String selectViewCount = "Select ViewCount From project.listings where listingid = " + listingid;  
            
            ResultSet rs  = stmt.executeQuery(selectViewCount);   //execute query
            int tempViewCount =0;
            
            if(rs.next())
            {
                tempViewCount = rs.getInt("ViewCount");
                tempViewCount++;
            }
            
            //increment by one
            String updateListing = "Update project.listings "
                                 + "SET ViewCount = " + tempViewCount
                                 + " Where ListingID = " + listingid;
            
            stmt.executeUpdate(updateListing);
            
          
            stmt.close();
            dbConnection.close();   //close connection
            
       }
       catch(SQLException e)
       {
           System.err.println(e.getMessage());
       }
    }
}
