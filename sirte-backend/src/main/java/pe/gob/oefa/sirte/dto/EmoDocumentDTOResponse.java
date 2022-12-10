package pe.gob.oefa.sirte.dto;

import java.time.LocalDateTime;

public class EmoDocumentDTOResponse {
	private Integer id;
	private Integer codigoExamen;
	private String nombreExamen;
	private String nombreArchivo;
	private String pathExamen;
	private Integer aptitudMedico;
	private Integer habilitado;
	private Integer idEmoConsulta;
	private String usuarioCreacion;
	private LocalDateTime fechaCreacion;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public Integer getCodigoExamen() {
		return codigoExamen;
	}
	public void setCodigoExamen(Integer codigoExamen) {
		this.codigoExamen = codigoExamen;
	}
	public String getNombreExamen() {
		return nombreExamen;
	}
	public void setNombreExamen(String nombreExamen) {
		this.nombreExamen = nombreExamen;
	}
	public String getPathExamen() {
		return pathExamen;
	}
	public void setPathExamen(String pathExamen) {
		this.pathExamen = pathExamen;
	}
	public Integer getAptitudMedico() {
		return aptitudMedico;
	}
	public void setAptitudMedico(Integer aptitudMedico) {
		this.aptitudMedico = aptitudMedico;
	}
	public Integer getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(Integer habilitado) {
		this.habilitado = habilitado;
	}
	public Integer getIdEmoConsulta() {
		return idEmoConsulta;
	}
	public void setIdEmoConsulta(Integer idEmoConsulta) {
		this.idEmoConsulta = idEmoConsulta;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
}
