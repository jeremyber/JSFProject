
package isu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDirectionsByLatLong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDirectionsByLatLong">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartLocationLat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="StartLocationLong" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EndLocationLat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EndLocationLong" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDirectionsByLatLong", propOrder = {
    "startLocationLat",
    "startLocationLong",
    "endLocationLat",
    "endLocationLong"
})
public class GetDirectionsByLatLong {

    @XmlElement(name = "StartLocationLat")
    protected double startLocationLat;
    @XmlElement(name = "StartLocationLong")
    protected double startLocationLong;
    @XmlElement(name = "EndLocationLat")
    protected double endLocationLat;
    @XmlElement(name = "EndLocationLong")
    protected double endLocationLong;

    /**
     * Gets the value of the startLocationLat property.
     * 
     */
    public double getStartLocationLat() {
        return startLocationLat;
    }

    /**
     * Sets the value of the startLocationLat property.
     * 
     */
    public void setStartLocationLat(double value) {
        this.startLocationLat = value;
    }

    /**
     * Gets the value of the startLocationLong property.
     * 
     */
    public double getStartLocationLong() {
        return startLocationLong;
    }

    /**
     * Sets the value of the startLocationLong property.
     * 
     */
    public void setStartLocationLong(double value) {
        this.startLocationLong = value;
    }

    /**
     * Gets the value of the endLocationLat property.
     * 
     */
    public double getEndLocationLat() {
        return endLocationLat;
    }

    /**
     * Sets the value of the endLocationLat property.
     * 
     */
    public void setEndLocationLat(double value) {
        this.endLocationLat = value;
    }

    /**
     * Gets the value of the endLocationLong property.
     * 
     */
    public double getEndLocationLong() {
        return endLocationLong;
    }

    /**
     * Sets the value of the endLocationLong property.
     * 
     */
    public void setEndLocationLong(double value) {
        this.endLocationLong = value;
    }

}
