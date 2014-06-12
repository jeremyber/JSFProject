
package isu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the isu package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDirectionsByCityStateResponse_QNAME = new QName("http://ISU/", "getDirectionsByCityStateResponse");
    private final static QName _GetDirectionsByLatLong_QNAME = new QName("http://ISU/", "getDirectionsByLatLong");
    private final static QName _GetDirectionsByCityState_QNAME = new QName("http://ISU/", "getDirectionsByCityState");
    private final static QName _GetDirectionsByLatLongResponse_QNAME = new QName("http://ISU/", "getDirectionsByLatLongResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: isu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDirectionsByLatLongResponse }
     * 
     */
    public GetDirectionsByLatLongResponse createGetDirectionsByLatLongResponse() {
        return new GetDirectionsByLatLongResponse();
    }

    /**
     * Create an instance of {@link GetDirectionsByCityState }
     * 
     */
    public GetDirectionsByCityState createGetDirectionsByCityState() {
        return new GetDirectionsByCityState();
    }

    /**
     * Create an instance of {@link GetDirectionsByLatLong }
     * 
     */
    public GetDirectionsByLatLong createGetDirectionsByLatLong() {
        return new GetDirectionsByLatLong();
    }

    /**
     * Create an instance of {@link GetDirectionsByCityStateResponse }
     * 
     */
    public GetDirectionsByCityStateResponse createGetDirectionsByCityStateResponse() {
        return new GetDirectionsByCityStateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirectionsByCityStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISU/", name = "getDirectionsByCityStateResponse")
    public JAXBElement<GetDirectionsByCityStateResponse> createGetDirectionsByCityStateResponse(GetDirectionsByCityStateResponse value) {
        return new JAXBElement<GetDirectionsByCityStateResponse>(_GetDirectionsByCityStateResponse_QNAME, GetDirectionsByCityStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirectionsByLatLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISU/", name = "getDirectionsByLatLong")
    public JAXBElement<GetDirectionsByLatLong> createGetDirectionsByLatLong(GetDirectionsByLatLong value) {
        return new JAXBElement<GetDirectionsByLatLong>(_GetDirectionsByLatLong_QNAME, GetDirectionsByLatLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirectionsByCityState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISU/", name = "getDirectionsByCityState")
    public JAXBElement<GetDirectionsByCityState> createGetDirectionsByCityState(GetDirectionsByCityState value) {
        return new JAXBElement<GetDirectionsByCityState>(_GetDirectionsByCityState_QNAME, GetDirectionsByCityState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirectionsByLatLongResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISU/", name = "getDirectionsByLatLongResponse")
    public JAXBElement<GetDirectionsByLatLongResponse> createGetDirectionsByLatLongResponse(GetDirectionsByLatLongResponse value) {
        return new JAXBElement<GetDirectionsByLatLongResponse>(_GetDirectionsByLatLongResponse_QNAME, GetDirectionsByLatLongResponse.class, null, value);
    }

}
