package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.PropertyBean;


/**
 *
 * @author bmsalm
 */
public class PropertyDAO {
    public static PropertyBean getListing(String propertyID)
    {
        Connection dbConnection = ConnectionManager.getNewConnection();
        
        try
        {
            Statement stmt;
            stmt = dbConnection.createStatement();

            String queryString = "Select * From Project.Properties WHERE propertyID = "+propertyID;
            System.out.println(queryString);   
            
            ResultSet results = stmt.executeQuery(queryString);   //execute insert
            
            PropertyBean temp = null;
            
            if(results.next())   //read from result set
            {
                temp = new PropertyBean();
                
                temp.setPropertyID(results.getInt("propertyID"));
                temp.setOwnerID(results.getString("ownerID"));
   
                temp.setPropertyName(results.getString("propertyName"));
                temp.setPropertySize(results.getString("propertySize"));
                temp.setCroppingSize(results.getString("croppingSize"));
                temp.setZoningType(results.getString("zoningType"));
                temp.setBuildings(results.getString("buildings"));
                temp.setSoilTypes(results.getString("soilTypes"));
                temp.setAvgProductivity(results.getString("avgProductivity"));
                temp.setLegalDescription(results.getString("legalDescription"));
                
            
                temp.setAddress(results.getString("address"));
                temp.setCounty(results.getString("county"));
                temp.setCity(results.getString("city"));
                temp.setState(results.getString("state"));
                temp.setZipcode(results.getString("zipcode"));
                        
                temp.setPictureURL(results.getString("pictureURL"));
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
    
    
}
