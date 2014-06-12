
package isu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDirectionsByCityState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDirectionsByCityState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartLocationCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartLocationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndLocationCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndLocationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDirectionsByCityState", propOrder = {
    "startLocationCity",
    "startLocationState",
    "endLocationCity",
    "endLocationState"
})
public class GetDirectionsByCityState {

    @XmlElement(name = "StartLocationCity")
    protected String startLocationCity;
    @XmlElement(name = "StartLocationState")
    protected String startLocationState;
    @XmlElement(name = "EndLocationCity")
    protected String endLocationCity;
    @XmlElement(name = "EndLocationState")
    protected String endLocationState;

    /**
     * Gets the value of the startLocationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLocationCity() {
        return startLocationCity;
    }

    /**
     * Sets the value of the startLocationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLocationCity(String value) {
        this.startLocationCity = value;
    }

    /**
     * Gets the value of the startLocationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLocationState() {
        return startLocationState;
    }

    /**
     * Sets the value of the startLocationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLocationState(String value) {
        this.startLocationState = value;
    }

    /**
     * Gets the value of the endLocationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndLocationCity() {
        return endLocationCity;
    }

    /**
     * Sets the value of the endLocationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndLocationCity(String value) {
        this.endLocationCity = value;
    }

    /**
     * Gets the value of the endLocationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndLocationState() {
        return endLocationState;
    }

    /**
     * Sets the value of the endLocationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndLocationState(String value) {
        this.endLocationState = value;
    }

}
