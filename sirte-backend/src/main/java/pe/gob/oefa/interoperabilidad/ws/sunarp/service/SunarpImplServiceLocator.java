/**
 * SunarpImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunarp.service;

import org.springframework.beans.factory.annotation.Value;

public class SunarpImplServiceLocator extends org.apache.axis.client.Service implements pe.gob.oefa.interoperabilidad.ws.sunarp.service.SunarpImplService {

    public SunarpImplServiceLocator() {
    }


    public SunarpImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SunarpImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SunarpImplPort
    /*
    @Value("${servicio.interoperabilidad.sunarp}")
   	private String interoperabilidadSunarp; */

    
    private java.lang.String SunarpImplPort_address = "http://publico.oefa.gob.pe/interoperabilidad-ws/webservices/Sunarp";

    public java.lang.String getSunarpImplPortAddress() {
        return SunarpImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SunarpImplPortWSDDServiceName = "SunarpImplPort";

    public java.lang.String getSunarpImplPortWSDDServiceName() {
        return SunarpImplPortWSDDServiceName;
    }

    public void setSunarpImplPortWSDDServiceName(java.lang.String name) {
        SunarpImplPortWSDDServiceName = name;
    }

    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.Sunarp getSunarpImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SunarpImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSunarpImplPort(endpoint);
    }

    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.Sunarp getSunarpImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pe.gob.oefa.interoperabilidad.ws.sunarp.service.SunarpImplServiceSoapBindingStub _stub = new pe.gob.oefa.interoperabilidad.ws.sunarp.service.SunarpImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSunarpImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSunarpImplPortEndpointAddress(java.lang.String address) {
        SunarpImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pe.gob.oefa.interoperabilidad.ws.sunarp.service.Sunarp.class.isAssignableFrom(serviceEndpointInterface)) {
                pe.gob.oefa.interoperabilidad.ws.sunarp.service.SunarpImplServiceSoapBindingStub _stub = new pe.gob.oefa.interoperabilidad.ws.sunarp.service.SunarpImplServiceSoapBindingStub(new java.net.URL(SunarpImplPort_address), this);
                _stub.setPortName(getSunarpImplPortWSDDServiceName());
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
        if ("SunarpImplPort".equals(inputPortName)) {
            return getSunarpImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "SunarpImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "SunarpImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SunarpImplPort".equals(portName)) {
            setSunarpImplPortEndpointAddress(address);
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
