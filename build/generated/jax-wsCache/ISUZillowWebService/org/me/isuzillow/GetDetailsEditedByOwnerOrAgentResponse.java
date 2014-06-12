
package org.me.isuzillow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDetailsEditedByOwnerOrAgentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDetailsEditedByOwnerOrAgentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ISUZillow.me.org/}homeDetailsEditedByOwnerOrAgent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDetailsEditedByOwnerOrAgentResponse", propOrder = {
    "_return"
})
public class GetDetailsEditedByOwnerOrAgentResponse {

    @XmlElement(name = "return")
    protected HomeDetailsEditedByOwnerOrAgent _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link HomeDetailsEditedByOwnerOrAgent }
     *     
     */
    public HomeDetailsEditedByOwnerOrAgent getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeDetailsEditedByOwnerOrAgent }
     *     
     */
    public void setReturn(HomeDetailsEditedByOwnerOrAgent value) {
        this._return = value;
    }

}
