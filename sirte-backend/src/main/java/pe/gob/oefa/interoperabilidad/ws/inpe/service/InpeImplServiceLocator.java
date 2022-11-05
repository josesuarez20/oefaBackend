/**
 * InpeImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.inpe.service;

import org.springframework.beans.factory.annotation.Value;

public class InpeImplServiceLocator extends org.apache.axis.client.Service implements pe.gob.oefa.interoperabilidad.ws.inpe.service.InpeImplService {

    public InpeImplServiceLocator() {
    }


    public InpeImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InpeImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InpeImplPort
    //@Value("${servicio.interoperabilidad.inpe}")
   	//private String interoperabilidadInpe; 
    
    private java.lang.String InpeImplPort_address = "http://publico.oefa.gob.pe/interoperabilidad-ws/webservices/Inpe";

    public java.lang.String getInpeImplPortAddress() {
        return InpeImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InpeImplPortWSDDServiceName = "InpeImplPort";

    public java.lang.String getInpeImplPortWSDDServiceName() {
        return InpeImplPortWSDDServiceName;
    }

    public void setInpeImplPortWSDDServiceName(java.lang.String name) {
        InpeImplPortWSDDServiceName = name;
    }

    public pe.gob.oefa.interoperabilidad.ws.inpe.service.Inpe getInpeImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InpeImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInpeImplPort(endpoint);
    }

    public pe.gob.oefa.interoperabilidad.ws.inpe.service.Inpe getInpeImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pe.gob.oefa.interoperabilidad.ws.inpe.service.InpeImplServiceSoapBindingStub _stub = new pe.gob.oefa.interoperabilidad.ws.inpe.service.InpeImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getInpeImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInpeImplPortEndpointAddress(java.lang.String address) {
        InpeImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pe.gob.oefa.interoperabilidad.ws.inpe.service.Inpe.class.isAssignableFrom(serviceEndpointInterface)) {
                pe.gob.oefa.interoperabilidad.ws.inpe.service.InpeImplServiceSoapBindingStub _stub = new pe.gob.oefa.interoperabilidad.ws.inpe.service.InpeImplServiceSoapBindingStub(new java.net.URL(InpeImplPort_address), this);
                _stub.setPortName(getInpeImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("InpeImplPort".equals(inputPortName)) {
            return getInpeImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.inpe.ws.interoperabilidad.oefa.gob.pe/", "InpeImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.inpe.ws.interoperabilidad.oefa.gob.pe/", "InpeImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InpeImplPort".equals(portName)) {
            setInpeImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
