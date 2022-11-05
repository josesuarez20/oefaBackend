package pe.gob.oefa.sirte.dto;

import java.io.Serializable;
import java.util.List;

public class SSOPersonaJuridicaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5688303873036383910L;
	
	
	private String ApellidoMaterno;
	private String ApellidoPaterno;
	private String Calidadmigra;
	private String Codigo;
	private String Direccion;
	private String EsValido;
	private String EstadoCivil;
	private String FechaNacimiento;
	private String Genero;
	private String Habido_Reniec;
	private String IdAplicacion;
	private String IdSesion;
	private String Mensaje;
	private String NombreCompleto;
	private String Nombres;
	private String NroDocumento;
	private String RUC;		
	private String TipoDocumento;
	private String TipoPersona;
	private String Ubigeo;	
	private List<RepLegalDTO> RepLegal;
	
	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}
	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		ApellidoPaterno = apellidoPaterno;
	}
	public String getCalidadmigra() {
		return Calidadmigra;
	}
	public void setCalidadmigra(String calidadmigra) {
		Calidadmigra = calidadmigra;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getEsValido() {
		return EsValido;
	}
	public void setEsValido(String esValido) {
		EsValido = esValido;
	}
	public String getEstadoCivil() {
		return EstadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}
	public String getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getHabido_Reniec() {
		return Habido_Reniec;
	}
	public void setHabido_Reniec(String habido_Reniec) {
		Habido_Reniec = habido_Reniec;
	}
	public String getIdAplicacion() {
		return IdAplicacion;
	}
	public void setIdAplicacion(String idAplicacion) {
		IdAplicacion = idAplicacion;
	}
	public String getIdSesion() {
		return IdSesion;
	}
	public void setIdSesion(String idSesion) {
		IdSesion = idSesion;
	}
	public String getMensaje() {
		return Mensaje;
	}
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	public String getNombreCompleto() {
		return NombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getNroDocumento() {
		return NroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		NroDocumento = nroDocumento;
	}
	public String getRUC() {
		return RUC;
	}
	public void setRUC(String rUC) {
		RUC = rUC;
	}
	public String getTipoDocumento() {
		return TipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}
	public String getTipoPersona() {
		return TipoPersona;
	}
	public void setTipoPersona(String tipoPersona) {
		TipoPersona = tipoPersona;
	}
	public String getUbigeo() {
		return Ubigeo;
	}
	public void setUbigeo(String ubigeo) {
		Ubigeo = ubigeo;
	}
	public List<RepLegalDTO> getRepLegal() {
		return RepLegal;
	}
	public void setRepLegal(List<RepLegalDTO> repLegal) {
		RepLegal = repLegal;
	}
	

}
