package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ParticipanteRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7671438099940118957L;
	private BigDecimal participanteId;
	private BigDecimal reunionId;
	private String nombre;
	private String cargo;
	private String correo;
	private String esModerador;
	private String asistio;
	private String areaEntidad;
	private BigDecimal usuarioParticipanteId;
	private String areaNombre;
	private String ubicacionCodigo;
	private String ubicacionNombre;
	private String tipoUsuario; 
	private String mensajeasistente;
	private String documentoParticipante;
	
	public ParticipanteRequest() {
	}

	/**
	 * @return the participanteId
	 */
	public BigDecimal getParticipanteId() {
		return participanteId;
	}

	/**
	 * @param participanteId
	 *            the participanteId to set
	 */
	public void setParticipanteId(BigDecimal participanteId) {
		this.participanteId = participanteId;
	}

	/**
	 * @return the reunionId
	 */
	public BigDecimal getReunionId() {
		return reunionId;
	}

	/**
	 * @param reunionId
	 *            the reunionId to set
	 */
	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

	 

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the esModerador
	 */
	public String getEsModerador() {
		return esModerador;
	}

	/**
	 * @param esModerador
	 *            the esModerador to set
	 */
	public void setEsModerador(String esModerador) {
		this.esModerador = esModerador;
	}

	/**
	 * @return the asistio
	 */
	public String getAsistio() {
		return asistio;
	}

	/**
	 * @param asistio
	 *            the asistio to set
	 */
	public void setAsistio(String asistio) {
		this.asistio = asistio;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo
	 *            the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo
	 *            the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getAreaEntidad() {
		return areaEntidad;
	}

	public void setAreaEntidad(String areaEntidad) {
		this.areaEntidad = areaEntidad;
	}

	public BigDecimal getUsuarioParticipanteId() {
		return usuarioParticipanteId;
	}

	public void setUsuarioParticipanteId(BigDecimal usuarioParticipanteId) {
		this.usuarioParticipanteId = usuarioParticipanteId;
	}
 

	public String getAreaNombre() {
		return areaNombre;
	}

	public void setAreaNombre(String areaNombre) {
		this.areaNombre = areaNombre;
	}

	public String getUbicacionCodigo() {
		return ubicacionCodigo;
	}

	public void setUbicacionCodigo(String ubicacionCodigo) {
		this.ubicacionCodigo = ubicacionCodigo;
	}

	public String getUbicacionNombre() {
		return ubicacionNombre;
	}

	public void setUbicacionNombre(String ubicacionNombre) {
		this.ubicacionNombre = ubicacionNombre;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getMensajeasistente() {
		return mensajeasistente;
	}

	public void setMensajeasistente(String mensajeasistente) {
		this.mensajeasistente = mensajeasistente;
	}

	public String getDocumentoParticipante() {
		return documentoParticipante;
	}

	public void setDocumentoParticipante(String documentoParticipante) {
		this.documentoParticipante = documentoParticipante;
	}
	

}
