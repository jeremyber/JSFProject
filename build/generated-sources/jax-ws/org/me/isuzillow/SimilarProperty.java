
package org.me.isuzillow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for similarProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="similarProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparableScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="propertyInformation" type="{http://ISUZillow.me.org/}propertyInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "similarProperty", propOrder = {
    "comparableScore",
    "propertyInformation"
})
public class SimilarProperty {

    protected double comparableScore;
    protected PropertyInformation propertyInformation;

    /**
     * Gets the value of the comparableScore property.
     * 
     */
    public double getComparableScore() {
        return comparableScore;
    }

    /**
     * Sets the value of the comparableScore property.
     * 
     */
    public void setComparableScore(double value) {
        this.comparableScore = value;
    }

    /**
     * Gets the value of the propertyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInformation }
     *     
     */
    public PropertyInformation getPropertyInformation() {
        return propertyInformation;
    }

    /**
     * Sets the value of the propertyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInformation }
     *     
     */
    public void setPropertyInformation(PropertyInformation value) {
        this.propertyInformation = value;
    }

}
