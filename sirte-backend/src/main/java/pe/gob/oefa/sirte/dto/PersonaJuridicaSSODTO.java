package pe.gob.oefa.sirte.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class PersonaJuridicaSSODTO implements Serializable{
	
	/**
	 * 
	 */	
	
	private static final long serialVersionUID = -5688303873036383910L;
	    
	private String ApellidoMaterno;
	private String ApellidoPaterno;
	private String Calidadmigra;
	private BigDecimal Codigo;
	private String Direccion;
	private String EsValido;
	private BigDecimal EstadoCivil;
	private String FechaNacimiento;
	private BigDecimal Genero;
	private BigDecimal Habido_Reniec;
	private BigDecimal IdAplicacion;
	private BigDecimal IdSesion;
	private String Mensaje;
	private String NombreCompleto;
	private String Nombres;
	private String NroDocumento;
	private String RUC;		
	private BigDecimal TipoDocumento;
	private BigDecimal TipoPersona;
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
	public BigDecimal getCodigo() {
		return Codigo;
	}
	public void setCodigo(BigDecimal codigo) {
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
	public BigDecimal getEstadoCivil() {
		return EstadoCivil;
	}
	public void setEstadoCivil(BigDecimal estadoCivil) {
		EstadoCivil = estadoCivil;
	}
	public String getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public BigDecimal getGenero() {
		return Genero;
	}
	public void setGenero(BigDecimal genero) {
		Genero = genero;
	}
	public BigDecimal getHabido_Reniec() {
		return Habido_Reniec;
	}
	public void setHabido_Reniec(BigDecimal habido_Reniec) {
		Habido_Reniec = habido_Reniec;
	}
	public BigDecimal getIdAplicacion() {
		return IdAplicacion;
	}
	public void setIdAplicacion(BigDecimal idAplicacion) {
		IdAplicacion = idAplicacion;
	}
	public BigDecimal getIdSesion() {
		return IdSesion;
	}
	public void setIdSesion(BigDecimal idSesion) {
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
	public BigDecimal getTipoDocumento() {
		return TipoDocumento;
	}
	public void setTipoDocumento(BigDecimal tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}
	public BigDecimal getTipoPersona() {
		return TipoPersona;
	}
	public void setTipoPersona(BigDecimal tipoPersona) {
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
