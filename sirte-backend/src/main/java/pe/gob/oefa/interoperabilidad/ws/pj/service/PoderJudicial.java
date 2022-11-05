/**
 * PoderJudicial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.pj.service;

public interface PoderJudicial extends java.rmi.Remote {
    public pe.gob.oefa.interoperabilidad.ws.pj.service.RpatBeanPJ verificarAntecedentesPenales(java.lang.String vDNIconsulta, java.lang.String apePaterno, java.lang.String apeMaterno, java.lang.String nombre1, java.lang.String nombre2, java.lang.String nombre3, java.lang.String vDNIconsultante, java.lang.String motivoConsulta, java.lang.String procesoOEFA, java.lang.String usuarioOEFA) throws java.rmi.RemoteException;
}
