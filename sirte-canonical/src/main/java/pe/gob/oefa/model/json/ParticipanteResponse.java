package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.core.CollectionResponse;

@JsonInclude(Include.NON_NULL)
public class ParticipanteResponse implements Serializable {

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
	private String ubicacionCodigo;
	private String ubicacionNombre;
	private BigDecimal usuarioParticipanteId;
	private CollectionResponse<ComboResponse> comboUbicacion;
	private CollectionResponse<ComboResponse> comboAreas; 

	public ParticipanteResponse() {
	}

	public BigDecimal getParticipanteId() {
		return participanteId;
	}

	public void setParticipanteId(BigDecimal participanteId) {
		this.participanteId = participanteId;
	}

	public BigDecimal getReunionId() {
		return reunionId;
	}

	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEsModerador() {
		return esModerador;
	}

	public void setEsModerador(String esModerador) {
		this.esModerador = esModerador;
	}

	public String getAsistio() {
		return asistio;
	}

	public void setAsistio(String asistio) {
		this.asistio = asistio;
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


	public CollectionResponse<ComboResponse> getComboUbicacion() {
		return comboUbicacion;
	}

	public void setComboUbicacion(CollectionResponse<ComboResponse> comboUbicacion) {
		this.comboUbicacion = comboUbicacion;
	}


	public CollectionResponse<ComboResponse> getComboAreas() {
		return comboAreas;
	}

	public void setComboAreas(CollectionResponse<ComboResponse> comboAreas) {
		this.comboAreas = comboAreas;
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

}
