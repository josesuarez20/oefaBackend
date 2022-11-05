/**
 * SunatImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunat.service;

import org.springframework.beans.factory.annotation.Value;

public class SunatImplServiceLocator extends org.apache.axis.client.Service implements pe.gob.oefa.interoperabilidad.ws.sunat.service.SunatImplService {

    public SunatImplServiceLocator() {
    }


    public SunatImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SunatImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SunatImplPort
    //@Value("${servicio.interoperabilidad.sunat}")
   	//private String interoperabilidadSunat; 
    
    private java.lang.String SunatImplPort_address = "http://publico.oefa.gob.pe/interoperabilidad-ws/webservices/Sunat";

    public java.lang.String getSunatImplPortAddress() {
        return SunatImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SunatImplPortWSDDServiceName = "SunatImplPort";

    public java.lang.String getSunatImplPortWSDDServiceName() {
        return SunatImplPortWSDDServiceName;
    }

    public void setSunatImplPortWSDDServiceName(java.lang.String name) {
        SunatImplPortWSDDServiceName = name;
    }

    public pe.gob.oefa.interoperabilidad.ws.sunat.service.Sunat getSunatImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SunatImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSunatImplPort(endpoint);
    }

    public pe.gob.oefa.interoperabilidad.ws.sunat.service.Sunat getSunatImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pe.gob.oefa.interoperabilidad.ws.sunat.service.SunatImplServiceSoapBindingStub _stub = new pe.gob.oefa.interoperabilidad.ws.sunat.service.SunatImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSunatImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSunatImplPortEndpointAddress(java.lang.String address) {
        SunatImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pe.gob.oefa.interoperabilidad.ws.sunat.service.Sunat.class.isAssignableFrom(serviceEndpointInterface)) {
                pe.gob.oefa.interoperabilidad.ws.sunat.service.SunatImplServiceSoapBindingStub _stub = new pe.gob.oefa.interoperabilidad.ws.sunat.service.SunatImplServiceSoapBindingStub(new java.net.URL(SunatImplPort_address), this);
                _stub.setPortName(getSunatImplPortWSDDServiceName());
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
        if ("SunatImplPort".equals(inputPortName)) {
            return getSunatImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.sunat.ws.interoperabilidad.oefa.gob.pe/", "SunatImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.sunat.ws.interoperabilidad.oefa.gob.pe/", "SunatImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SunatImplPort".equals(portName)) {
            setSunatImplPortEndpointAddress(address);
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
