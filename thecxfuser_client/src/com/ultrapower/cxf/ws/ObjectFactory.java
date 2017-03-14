
package com.ultrapower.cxf.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ultrapower.cxf.ws package. 
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

    private final static QName _SelectUserByIdResponse_QNAME = new QName("http://ws.cxf.ultrapower.com/", "selectUserByIdResponse");
    private final static QName _SelectUserById_QNAME = new QName("http://ws.cxf.ultrapower.com/", "selectUserById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ultrapower.cxf.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelectUserById }
     * 
     */
    public SelectUserById createSelectUserById() {
        return new SelectUserById();
    }

    /**
     * Create an instance of {@link SelectUserByIdResponse }
     * 
     */
    public SelectUserByIdResponse createSelectUserByIdResponse() {
        return new SelectUserByIdResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cxf.ultrapower.com/", name = "selectUserByIdResponse")
    public JAXBElement<SelectUserByIdResponse> createSelectUserByIdResponse(SelectUserByIdResponse value) {
        return new JAXBElement<SelectUserByIdResponse>(_SelectUserByIdResponse_QNAME, SelectUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cxf.ultrapower.com/", name = "selectUserById")
    public JAXBElement<SelectUserById> createSelectUserById(SelectUserById value) {
        return new JAXBElement<SelectUserById>(_SelectUserById_QNAME, SelectUserById.class, null, value);
    }

}
