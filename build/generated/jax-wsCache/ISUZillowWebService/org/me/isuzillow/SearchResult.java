
package org.me.isuzillow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zpid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="homeInformationLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="similarHomesLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fipsCounty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="homeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAssessmentYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taxAssessment" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="zestimate" type="{http://ISUZillow.me.org/}zestimate" minOccurs="0"/>
 *         &lt;element name="region" type="{http://ISUZillow.me.org/}region" minOccurs="0"/>
 *         &lt;element name="address" type="{http://ISUZillow.me.org/}address" minOccurs="0"/>
 *         &lt;element name="rentEstimate" type="{http://ISUZillow.me.org/}rentEstimate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchResult", propOrder = {
    "zpid",
    "homeInformationLink",
    "similarHomesLink",
    "fipsCounty",
    "homeType",
    "taxAssessmentYear",
    "taxAssessment",
    "zestimate",
    "region",
    "address",
    "rentEstimate"
})
public class SearchResult {

    protected int zpid;
    protected String homeInformationLink;
    protected String similarHomesLink;
    protected int fipsCounty;
    protected String homeType;
    protected int taxAssessmentYear;
    protected double taxAssessment;
    protected Zestimate zestimate;
    protected Region region;
    protected Address address;
    protected RentEstimate rentEstimate;

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
     * Gets the value of the similarHomesLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimilarHomesLink() {
        return similarHomesLink;
    }

    /**
     * Sets the value of the similarHomesLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimilarHomesLink(String value) {
        this.similarHomesLink = value;
    }

    /**
     * Gets the value of the fipsCounty property.
     * 
     */
    public int getFipsCounty() {
        return fipsCounty;
    }

    /**
     * Sets the value of the fipsCounty property.
     * 
     */
    public void setFipsCounty(int value) {
        this.fipsCounty = value;
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
     * Gets the value of the rentEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link RentEstimate }
     *     
     */
    public RentEstimate getRentEstimate() {
        return rentEstimate;
    }

    /**
     * Sets the value of the rentEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentEstimate }
     *     
     */
    public void setRentEstimate(RentEstimate value) {
        this.rentEstimate = value;
    }

}
