/**
 * Sunarp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunarp.service;

public interface Sunarp extends java.rmi.Remote {
    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.RespuestaPartidaBean listarAsientos(java.lang.String zona, java.lang.String oficina, java.lang.String partida, java.lang.String registro, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.DatosPJBean[] buscarPJRazonSocial(java.lang.String razonSocial, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.RespuestaVehiculoBean verDetalleRPV(java.lang.String zona, java.lang.String oficina, java.lang.String placa, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public byte[] verAsiento(long transaccion, long idImg, java.lang.String tipo, java.lang.String nroTotalPag, java.lang.String nroPagRef, java.lang.String pagina, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.ResultadoTitularidad[] buscarTitularidad(java.lang.String tipoParticipante, java.lang.String apellidoPaterno, java.lang.String apellidoMaterno, java.lang.String nombres, java.lang.String razonSocial, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.OficinaRegistralBean[] getOficinas(java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.RespuestaNaveAeronaveBean[] buscarNaveAeronave(java.lang.String numeroMatricula, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException;
}
