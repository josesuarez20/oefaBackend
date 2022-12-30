package pe.gob.oefa.sirte.dto;

import java.time.LocalDateTime;

public class EmoDocumentDTORequest {
	private Integer id;
	private String codigoExamen;
	private String nombreExamen;
	private String nombreArchivo;

	private String pathExamen;
	private Integer habilitado;
	private Integer idEmoConsulta;
	private String usuarioCreacion;
	private LocalDateTime fechaCreacion;
	
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigoExamen() {
		return codigoExamen;
	}
	public void setCodigoExamen(String codigoExamen) {
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
