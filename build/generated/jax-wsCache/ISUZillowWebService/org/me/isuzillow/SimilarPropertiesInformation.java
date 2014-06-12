
package org.me.isuzillow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for similarPropertiesInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="similarPropertiesInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="similarHomesLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalPropertyInformation" type="{http://ISUZillow.me.org/}propertyInformation" minOccurs="0"/>
 *         &lt;element name="similarProperties" type="{http://ISUZillow.me.org/}similarProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "similarPropertiesInformation", propOrder = {
    "similarHomesLink",
    "principalPropertyInformation",
    "similarProperties"
})
public class SimilarPropertiesInformation {

    protected String similarHomesLink;
    protected PropertyInformation principalPropertyInformation;
    @XmlElement(nillable = true)
    protected List<SimilarProperty> similarProperties;

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
     * Gets the value of the principalPropertyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInformation }
     *     
     */
    public PropertyInformation getPrincipalPropertyInformation() {
        return principalPropertyInformation;
    }

    /**
     * Sets the value of the principalPropertyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInformation }
     *     
     */
    public void setPrincipalPropertyInformation(PropertyInformation value) {
        this.principalPropertyInformation = value;
    }

    /**
     * Gets the value of the similarProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the similarProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimilarProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimilarProperty }
     * 
     * 
     */
    public List<SimilarProperty> getSimilarProperties() {
        if (similarProperties == null) {
            similarProperties = new ArrayList<SimilarProperty>();
        }
        return this.similarProperties;
    }

}
