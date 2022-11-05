package pe.gob.oefa.model.json;

import java.math.BigDecimal;

public class ParticipanteDataGridResponse extends BaseRequest {

	private static final long serialVersionUID = 5766772605584450521L;
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
	public ParticipanteDataGridResponse() {
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


	public String getAreaNombre() {
		return areaNombre;
	}


	public void setAreaNombre(String areaNombre) {
		this.areaNombre = areaNombre;
	}
 
}
