/**
 * ServicioPerfilLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.service;

public class ServicioPerfilLocator extends org.apache.axis.client.Service implements pe.gob.oefa.ws.seguridad.service.ServicioPerfil {

    public ServicioPerfilLocator() {
    }


    public ServicioPerfilLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicioPerfilLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HTTP_ServicioPerfil
    private java.lang.String HTTP_ServicioPerfil_address = "http://10.0.0.48:8586/ServicioPerfil.svc";

    public java.lang.String getHTTP_ServicioPerfilAddress() {
        return HTTP_ServicioPerfil_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HTTP_ServicioPerfilWSDDServiceName = "HTTP_ServicioPerfil";

    public java.lang.String getHTTP_ServicioPerfilWSDDServiceName() {
        return HTTP_ServicioPerfilWSDDServiceName;
    }

    public void setHTTP_ServicioPerfilWSDDServiceName(java.lang.String name) {
        HTTP_ServicioPerfilWSDDServiceName = name;
    }

    public pe.gob.oefa.ws.seguridad.service.IServicioPerfil getHTTP_ServicioPerfil() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HTTP_ServicioPerfil_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHTTP_ServicioPerfil(endpoint);
    }

    public pe.gob.oefa.ws.seguridad.service.IServicioPerfil getHTTP_ServicioPerfil(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pe.gob.oefa.ws.seguridad.service.HTTP_ServicioPerfilStub _stub = new pe.gob.oefa.ws.seguridad.service.HTTP_ServicioPerfilStub(portAddress, this);
            _stub.setPortName(getHTTP_ServicioPerfilWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHTTP_ServicioPerfilEndpointAddress(java.lang.String address) {
        HTTP_ServicioPerfil_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pe.gob.oefa.ws.seguridad.service.IServicioPerfil.class.isAssignableFrom(serviceEndpointInterface)) {
                pe.gob.oefa.ws.seguridad.service.HTTP_ServicioPerfilStub _stub = new pe.gob.oefa.ws.seguridad.service.HTTP_ServicioPerfilStub(new java.net.URL(HTTP_ServicioPerfil_address), this);
                _stub.setPortName(getHTTP_ServicioPerfilWSDDServiceName());
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
        if ("HTTP_ServicioPerfil".equals(inputPortName)) {
            return getHTTP_ServicioPerfil();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "ServicioPerfil");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "HTTP_ServicioPerfil"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HTTP_ServicioPerfil".equals(portName)) {
            setHTTP_ServicioPerfilEndpointAddress(address);
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
