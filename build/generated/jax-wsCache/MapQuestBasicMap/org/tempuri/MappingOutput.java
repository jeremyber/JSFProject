
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappingOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappingOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}ServiceOutput">
 *       &lt;sequence>
 *         &lt;element name="Map" type="{http://tempuri.org/}MappingResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingOutput", propOrder = {
    "map"
})
public class MappingOutput
    extends ServiceOutput
{

    @XmlElement(name = "Map")
    protected MappingResult map;

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link MappingResult }
     *     
     */
    public MappingResult getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link MappingResult }
     *     
     */
    public void setMap(MappingResult value) {
        this.map = value;
    }

}
