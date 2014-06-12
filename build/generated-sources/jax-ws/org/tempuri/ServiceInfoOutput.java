
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInfoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInfoOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}ServiceOutput">
 *       &lt;sequence>
 *         &lt;element name="ServiceResult" type="{http://tempuri.org/}SIServiceInfoResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfoOutput", propOrder = {
    "serviceResult"
})
public class ServiceInfoOutput
    extends ServiceOutput
{

    @XmlElement(name = "ServiceResult")
    protected SIServiceInfoResult serviceResult;

    /**
     * Gets the value of the serviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIServiceInfoResult }
     *     
     */
    public SIServiceInfoResult getServiceResult() {
        return serviceResult;
    }

    /**
     * Sets the value of the serviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIServiceInfoResult }
     *     
     */
    public void setServiceResult(SIServiceInfoResult value) {
        this.serviceResult = value;
    }

}
