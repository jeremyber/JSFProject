
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMapResult" type="{http://tempuri.org/}MappingOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMapResult"
})
@XmlRootElement(name = "GetMapResponse")
public class GetMapResponse {

    @XmlElement(name = "GetMapResult")
    protected MappingOutput getMapResult;

    /**
     * Gets the value of the getMapResult property.
     * 
     * @return
     *     possible object is
     *     {@link MappingOutput }
     *     
     */
    public MappingOutput getGetMapResult() {
        return getMapResult;
    }

    /**
     * Sets the value of the getMapResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MappingOutput }
     *     
     */
    public void setGetMapResult(MappingOutput value) {
        this.getMapResult = value;
    }

}
