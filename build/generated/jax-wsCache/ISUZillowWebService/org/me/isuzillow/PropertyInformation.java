
package org.me.isuzillow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zpid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="homeInformationLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAssessmentYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taxAssessment" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="yearBuilt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lotSizeSquareFoot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="finishedSquareFoot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfBathrooms" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numberOfBedrooms" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalRooms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastSoldDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastSoldPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="address" type="{http://ISUZillow.me.org/}address" minOccurs="0"/>
 *         &lt;element name="region" type="{http://ISUZillow.me.org/}region" minOccurs="0"/>
 *         &lt;element name="zestimate" type="{http://ISUZillow.me.org/}zestimate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyInformation", propOrder = {
    "zpid",
    "homeInformationLink",
    "taxAssessmentYear",
    "taxAssessment",
    "yearBuilt",
    "lotSizeSquareFoot",
    "finishedSquareFoot",
    "numberOfBathrooms",
    "numberOfBedrooms",
    "totalRooms",
    "lastSoldDate",
    "lastSoldPrice",
    "address",
    "region",
    "zestimate"
})
public class PropertyInformation {

    protected int zpid;
    protected String homeInformationLink;
    protected int taxAssessmentYear;
    protected double taxAssessment;
    protected int yearBuilt;
    protected int lotSizeSquareFoot;
    protected int finishedSquareFoot;
    protected double numberOfBathrooms;
    protected double numberOfBedrooms;
    protected String totalRooms;
    protected String lastSoldDate;
    protected int lastSoldPrice;
    protected Address address;
    protected Region region;
    protected Zestimate zestimate;

    /**
     * Gets the value of the zpid property.
     * 
     */
    public int getZpid() {
        return zpid;
    }

    /**
     * Sets the value of the zpid property.
     * 
     */
    public void setZpid(int value) {
        this.zpid = value;
    }

    /**
     * Gets the value of the homeInformationLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeInformationLink() {
        return homeInformationLink;
    }

    /**
     * Sets the value of the homeInformationLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeInformationLink(String value) {
        this.homeInformationLink = value;
    }

    /**
     * Gets the value of the taxAssessmentYear property.
     * 
     */
    public int getTaxAssessmentYear() {
        return taxAssessmentYear;
    }

    /**
     * Sets the value of the taxAssessmentYear property.
     * 
     */
    public void setTaxAssessmentYear(int value) {
        this.taxAssessmentYear = value;
    }

    /**
     * Gets the value of the taxAssessment property.
     * 
     */
    public double getTaxAssessment() {
        return taxAssessment;
    }

    /**
     * Sets the value of the taxAssessment property.
     * 
     */
    public void setTaxAssessment(double value) {
        this.taxAssessment = value;
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
     * Gets the value of the lastSoldDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSoldDate() {
        return lastSoldDate;
    }

    /**
     * Sets the value of the lastSoldDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSoldDate(String value) {
        this.lastSoldDate = value;
    }

    /**
     * Gets the value of the lastSoldPrice property.
     * 
     */
    public int getLastSoldPrice() {
        return lastSoldPrice;
    }

    /**
     * Sets the value of the lastSoldPrice property.
     * 
     */
    public void setLastSoldPrice(int value) {
        this.lastSoldPrice = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     * Gets the value of the zestimate property.
     * 
     * @return
     *     possible object is
     *     {@link Zestimate }
     *     
     */
    public Zestimate getZestimate() {
        return zestimate;
    }

    /**
     * Sets the value of the zestimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zestimate }
     *     
     */
    public void setZestimate(Zestimate value) {
        this.zestimate = value;
    }

}
