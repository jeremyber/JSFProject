
package org.me.isuzillow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDetailsEditedByOwnerOrAgent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDetailsEditedByOwnerOrAgent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zpid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDetailsEditedByOwnerOrAgent", propOrder = {
    "zpid"
})
public class GetDetailsEditedByOwnerOrAgent {

    protected int zpid;

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

}
