/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author bmsalm
 */
public class ListingBean 
{
    //IDs
    private int listingID;
    private int propertyID;
    private String ownerID;
    
    //Listing info
    private String title;
    private double price;
    private double tax;
    private Timestamp listingDate;
    private int viewCount;

    public ListingBean ()
    {
//        //assigned fields
//        listingID = -1;
//        propertyID = -1;
//        ownerID = "";
//        listingDate = null;
//        
//        //entered fields
//        title = "";
//        price = -1;
//        tax = -1;
        
    }
    
    //getters
    public int getListingID() {
        return listingID;
    }
    public int getPropertyID() {
        return propertyID;
    }
    public String getOwnerID() {
        return ownerID;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public double getTax() {
        return tax;
    }
    public Timestamp getListingDate() {
        return listingDate;
    }

    //setters
    public void setListingID(int listingID) {
        this.listingID = listingID;
    }
    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }
    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public void setListingDate(Timestamp listingDate) {
        this.listingDate = listingDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
