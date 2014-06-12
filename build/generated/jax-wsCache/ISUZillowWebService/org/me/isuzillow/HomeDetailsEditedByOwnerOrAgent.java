
package org.me.isuzillow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for homeDetailsEditedByOwnerOrAgent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="homeDetailsEditedByOwnerOrAgent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zpid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageViewCountMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageViewCountAllTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="homeInformationLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://ISUZillow.me.org/}address" minOccurs="0"/>
 *         &lt;element name="editedFacts" type="{http://ISUZillow.me.org/}editedFacts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "homeDetailsEditedByOwnerOrAgent", propOrder = {
    "zpid",
    "pageViewCountMonth",
    "pageViewCountAllTime",
    "homeInformationLink",
    "address",
    "editedFacts"
})
public class HomeDetailsEditedByOwnerOrAgent {

    protected int zpid;
    protected int pageViewCountMonth;
    protected int pageViewCountAllTime;
    protected String homeInformationLink;
    protected Address address;
    protected EditedFacts editedFacts;

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
     * Gets the value of the pageViewCountMonth property.
     * 
     */
    public int getPageViewCountMonth() {
        return pageViewCountMonth;
    }

    /**
     * Sets the value of the pageViewCountMonth property.
     * 
     */
    public void setPageViewCountMonth(int value) {
        this.pageViewCountMonth = value;
    }

    /**
     * Gets the value of the pageViewCountAllTime property.
     * 
     */
    public int getPageViewCountAllTime() {
        return pageViewCountAllTime;
    }

    /**
     * Sets the value of the pageViewCountAllTime property.
     * 
     */
    public void setPageViewCountAllTime(int value) {
        this.pageViewCountAllTime = value;
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
     * Gets the value of the editedFacts property.
     * 
     * @return
     *     possible object is
     *     {@link EditedFacts }
     *     
     */
    public EditedFacts getEditedFacts() {
        return editedFacts;
    }

    /**
     * Sets the value of the editedFacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditedFacts }
     *     
     */
    public void setEditedFacts(EditedFacts value) {
        this.editedFacts = value;
    }

}
