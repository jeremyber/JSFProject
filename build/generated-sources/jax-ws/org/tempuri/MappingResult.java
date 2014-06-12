
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappingResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}SIWsResult">
 *       &lt;sequence>
 *         &lt;element name="MapImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingResult", propOrder = {
    "mapImage"
})
public class MappingResult
    extends SIWsResult
{

    @XmlElement(name = "MapImage")
    protected byte[] mapImage;

    /**
     * Gets the value of the mapImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMapImage() {
        return mapImage;
    }

    /**
     * Sets the value of the mapImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMapImage(byte[] value) {
        this.mapImage = value;
    }

}
