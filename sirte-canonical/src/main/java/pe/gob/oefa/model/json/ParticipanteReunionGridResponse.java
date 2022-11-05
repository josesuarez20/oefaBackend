package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ParticipanteReunionGridResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9036353123714396502L;

	private BigDecimal participanteId;
	private BigDecimal reunionId;
	private String participanteCodigo;
	private String nombre;
	private String cargo;
	private String entidad;
	private String correo;
	private String areaEntidad;
	private String asistio;

	private String esModerador;

	public ParticipanteReunionGridResponse() {
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
	 * @return the participanteCodigo
	 */
	public String getParticipanteCodigo() {
		return participanteCodigo;
	}

	/**
	 * @param participanteCodigo
	 *            the participanteCodigo to set
	 */
	public void setParticipanteCodigo(String participanteCodigo) {
		this.participanteCodigo = participanteCodigo;
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
	 * @return the entidad
	 */
	public String getEntidad() {
		return entidad;
	}

	/**
	 * @param entidad
	 *            the entidad to set
	 */
	public void setEntidad(String entidad) {
		this.entidad = entidad;
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
	 * @return the areaEntidad
	 */
	public String getAreaEntidad() {
		return areaEntidad;
	}

	/**
	 * @param areaEntidad
	 *            the areaEntidad to set
	 */
	public void setAreaEntidad(String areaEntidad) {
		this.areaEntidad = areaEntidad;
	}

	public String getEsModerador() {
		return esModerador;
	}

	public void setEsModerador(String esModerador) {
		this.esModerador = esModerador;
	}

}
