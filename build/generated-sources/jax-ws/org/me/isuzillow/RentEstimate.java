
package org.me.isuzillow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rentEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rentEstimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rentAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valuationLow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valuationHigh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rentEstimate", propOrder = {
    "rentAmount",
    "lastUpdated",
    "valuationLow",
    "valuationHigh"
})
public class RentEstimate {

    protected int rentAmount;
    protected String lastUpdated;
    protected int valuationLow;
    protected int valuationHigh;

    /**
     * Gets the value of the rentAmount property.
     * 
     */
    public int getRentAmount() {
        return rentAmount;
    }

    /**
     * Sets the value of the rentAmount property.
     * 
     */
    public void setRentAmount(int value) {
        this.rentAmount = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdated(String value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the valuationLow property.
     * 
     */
    public int getValuationLow() {
        return valuationLow;
    }

    /**
     * Sets the value of the valuationLow property.
     * 
     */
    public void setValuationLow(int value) {
        this.valuationLow = value;
    }

    /**
     * Gets the value of the valuationHigh property.
     * 
     */
    public int getValuationHigh() {
        return valuationHigh;
    }

    /**
     * Sets the value of the valuationHigh property.
     * 
     */
    public void setValuationHigh(int value) {
        this.valuationHigh = value;
    }

}
