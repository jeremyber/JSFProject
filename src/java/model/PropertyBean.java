/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.servlet.http.Part;

/**
 *
 * @author bmsalm
 */
@ManagedBean
@ViewScoped 
public class PropertyBean 
{
    //ID
    private int propertyID;
    private String ownerID;    //user who owns this property
    
    //location information
    private String address;
    private String county;  
    private String township; 
    private String city;
    private String state;
    private String zipcode;
    
    //property information
    private String propertyName;    //property name 
    private String propertySize;    //total property size
    private String croppingSize;    //area intended for crops
    private String zoningType;      //zoning ordinance 
    private String buildings;       //buildings on the land
    private String soilTypes;       //perdominent soil types
    private String avgProductivity; //Productivity Index Average:  Bulletin 811 
    private String legalDescription;
    private String pictureURL;
    private Part pictureFile;
    

//    public PropertyBean()
//    {
//        //assigned fields 
//        propertyID = -1;
//        ownerID = "";    
//
//        //entered fields
//        propertyName = "";   
//        propertySize = "";  
//        croppingSize = ""; 
//        zoningType = "";      
//        buildings = "";      
//        soilTypes = "";       
//        avgProductivity = ""; 
//        legalDescription = "";
//        pictureURL = ""
//    
//        address = "";
//        county = "";  
//        township = ""; 
//        city = "";
//        state = "";
//        zipcode = "";
//
//        
//    }
    
    
    //getters
    public String getCounty() {
        return county;
    }
    public String getTownship() {
        return township;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZipcode() {
        return zipcode;
    }
    public String getPropertySize() {
        return propertySize;
    }
    public String getCroppingSize() {
        return croppingSize;
    }
    public String getZoningType() {
        return zoningType;
    }
    public String getBuildings() {
        return buildings;
    }
    public String getSoilTypes() {
        return soilTypes;
    }
    public String getAvgProductivity() {
        return avgProductivity;
    }
    public String getLegalDescription() {
        return legalDescription;
    }
    
     public String getPropertyName() {
        return propertyName;
    }
    public int getPropertyID() {
        return propertyID;
    }
    public String getOwnerID() {
        return ownerID;
    }

    
    //setters
    public void setCounty(String county) {
        this.county = county;
    }
    public void setTownship(String township) {
        this.township = township;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public void setPropertySize(String propertySize) {
        this.propertySize = propertySize;
    }
    public void setCroppingSize(String croppingSize) {
        this.croppingSize = croppingSize;
    }
    public void setZoningType(String zoningType) {
        this.zoningType = zoningType;
    }
    public void setBuildings(String buildings) {
        this.buildings = buildings;
    }
    public void setSoilTypes(String soilTypes) {
        this.soilTypes = soilTypes;
    }
    public void setAvgProductivity(String avgProductivity) {
        this.avgProductivity = avgProductivity;
    }
    public void setLegalDescription(String legalDescription) {
        this.legalDescription = legalDescription;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }
    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) 
    {
        this.pictureURL = pictureURL;
    }

    public Part getPictureFile() {
        return pictureFile;
    }

    public void setPictureFile(Part pictureFile) 
    {
        this.pictureFile = pictureFile;
        this.pictureURL = pictureFile.getSubmittedFileName();
        
    }
}
