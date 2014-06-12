
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MappingSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.strikeiron.ws.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface MappingSoap {


    /**
     * Generates a map based on a specified address with specified zoom/scale properties.
     * 
     * @param streetAddress
     * @param postalCode
     * @param stateOrProvince
     * @param mapSize
     * @param country
     * @param city
     * @return
     *     returns org.tempuri.MappingOutput
     */
    @WebMethod(operationName = "GetMap", action = "http://tempuri.org/GetMap")
    @WebResult(name = "GetMapResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMap", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMap")
    @ResponseWrapper(localName = "GetMapResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMapResponse")
    public MappingOutput getMap(
        @WebParam(name = "StreetAddress", targetNamespace = "http://tempuri.org/")
        String streetAddress,
        @WebParam(name = "City", targetNamespace = "http://tempuri.org/")
        String city,
        @WebParam(name = "StateOrProvince", targetNamespace = "http://tempuri.org/")
        String stateOrProvince,
        @WebParam(name = "PostalCode", targetNamespace = "http://tempuri.org/")
        String postalCode,
        @WebParam(name = "Country", targetNamespace = "http://tempuri.org/")
        String country,
        @WebParam(name = "MapSize", targetNamespace = "http://tempuri.org/")
        String mapSize);

    /**
     * Get all statuses this service might return
     * 
     * @return
     *     returns org.tempuri.StatusCodeOutput
     */
    @WebMethod(operationName = "GetAllStatuses", action = "http://tempuri.org/GetAllStatuses")
    @WebResult(name = "GetAllStatusesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAllStatuses", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllStatuses")
    @ResponseWrapper(localName = "GetAllStatusesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllStatusesResponse")
    public StatusCodeOutput getAllStatuses();

    /**
     * Get information about the web service
     * 
     * @return
     *     returns org.tempuri.ServiceInfoOutput
     */
    @WebMethod(operationName = "GetServiceInfo", action = "http://tempuri.org/GetServiceInfo")
    @WebResult(name = "GetServiceInfoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetServiceInfo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetServiceInfo")
    @ResponseWrapper(localName = "GetServiceInfoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetServiceInfoResponse")
    public ServiceInfoOutput getServiceInfo();

    /**
     * 
     */
    @WebMethod(operationName = "GetRemainingHits", action = "http://ws.strikeiron.com/StrikeIron/MapQuestBasicMap/Mapping/GetRemainingHits")
    @RequestWrapper(localName = "GetRemainingHits", targetNamespace = "http://ws.strikeiron.com", className = "com.strikeiron.ws.GetRemainingHits")
    @ResponseWrapper(localName = "GetRemainingHitsResponse", targetNamespace = "http://ws.strikeiron.com", className = "com.strikeiron.ws.GetRemainingHitsResponse")
    public void getRemainingHits();

}