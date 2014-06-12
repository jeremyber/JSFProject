
package org.me.isuzillow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.isuzillow package. 
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

    private final static QName _SearchByAddressResponse_QNAME = new QName("http://ISUZillow.me.org/", "searchByAddressResponse");
    private final static QName _NoUpdatedDetailsException_QNAME = new QName("http://ISUZillow.me.org/", "NoUpdatedDetailsException");
    private final static QName _SearchByAddress_QNAME = new QName("http://ISUZillow.me.org/", "searchByAddress");
    private final static QName _GetDetailsEditedByOwnerOrAgentResponse_QNAME = new QName("http://ISUZillow.me.org/", "getDetailsEditedByOwnerOrAgentResponse");
    private final static QName _GetSimilarProperties_QNAME = new QName("http://ISUZillow.me.org/", "getSimilarProperties");
    private final static QName _GetSimilarPropertiesResponse_QNAME = new QName("http://ISUZillow.me.org/", "getSimilarPropertiesResponse");
    private final static QName _GetDetailsEditedByOwnerOrAgent_QNAME = new QName("http://ISUZillow.me.org/", "getDetailsEditedByOwnerOrAgent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.isuzillow
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchByAddressResponse }
     * 
     */
    public SearchByAddressResponse createSearchByAddressResponse() {
        return new SearchByAddressResponse();
    }

    /**
     * Create an instance of {@link SearchByAddress }
     * 
     */
    public SearchByAddress createSearchByAddress() {
        return new SearchByAddress();
    }

    /**
     * Create an instance of {@link NoUpdatedDetailsException }
     * 
     */
    public NoUpdatedDetailsException createNoUpdatedDetailsException() {
        return new NoUpdatedDetailsException();
    }

    /**
     * Create an instance of {@link GetDetailsEditedByOwnerOrAgentResponse }
     * 
     */
    public GetDetailsEditedByOwnerOrAgentResponse createGetDetailsEditedByOwnerOrAgentResponse() {
        return new GetDetailsEditedByOwnerOrAgentResponse();
    }

    /**
     * Create an instance of {@link GetSimilarPropertiesResponse }
     * 
     */
    public GetSimilarPropertiesResponse createGetSimilarPropertiesResponse() {
        return new GetSimilarPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetSimilarProperties }
     * 
     */
    public GetSimilarProperties createGetSimilarProperties() {
        return new GetSimilarProperties();
    }

    /**
     * Create an instance of {@link GetDetailsEditedByOwnerOrAgent }
     * 
     */
    public GetDetailsEditedByOwnerOrAgent createGetDetailsEditedByOwnerOrAgent() {
        return new GetDetailsEditedByOwnerOrAgent();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link Zestimate }
     * 
     */
    public Zestimate createZestimate() {
        return new Zestimate();
    }

    /**
     * Create an instance of {@link SimilarPropertiesInformation }
     * 
     */
    public SimilarPropertiesInformation createSimilarPropertiesInformation() {
        return new SimilarPropertiesInformation();
    }

    /**
     * Create an instance of {@link RentEstimate }
     * 
     */
    public RentEstimate createRentEstimate() {
        return new RentEstimate();
    }

    /**
     * Create an instance of {@link HomeDetailsEditedByOwnerOrAgent }
     * 
     */
    public HomeDetailsEditedByOwnerOrAgent createHomeDetailsEditedByOwnerOrAgent() {
        return new HomeDetailsEditedByOwnerOrAgent();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link SimilarProperty }
     * 
     */
    public SimilarProperty createSimilarProperty() {
        return new SimilarProperty();
    }

    /**
     * Create an instance of {@link EditedFacts }
     * 
     */
    public EditedFacts createEditedFacts() {
        return new EditedFacts();
    }

    /**
     * Create an instance of {@link PropertyInformation }
     * 
     */
    public PropertyInformation createPropertyInformation() {
        return new PropertyInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISUZillow.me.org/", name = "searchByAddressResponse")
    public JAXBElement<SearchByAddressResponse> createSearchByAddressResponse(SearchByAddressResponse value) {
        return new JAXBElement<SearchByAddressResponse>(_SearchByAddressResponse_QNAME, SearchByAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoUpdatedDetailsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISUZillow.me.org/", name = "NoUpdatedDetailsException")
    public JAXBElement<NoUpdatedDetailsException> createNoUpdatedDetailsException(NoUpdatedDetailsException value) {
        return new JAXBElement<NoUpdatedDetailsException>(_NoUpdatedDetailsException_QNAME, NoUpdatedDetailsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISUZillow.me.org/", name = "searchByAddress")
    public JAXBElement<SearchByAddress> createSearchByAddress(SearchByAddress value) {
        return new JAXBElement<SearchByAddress>(_SearchByAddress_QNAME, SearchByAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailsEditedByOwnerOrAgentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISUZillow.me.org/", name = "getDetailsEditedByOwnerOrAgentResponse")
    public JAXBElement<GetDetailsEditedByOwnerOrAgentResponse> createGetDetailsEditedByOwnerOrAgentResponse(GetDetailsEditedByOwnerOrAgentResponse value) {
        return new JAXBElement<GetDetailsEditedByOwnerOrAgentResponse>(_GetDetailsEditedByOwnerOrAgentResponse_QNAME, GetDetailsEditedByOwnerOrAgentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimilarProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISUZillow.me.org/", name = "getSimilarProperties")
    public JAXBElement<GetSimilarProperties> createGetSimilarProperties(GetSimilarProperties value) {
        return new JAXBElement<GetSimilarProperties>(_GetSimilarProperties_QNAME, GetSimilarProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimilarPropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISUZillow.me.org/", name = "getSimilarPropertiesResponse")
    public JAXBElement<GetSimilarPropertiesResponse> createGetSimilarPropertiesResponse(GetSimilarPropertiesResponse value) {
        return new JAXBElement<GetSimilarPropertiesResponse>(_GetSimilarPropertiesResponse_QNAME, GetSimilarPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailsEditedByOwnerOrAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISUZillow.me.org/", name = "getDetailsEditedByOwnerOrAgent")
    public JAXBElement<GetDetailsEditedByOwnerOrAgent> createGetDetailsEditedByOwnerOrAgent(GetDetailsEditedByOwnerOrAgent value) {
        return new JAXBElement<GetDetailsEditedByOwnerOrAgent>(_GetDetailsEditedByOwnerOrAgent_QNAME, GetDetailsEditedByOwnerOrAgent.class, null, value);
    }

}
