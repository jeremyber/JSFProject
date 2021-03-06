package controller;

import DAO.ListingDAO;
import DAO.PropertyDAO;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.ListingBean;
import model.PropertyBean;

/**
 *
 * @author bmsalm
 */
@ManagedBean
@SessionScoped
public class PropertyController implements Serializable
{
    private PropertyBean thePropertyModel;
    private ListingBean theListingModel;
    private ArrayList<ListingBean> theListings;
    
    private String response;
    
    //bean contructors
    public PropertyController() { 
        thePropertyModel = new PropertyBean();   //new property object
        theListingModel = new ListingBean();     //new listing object
    }
    
    //property bean functions
    public PropertyBean getThePropertyModel() {
        return thePropertyModel;
    }
    public void setThePropertyModel(PropertyBean thePropertyModel) {
        this.thePropertyModel = thePropertyModel;
    }

    //listing bean functions
    public ListingBean getTheListingModel() {
        return theListingModel;
    }
    public void setTheListingModel(ListingBean theListingModel) {
        this.theListingModel = theListingModel;
    }
    
    //
    public String getResponse() {
        
        String str = "";
        
        //validate fields
        String validateString = checkFieldsEmpty();
        if(! validateString.equals(""))
        {
            str += "Please populate the following fields: \n";
            str += validateString;
            return str; 
        }
        
        validateString = checkInputValidity();
        if(! validateString.equals(""))
        {
            str += "Please correct the following fields: \n";
            str += validateString;
            return str; 
        }

        else
        {
            //store in DB   
            str+= "Listing posted successfully!";
        }
        
        //get success or fail response 
        response = str;
        return response;
    }
    
    private String checkFieldsEmpty()
    {
        String missingFields = "";

        double price = theListingModel.getPrice();
        double tax = theListingModel.getTax();
        
        //check listing fields
        if(theListingModel.getTitle().equals(""))
            missingFields += "Title, ";
        if(theListingModel.getPrice() <= 0 )
            missingFields += "Price Per Acre, ";
        if(theListingModel.getTax() <= 0)
            missingFields += "Property Tax, ";

        //check property fields

        if(thePropertyModel.getPropertyName().equals(""))
            missingFields += "Property Name, ";
        if(thePropertyModel.getPropertySize().equals(""))
            missingFields += "Property Size, ";
        if(thePropertyModel.getCroppingSize().equals(""))
            missingFields += "Cropping Size, ";
        if(thePropertyModel.getZoningType().equals(""))
            missingFields += "Zoning Type, ";
        if(thePropertyModel.getBuildings().equals(""))
            missingFields += "Buildings, ";
        if(thePropertyModel.getSoilTypes().equals(""))
            missingFields += "Soil Types, ";
        if(thePropertyModel.getAvgProductivity().equals(""))
            missingFields += "Average Productivity, ";
        if(thePropertyModel.getLegalDescription().equals(""))
            missingFields += "Legal Description, ";
        if(thePropertyModel.getCounty().equals(""))
            missingFields += "County, ";
        if(thePropertyModel.getTownship().equals(""))
            missingFields += "Township, ";
        if(thePropertyModel.getCity().equals(""))
            missingFields += "City, ";
        if(thePropertyModel.getState().equals(""))
            missingFields += "State, ";  
        if(thePropertyModel.getZipcode().equals(""))
            missingFields += "Zip Code, ";

        else
            return missingFields;

        return missingFields.substring(0, missingFields.length()-2);
    }

    private String checkInputValidity()
    {
        String invalidFields = "";
        
        //check listing fields
        if(theListingModel.getTitle().equals(""))
            invalidFields += "- Listing TITLE must be between 5 and 128 characters";
        if(theListingModel.getPrice() <= 0)
            invalidFields += "- Listing PRICE must be greater than $0.00";
        if(theListingModel.getTax() <= 0)
            invalidFields += "- Listing TAX must be greater than $0.00";

//        //check property fields
//
//        if(thePropertyModel.getPropertyName().equals(""))
//            missingFields += "Property Name, ";
//        if(thePropertyModel.getPropertySize().equals(""))
//            missingFields += "Property Size, ";
//        if(thePropertyModel.getCroppingSize().equals(""))
//            missingFields += "Cropping Size, ";
//        if(thePropertyModel.getZoningType().equals(""))
//            missingFields += "Zoning Type, ";
//        if(thePropertyModel.getBuildings().equals(""))
//            missingFields += "Buildings, ";
//        if(thePropertyModel.getSoilTypes().equals(""))
//            missingFields += "Soil Types, ";
//        if(thePropertyModel.getAvgProductivity().equals(""))
//            missingFields += "Average Productivity, ";
//        if(thePropertyModel.getLegalDescription().equals(""))
//            missingFields += "Legal Description, ";
//        if(thePropertyModel.getCounty().equals(""))
//            missingFields += "County, ";
//        if(thePropertyModel.getTownship().equals(""))
//            missingFields += "Township, ";
//        if(thePropertyModel.getCity().equals(""))
//            missingFields += "City, ";
//        if(thePropertyModel.getState().equals(""))
//            missingFields += "State, ";  
//        if(thePropertyModel.getZipcode().equals(""))
//            missingFields += "Zip Code, ";
        return invalidFields;

    }
    
    public String getListingEmail()
    {
        return ListingDAO.getListingEmail(theListingModel);
    }
    
    public String listAnItem(String username)
    {
        System.out.println(thePropertyModel.getPictureURL());
        java.util.Date date= new java.util.Date();
        theListingModel.setListingDate(new Timestamp(date.getTime()));
        ListingDAO.postListing(theListingModel, thePropertyModel, username);
        return "echoposting.xhtml";
    }
    
    public String updateListing()
    {
         String listingid =  FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("listing");
         String propertyid =  FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("property");
         ListingBean listing =  ListingDAO.getListing(listingid);
         PropertyBean property = PropertyDAO.getListing(propertyid);
         theListingModel = listing;
         thePropertyModel = property;
         return "updatelistingform.xhtml";
    }
    
    public String updateCurrentListing()
    {
        ListingDAO.updateListing(theListingModel, thePropertyModel);
        theListingModel = new ListingBean();
        thePropertyModel = new PropertyBean();
        
        return "echoupdateposting.xhtml";
    }

    public ArrayList<ListingBean> getTheListings() {
        return ListingDAO.getListings();
    }

    public void setTheListings(ArrayList<ListingBean> theListings) {
        this.theListings = theListings;
    }

}