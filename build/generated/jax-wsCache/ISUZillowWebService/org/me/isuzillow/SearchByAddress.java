
package org.me.isuzillow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchByAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchByAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityCommaStateOrZipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchByAddress", propOrder = {
    "inputAddress",
    "cityCommaStateOrZipcode"
})
public class SearchByAddress {

    protected String inputAddress;
    protected String cityCommaStateOrZipcode;

    /**
     * Gets the value of the inputAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputAddress() {
        return inputAddress;
    }

    /**
     * Sets the value of the inputAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputAddress(String value) {
        this.inputAddress = value;
    }

    /**
     * Gets the value of the cityCommaStateOrZipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCommaStateOrZipcode() {
        return cityCommaStateOrZipcode;
    }

    /**
     * Sets the value of the cityCommaStateOrZipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCommaStateOrZipcode(String value) {
        this.cityCommaStateOrZipcode = value;
    }

}
