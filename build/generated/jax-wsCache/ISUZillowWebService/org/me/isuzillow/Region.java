
package org.me.isuzillow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for region complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="region">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionOverviewLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionForSaleByOwnerLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionForSaleLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "region", propOrder = {
    "regionName",
    "regionType",
    "regionOverviewLink",
    "regionForSaleByOwnerLink",
    "regionForSaleLink",
    "regionID"
})
public class Region {

    protected String regionName;
    protected String regionType;
    protected String regionOverviewLink;
    protected String regionForSaleByOwnerLink;
    protected String regionForSaleLink;
    protected int regionID;

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the regionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionType() {
        return regionType;
    }

    /**
     * Sets the value of the regionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionType(String value) {
        this.regionType = value;
    }

    /**
     * Gets the value of the regionOverviewLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionOverviewLink() {
        return regionOverviewLink;
    }

    /**
     * Sets the value of the regionOverviewLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionOverviewLink(String value) {
        this.regionOverviewLink = value;
    }

    /**
     * Gets the value of the regionForSaleByOwnerLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionForSaleByOwnerLink() {
        return regionForSaleByOwnerLink;
    }

    /**
     * Sets the value of the regionForSaleByOwnerLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionForSaleByOwnerLink(String value) {
        this.regionForSaleByOwnerLink = value;
    }

    /**
     * Gets the value of the regionForSaleLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionForSaleLink() {
        return regionForSaleLink;
    }

    /**
     * Sets the value of the regionForSaleLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionForSaleLink(String value) {
        this.regionForSaleLink = value;
    }

    /**
     * Gets the value of the regionID property.
     * 
     */
    public int getRegionID() {
        return regionID;
    }

    /**
     * Sets the value of the regionID property.
     * 
     */
    public void setRegionID(int value) {
        this.regionID = value;
    }

}
