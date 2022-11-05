/**
 * Sunat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunat.service;

public interface Sunat extends java.rmi.Remote {
    public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanRso[] getRepLegales(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanDds getDatosSecundarios(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanT362[] getDatosT362(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanDdp[] buscaRazonSocial(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanT1144 getDatosT1144(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public java.lang.String getDomicilioLegal(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanT1150[] getEstAnexosT1150(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public void setServicioConsultaRucService(java.lang.Object servicioConsultaRucService) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanSpr[] getEstablecimientosAnexos(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanDdp getDatosPrincipales(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
}
