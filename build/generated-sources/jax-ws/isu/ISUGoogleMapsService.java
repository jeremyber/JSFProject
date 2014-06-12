
package isu;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ISUGoogleMapsService", targetNamespace = "http://ISU/", wsdlLocation = "http://gfish.it.ilstu.edu:8080/ISUGoogleMaps/ISUGoogleMapsService?wsdl")
public class ISUGoogleMapsService
    extends Service
{

    private final static URL ISUGOOGLEMAPSSERVICE_WSDL_LOCATION;
    private final static WebServiceException ISUGOOGLEMAPSSERVICE_EXCEPTION;
    private final static QName ISUGOOGLEMAPSSERVICE_QNAME = new QName("http://ISU/", "ISUGoogleMapsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://gfish.it.ilstu.edu:8080/ISUGoogleMaps/ISUGoogleMapsService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISUGOOGLEMAPSSERVICE_WSDL_LOCATION = url;
        ISUGOOGLEMAPSSERVICE_EXCEPTION = e;
    }

    public ISUGoogleMapsService() {
        super(__getWsdlLocation(), ISUGOOGLEMAPSSERVICE_QNAME);
    }

    public ISUGoogleMapsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISUGOOGLEMAPSSERVICE_QNAME, features);
    }

    public ISUGoogleMapsService(URL wsdlLocation) {
        super(wsdlLocation, ISUGOOGLEMAPSSERVICE_QNAME);
    }

    public ISUGoogleMapsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISUGOOGLEMAPSSERVICE_QNAME, features);
    }

    public ISUGoogleMapsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ISUGoogleMapsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ISUGoogleMaps
     */
    @WebEndpoint(name = "ISUGoogleMapsPort")
    public ISUGoogleMaps getISUGoogleMapsPort() {
        return super.getPort(new QName("http://ISU/", "ISUGoogleMapsPort"), ISUGoogleMaps.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISUGoogleMaps
     */
    @WebEndpoint(name = "ISUGoogleMapsPort")
    public ISUGoogleMaps getISUGoogleMapsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ISU/", "ISUGoogleMapsPort"), ISUGoogleMaps.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISUGOOGLEMAPSSERVICE_EXCEPTION!= null) {
            throw ISUGOOGLEMAPSSERVICE_EXCEPTION;
        }
        return ISUGOOGLEMAPSSERVICE_WSDL_LOCATION;
    }

}