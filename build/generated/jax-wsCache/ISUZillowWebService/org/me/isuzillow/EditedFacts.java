
package org.me.isuzillow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editedFacts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editedFacts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfBathrooms" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numberOfBedrooms" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lotSizeSquareFoot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="finishedSquareFoot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yearBuilt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yearUpdated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfFloors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="homeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="basement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roofType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="view" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parkingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heatingSources" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heatingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appliances" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floorCovering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRooms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="neighborhood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementarySchool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleSchool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editedFacts", propOrder = {
    "numberOfBathrooms",
    "numberOfBedrooms",
    "lotSizeSquareFoot",
    "finishedSquareFoot",
    "yearBuilt",
    "yearUpdated",
    "numberOfFloors",
    "homeType",
    "basement",
    "roofType",
    "view",
    "parkingType",
    "heatingSources",
    "heatingSystem",
    "appliances",
    "floorCovering",
    "totalRooms",
    "homeDescription",
    "neighborhood",
    "schoolDistrict",
    "elementarySchool",
    "middleSchool"
})
public class EditedFacts {

    protected double numberOfBathrooms;
    protected double numberOfBedrooms;
    protected int lotSizeSquareFoot;
    protected int finishedSquareFoot;
    protected int yearBuilt;
    protected int yearUpdated;
    protected int numberOfFloors;
    protected String homeType;
    protected String basement;
    protected String roofType;
    protected String view;
    protected String parkingType;
    protected String heatingSources;
    protected String heatingSystem;
    protected String appliances;
    protected String floorCovering;
    protected String totalRooms;
    protected String homeDescription;
    protected String neighborhood;
    protected String schoolDistrict;
    protected String elementarySchool;
    protected String middleSchool;

    /**
     * Gets the value of the numberOfBathrooms property.
     * 
     */
    public double getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    /**
     * Sets the value of the numberOfBathrooms property.
     * 
     */
    public void setNumberOfBathrooms(double value) {
        this.numberOfBathrooms = value;
    }

    /**
     * Gets the value of the numberOfBedrooms property.
     * 
     */
    public double getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    /**
     * Sets the value of the numberOfBedrooms property.
     * 
     */
    public void setNumberOfBedrooms(double value) {
        this.numberOfBedrooms = value;
    }

    /**
     * Gets the value of the lotSizeSquareFoot property.
     * 
     */
    public int getLotSizeSquareFoot() {
        return lotSizeSquareFoot;
    }

    /**
     * Sets the value of the lotSizeSquareFoot property.
     * 
     */
    public void setLotSizeSquareFoot(int value) {
        this.lotSizeSquareFoot = value;
    }

    /**
     * Gets the value of the finishedSquareFoot property.
     * 
     */
    public int getFinishedSquareFoot() {
        return finishedSquareFoot;
    }

    /**
     * Sets the value of the finishedSquareFoot property.
     * 
     */
    public void setFinishedSquareFoot(int value) {
        this.finishedSquareFoot = value;
    }

    /**
     * Gets the value of the yearBuilt property.
     * 
     */
    public int getYearBuilt() {
        return yearBuilt;
    }

    /**
     * Sets the value of the yearBuilt property.
     * 
     */
    public void setYearBuilt(int value) {
        this.yearBuilt = value;
    }

    /**
     * Gets the value of the yearUpdated property.
     * 
     */
    public int getYearUpdated() {
        return yearUpdated;
    }

    /**
     * Sets the value of the yearUpdated property.
     * 
     */
    public void setYearUpdated(int value) {
        this.yearUpdated = value;
    }

    /**
     * Gets the value of the numberOfFloors property.
     * 
     */
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * Sets the value of the numberOfFloors property.
     * 
     */
    public void setNumberOfFloors(int value) {
        this.numberOfFloors = value;
    }

    /**
     * Gets the value of the homeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeType() {
        return homeType;
    }

    /**
     * Sets the value of the homeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeType(String value) {
        this.homeType = value;
    }

    /**
     * Gets the value of the basement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasement() {
        return basement;
    }

    /**
     * Sets the value of the basement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasement(String value) {
        this.basement = value;
    }

    /**
     * Gets the value of the roofType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoofType() {
        return roofType;
    }

    /**
     * Sets the value of the roofType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoofType(String value) {
        this.roofType = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setView(String value) {
        this.view = value;
    }

    /**
     * Gets the value of the parkingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingType() {
        return parkingType;
    }

    /**
     * Sets the value of the parkingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingType(String value) {
        this.parkingType = value;
    }

    /**
     * Gets the value of the heatingSources property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatingSources() {
        return heatingSources;
    }

    /**
     * Sets the value of the heatingSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingSources(String value) {
        this.heatingSources = value;
    }

    /**
     * Gets the value of the heatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatingSystem() {
        return heatingSystem;
    }

    /**
     * Sets the value of the heatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingSystem(String value) {
        this.heatingSystem = value;
    }

    /**
     * Gets the value of the appliances property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliances() {
        return appliances;
    }

    /**
     * Sets the value of the appliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliances(String value) {
        this.appliances = value;
    }

    /**
     * Gets the value of the floorCovering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorCovering() {
        return floorCovering;
    }

    /**
     * Sets the value of the floorCovering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorCovering(String value) {
        this.floorCovering = value;
    }

    /**
     * Gets the value of the totalRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRooms() {
        return totalRooms;
    }

    /**
     * Sets the value of the totalRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRooms(String value) {
        this.totalRooms = value;
    }

    /**
     * Gets the value of the homeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeDescription() {
        return homeDescription;
    }

    /**
     * Sets the value of the homeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeDescription(String value) {
        this.homeDescription = value;
    }

    /**
     * Gets the value of the neighborhood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * Sets the value of the neighborhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighborhood(String value) {
        this.neighborhood = value;
    }

    /**
     * Gets the value of the schoolDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrict() {
        return schoolDistrict;
    }

    /**
     * Sets the value of the schoolDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrict(String value) {
        this.schoolDistrict = value;
    }

    /**
     * Gets the value of the elementarySchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementarySchool() {
        return elementarySchool;
    }

    /**
     * Sets the value of the elementarySchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementarySchool(String value) {
        this.elementarySchool = value;
    }

    /**
     * Gets the value of the middleSchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleSchool() {
        return middleSchool;
    }

    /**
     * Sets the value of the middleSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleSchool(String value) {
        this.middleSchool = value;
    }

}
