package pe.gob.oefa.sirte.dto;

import java.math.BigDecimal;

import pe.gob.oefa.core.dto.BaseDTO;

public class LogAuditoriaDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4529364902587952484L;
	private BigDecimal logAuditoriaId;
	private String usuario;
	private String uuid;
	private String contenido;

	public LogAuditoriaDTO() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getLogAuditoriaId() {
		return logAuditoriaId;
	}

	public void setLogAuditoriaId(BigDecimal logAuditoriaId) {
		this.logAuditoriaId = logAuditoriaId;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}
