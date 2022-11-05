/**
 * MigracionesImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.migraciones.service;

import org.springframework.beans.factory.annotation.Value;

public class MigracionesImplServiceLocator extends org.apache.axis.client.Service implements pe.gob.oefa.interoperabilidad.ws.migraciones.service.MigracionesImplService {

    public MigracionesImplServiceLocator() {
    }


    public MigracionesImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MigracionesImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MigracionesImplPort
    /*
    @Value("${servicio.interoperabilidad.migraciones}")
   	private String interoperabilidadMigraciones;  */
    
    private java.lang.String MigracionesImplPort_address = "http://publico.oefa.gob.pe/interoperabilidad-ws/webservices/Migraciones";

    public java.lang.String getMigracionesImplPortAddress() {
        return MigracionesImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MigracionesImplPortWSDDServiceName = "MigracionesImplPort";

    public java.lang.String getMigracionesImplPortWSDDServiceName() {
        return MigracionesImplPortWSDDServiceName;
    }

    public void setMigracionesImplPortWSDDServiceName(java.lang.String name) {
        MigracionesImplPortWSDDServiceName = name;
    }

    public pe.gob.oefa.interoperabilidad.ws.migraciones.service.Migraciones getMigracionesImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MigracionesImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMigracionesImplPort(endpoint);
    }

    public pe.gob.oefa.interoperabilidad.ws.migraciones.service.Migraciones getMigracionesImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pe.gob.oefa.interoperabilidad.ws.migraciones.service.MigracionesImplServiceSoapBindingStub _stub = new pe.gob.oefa.interoperabilidad.ws.migraciones.service.MigracionesImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMigracionesImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMigracionesImplPortEndpointAddress(java.lang.String address) {
        MigracionesImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pe.gob.oefa.interoperabilidad.ws.migraciones.service.Migraciones.class.isAssignableFrom(serviceEndpointInterface)) {
                pe.gob.oefa.interoperabilidad.ws.migraciones.service.MigracionesImplServiceSoapBindingStub _stub = new pe.gob.oefa.interoperabilidad.ws.migraciones.service.MigracionesImplServiceSoapBindingStub(new java.net.URL(MigracionesImplPort_address), this);
                _stub.setPortName(getMigracionesImplPortWSDDServiceName());
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
        if ("MigracionesImplPort".equals(inputPortName)) {
            return getMigracionesImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.migraciones.ws.interoperabilidad.oefa.gob.pe/", "MigracionesImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.migraciones.ws.interoperabilidad.oefa.gob.pe/", "MigracionesImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MigracionesImplPort".equals(portName)) {
            setMigracionesImplPortEndpointAddress(address);
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
