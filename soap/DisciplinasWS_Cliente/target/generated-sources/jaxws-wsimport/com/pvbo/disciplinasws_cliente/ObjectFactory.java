
package com.pvbo.disciplinasws_cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pvbo.disciplinasws_cliente package. 
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

    private final static QName _GetTemaResponse_QNAME = new QName("http://disciplinasws.pvbo.com/", "GetTemaResponse");
    private final static QName _GetModulosTema_QNAME = new QName("http://disciplinasws.pvbo.com/", "GetModulosTema");
    private final static QName _GetModulosTemaResponse_QNAME = new QName("http://disciplinasws.pvbo.com/", "GetModulosTemaResponse");
    private final static QName _GetTema_QNAME = new QName("http://disciplinasws.pvbo.com/", "GetTema");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pvbo.disciplinasws_cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTema }
     * 
     */
    public GetTema createGetTema() {
        return new GetTema();
    }

    /**
     * Create an instance of {@link GetModulosTemaResponse }
     * 
     */
    public GetModulosTemaResponse createGetModulosTemaResponse() {
        return new GetModulosTemaResponse();
    }

    /**
     * Create an instance of {@link GetModulosTema }
     * 
     */
    public GetModulosTema createGetModulosTema() {
        return new GetModulosTema();
    }

    /**
     * Create an instance of {@link GetTemaResponse }
     * 
     */
    public GetTemaResponse createGetTemaResponse() {
        return new GetTemaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://disciplinasws.pvbo.com/", name = "GetTemaResponse")
    public JAXBElement<GetTemaResponse> createGetTemaResponse(GetTemaResponse value) {
        return new JAXBElement<GetTemaResponse>(_GetTemaResponse_QNAME, GetTemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModulosTema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://disciplinasws.pvbo.com/", name = "GetModulosTema")
    public JAXBElement<GetModulosTema> createGetModulosTema(GetModulosTema value) {
        return new JAXBElement<GetModulosTema>(_GetModulosTema_QNAME, GetModulosTema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModulosTemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://disciplinasws.pvbo.com/", name = "GetModulosTemaResponse")
    public JAXBElement<GetModulosTemaResponse> createGetModulosTemaResponse(GetModulosTemaResponse value) {
        return new JAXBElement<GetModulosTemaResponse>(_GetModulosTemaResponse_QNAME, GetModulosTemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://disciplinasws.pvbo.com/", name = "GetTema")
    public JAXBElement<GetTema> createGetTema(GetTema value) {
        return new JAXBElement<GetTema>(_GetTema_QNAME, GetTema.class, null, value);
    }

}
