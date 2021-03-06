package controller;

import DAO.ListingDAO;
import DAO.PropertyDAO;
import DAO.SearchDAO;
import isu.ISUGoogleMapsService;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.xml.ws.WebServiceRef;
import model.ListingBean;
import model.PropertyBean;

import model.SearchBean;
import org.me.isuzillow.ISUZillowWebService_Service;
import org.me.isuzillow.SearchResult;


/**
 * Brandon Salm and Jeremy Ber
 * @author bmsalm
 */
@ManagedBean
@SessionScoped
public class SearchController implements Serializable
{
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/gfish.it.ilstu.edu_8080/ISUGoogleMaps/ISUGoogleMapsService.wsdl")
    private ISUGoogleMapsService service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/gfish.it.ilstu.edu_8080/ISUZillowWebService/ISUZillowWebService.wsdl")
    private ISUZillowWebService_Service service;
   
    
    private String searchResults;
    private SearchBean theSearchModel;
    private ArrayList<ListingBean> results; 
    
    private String viewListingID;
    
    //bean contructors
    public SearchController() { 
        service = new ISUZillowWebService_Service();
        theSearchModel = new SearchBean();     //new listing object
        results = null;
    }
    
    //search bean functions
    public SearchBean getTheSearchModel() {
        return theSearchModel;
    }
    public void setTheSearchModel(SearchBean theModel) {
        this.theSearchModel = theModel;
    }
    
    //response
    public String getSearchResults() {
        return searchResults;
    }
    public void setSearchResults(String setSearchResults) {
        //this.searchResults = setSearchResults;
    }
    
    public String getFeaturedListing()
    {
        String FEATURED_LISTING_ID = "1";
        
        DecimalFormat formatUSD = new DecimalFormat("#.##");
        ListingBean temp = ListingDAO.getListing(FEATURED_LISTING_ID);
        return "<div align=\"left\" class=\"results\" >"+
                       "<a href=\"./viewlisting.xhtml?id="+temp.getListingID()+"\"></a>"+
                       "<b>"+temp.getTitle()+":</b><br/>"+
                       "Price Per Acre: $"+formatUSD.format(temp.getPrice())+"<br/>"+
                       "Property Tax: $"+formatUSD.format(temp.getTax())+"<br/>"+
                       "Listing Date: "+temp.getListingDate()+"<br/>"+
                       "</div><br/>";
    }
    
    public String getMostViewedListing()
    {
             ListingBean temp = ListingDAO.getMostViewedListing();
             DecimalFormat formatUSD = new DecimalFormat("#.##");
        
        
            return "<div align=\"left\" class=\"results\" >"+
                       "<a href=\"./viewlisting.xhtml?id="+temp.getListingID()+"\"></a>"+
                       "<b>"+temp.getTitle()+":</b><br/>"+
                       "Price Per Acre: $"+formatUSD.format(temp.getPrice())+"<br/>"+
                       "Property Tax: $"+formatUSD.format(temp.getTax())+"<br/>"+
                       "Listing Date: "+temp.getListingDate()+"<br/>"+
                       "</div><br/>";
    }
    
    //search function via AJAX
    public void search(AjaxBehaviorEvent event) { 
       searchResults = "Loading...";
       
        setResults(SearchDAO.searchProperties(theSearchModel));
       
       if(getResults() == null){
           searchResults = "Could not process request... Try again later.";
       }
       
       else
       {
           String str = "";
           ListingBean temp;
           DecimalFormat formatUSD = new DecimalFormat("#.##");
           
           theSearchModel.setResultsPerPage(4);
           int i = 0;
           while(i < theSearchModel.getResultsPerPage() && i < getResults().size())
           {
               temp = getResults().get(i);
               str+= "<div class=\"results\" >"+
                       "<a href=\"./viewlisting.xhtml?id="+temp.getListingID()+"\"></a>"+
                       "<b>"+temp.getTitle()+":</b><br/>"+
                       "Price Per Acre: $"+formatUSD.format(temp.getPrice())+"<br/>"+
                       "Property Tax: $"+formatUSD.format(temp.getTax())+"<br/>"+
                       "Listing Date: "+temp.getListingDate()+"<br/>"+
                       "</div><br/>";
               i++;
               theSearchModel.setSearchIndex(i);
           }

           if(str.equals("")){
               str = "No results found.";
               theSearchModel.setSearchIndex(0);
           }
           searchResults = str; 
       }
    }
    
    public void nextPage(AjaxBehaviorEvent event)
    {
        //search hasnt been ran yet, still null
        if(getResults() == null) 
            return;
        
        //see if current searching index is within legal bounds
        if(theSearchModel.getSearchIndex() >= getResults().size())
            return;
        
        String str = "";
        ListingBean temp;
        DecimalFormat formatUSD = new DecimalFormat("#.##");
        
        int index = theSearchModel.getSearchIndex();
        int bound = theSearchModel.getSearchIndex() + theSearchModel.getResultsPerPage();
        theSearchModel.setSearchIndex(bound);
        
        while(index < bound && index < getResults().size())
        {
            temp = getResults().get(index);
            str+= "<div class=\"results\" >"+
                    "<a href=\"./viewlisting.xhtml?id="+temp.getListingID()+"\"></a>"+
                    "<b>"+temp.getTitle()+":</b><br/>"+
                    "Price Per Acre: $"+formatUSD.format(temp.getPrice())+"<br/>"+
                    "Property Tax: $"+formatUSD.format(temp.getTax())+"<br/>"+
                    "Listing Date: "+temp.getListingDate()+"<br/>"+
                    "</div><br/>";
            
            index++;
        }
        
        if(str.equals("")){
            str = "No results found.";
        }
        
        searchResults = str;
    }
    
    public void prevPage(AjaxBehaviorEvent event)
    {
        //search hasnt been ran yet, still null
        if(getResults() == null) 
            return;
        
//        //see if current searching index is within legal bounds
//        if(theModel.getSearchIndex() <= 0)
//            return;
        
        String str = "";
        ListingBean temp;
        DecimalFormat formatUSD = new DecimalFormat("#.##");
        
        //calculate display bounds
        int index = theSearchModel.getSearchIndex() - (2*theSearchModel.getResultsPerPage());
        if(index <= 0) index = 0;
        
        int bound = index + theSearchModel.getResultsPerPage();
        
        while(index < bound && index < getResults().size())
        {
            temp = getResults().get(index);
            str+= "<div class=\"results\" >"+
                    "<a href=\"./viewlisting.xhtml?id="+temp.getListingID()+"\"></a>"+
                    "<b>"+temp.getTitle()+":</b><br/>"+
                    "Price Per Acre: $"+formatUSD.format(temp.getPrice())+"<br/>"+
                    "Property Tax: $"+formatUSD.format(temp.getTax())+"<br/>"+
                    "Listing Date: "+temp.getListingDate()+"<br/>"+
                    "</div><br/>";
            
            index++;
            theSearchModel.setSearchIndex(index);
        }
        
        if(str.equals("")){
            str = "No results found.";
        }
        
        searchResults = str;
    }

    public void changeViewListingID(String viewListingID) {
        this.viewListingID = viewListingID;
    }
    
    public String viewListing()
    {
        ListingBean listingInfo = ListingDAO.getListing(viewListingID);
        
        if(listingInfo == null)
            return "<div align =\"center\"> We cannot service that request at this time - please try again. </div>"; 
        
        PropertyBean propertyInfo = PropertyDAO.getListing(Integer.toString(listingInfo.getPropertyID()));
    
        if(propertyInfo == null)
            return "<div align =\"center\"> We cannot service that request at this time - please try again. </div>";
        
        //increase viewcount by one
        ListingDAO.incrementViewCount(listingInfo.getListingID());
        String str  
                = "<div class=\"results\">"
                + "<font size = 5><u>" + listingInfo.getTitle() + "</u></font><br/>"
                + "<font size = 3>View Count: " + listingInfo.getViewCount() + "<br/>"
                + "<a class=\"addtocart\" href=\"./addtocart.xhtml?id="+getListingID()+"\">Add To Cart</a><br/>" 
                + "<font size = 2 color = \"grey\">" + listingInfo.getListingDate() + "</font><br/><br/>"
                + "<b>&#215; Price:</b> $" + listingInfo.getPrice() + "<br/>"
                + "<b>&#215; Property Tax:</b> $" + listingInfo.getTax() + "<br/><br/>"
                
                + "<font size = 4><u>Property Information</u></font><br/>"
                + "<b>&#215; Total Acreage:</b> " + propertyInfo.getPropertySize() + "<br/>"
                + "<b>&#215; Cropping Acreage:</b> " + propertyInfo.getCroppingSize() + "<br/>"
                + "<b>&#215; Zoning Type:</b> " + propertyInfo.getZoningType() + "<br/>"
                + "<b>&#215; Buildings:</b> " + propertyInfo.getBuildings() + "<br/>"
                + "<b>&#215; Soil Types:</b> " + propertyInfo.getSoilTypes() + "<br/>"
                + "<b>&#215; Avg. Productivity:</b> " + propertyInfo.getAvgProductivity() + "<br/><br/>"
                
                + "<font size = 4><u>Location Information</u></font><br/>"
                + "<b>&#215; Street Address:</b> " + propertyInfo.getAddress() + "<br/>"
                + "<b>&#215; County:</b> " + propertyInfo.getCounty() + "<br/>"
                + "<b>&#215; City:</b> " + propertyInfo.getCity() + "<br/>"
                + "<b>&#215; State:</b> " + propertyInfo.getState() + "<br/>"
                + "<b>&#215; Zipcode:</b> " + propertyInfo.getZipcode() + "<br/><br/>";
                
        str += "<div align=\"center\"><img src = \"./images/"+propertyInfo.getPictureURL()+"\"></img></div>"
                + "</div>";  
        
        try
        {
            String map = getDirectionsByCityState(propertyInfo.getCity(), propertyInfo.getState(), propertyInfo.getCity(), propertyInfo.getState());
            str+="<div align=\"center\">" + map 
                    +"</div><br/>";
        }
        catch(com.sun.xml.ws.fault.ServerSOAPFaultException e)
        {
             return str;
        }
    
        try
        {
            SearchResult sr = searchByAddress(propertyInfo.getAddress(), propertyInfo.getZipcode());
            str += "<font size = 4><u>Zillow Information</u></font><br/>"
            + "<b>&#215; Zpid:</b> " + sr.getZpid() +"<br/>"
            + "<b>&#215; Zillow information: </b><a href=\"" + sr.getHomeInformationLink() + "\">Home Information Link</a><br/>"
            + "<b>&#215 Other homes in the area:</b> <a href=\"" + sr.getSimilarHomesLink() + "\">Click to view homes in area</a><br/>";
        }
        catch(com.sun.xml.ws.fault.ServerSOAPFaultException e)
        {
            return str;
        }
               
        return str;
    }
    
    public ListingBean getListingID()
    {
        int i = 0;
        boolean found = false;
        for(; i <getResults().size() &&!found; i++)
        {
            if(getResults().get(i).getListingID() == Integer.parseInt(viewListingID))
            {
                found = true;
            }
        }
        i--;
       return getResults().get(i);
    }

    public ArrayList<ListingBean> getResults() {
        if(results == null)
        {
            setResults(SearchDAO.searchProperties(theSearchModel));
        }
        return results;
    }

    public void setResults(ArrayList<ListingBean> results) {
        this.results = results;
    }

    private SearchResult searchByAddress(java.lang.String inputAddress, java.lang.String cityCommaStateOrZipcode) {
        org.me.isuzillow.ISUZillowWebService port = service.getISUZillowWebServicePort();
        return port.searchByAddress(inputAddress, cityCommaStateOrZipcode);
    }

    private String getDirectionsByCityState(java.lang.String startLocationCity, java.lang.String startLocationState, java.lang.String endLocationCity, java.lang.String endLocationState) {
        isu.ISUGoogleMaps port = service_1.getISUGoogleMapsPort();
        return port.getDirectionsByCityState(startLocationCity, startLocationState, endLocationCity, endLocationState);
    }

 
}

  

   