
package org.me.isuzillow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zestimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zestimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueChangeLast30Days" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valuationLow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valuationHigh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="percentileValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zestimate", propOrder = {
    "saleAmount",
    "lastUpdated",
    "valueChangeLast30Days",
    "valuationLow",
    "valuationHigh",
    "percentileValue"
})
public class Zestimate {

    protected int saleAmount;
    protected String lastUpdated;
    protected int valueChangeLast30Days;
    protected int valuationLow;
    protected int valuationHigh;
    protected double percentileValue;

    /**
     * Gets the value of the saleAmount property.
     * 
     */
    public int getSaleAmount() {
        return saleAmount;
    }

    /**
     * Sets the value of the saleAmount property.
     * 
     */
    public void setSaleAmount(int value) {
        this.saleAmount = value;
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
     * Gets the value of the valueChangeLast30Days property.
     * 
     */
    public int getValueChangeLast30Days() {
        return valueChangeLast30Days;
    }

    /**
     * Sets the value of the valueChangeLast30Days property.
     * 
     */
    public void setValueChangeLast30Days(int value) {
        this.valueChangeLast30Days = value;
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

    /**
     * Gets the value of the percentileValue property.
     * 
     */
    public double getPercentileValue() {
        return percentileValue;
    }

    /**
     * Sets the value of the percentileValue property.
     * 
     */
    public void setPercentileValue(double value) {
        this.percentileValue = value;
    }

}
