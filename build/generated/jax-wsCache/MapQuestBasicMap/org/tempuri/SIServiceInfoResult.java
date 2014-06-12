
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIServiceInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIServiceInfoResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}SIWsResult">
 *       &lt;sequence>
 *         &lt;element name="ServiceInfo" type="{http://tempuri.org/}ArrayOfServiceInfoRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIServiceInfoResult", propOrder = {
    "serviceInfo"
})
public class SIServiceInfoResult
    extends SIWsResult
{

    @XmlElement(name = "ServiceInfo")
    protected ArrayOfServiceInfoRecord serviceInfo;

    /**
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceInfoRecord }
     *     
     */
    public ArrayOfServiceInfoRecord getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceInfoRecord }
     *     
     */
    public void setServiceInfo(ArrayOfServiceInfoRecord value) {
        this.serviceInfo = value;
    }

}
