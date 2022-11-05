package pe.gob.oefa.sirte.dto;

import java.math.BigDecimal;

import pe.gob.oefa.core.dto.BaseDTO;

public class CorreoEnvioDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8930897557625155074L;
	private BigDecimal envioId;
	private String usuarioId;
	private String asunto;
	private byte[] contenidos;
	private String contenido;
	private String destinatario;
	private String estado;
	private String mensajeError;
	private String mensajeExcepcion;
	private String flgactivo;
	private String sistemaOrigen;
	private String tipoCorreo;

	public CorreoEnvioDTO() {
		// TODO Auto-generated constructor stub
	}

	public byte[] getContenidos() {
		return contenidos;
	}

	public void setContenidos(byte[] contenidos) {
		this.contenidos = contenidos;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getSistemaOrigen() {
		return sistemaOrigen;
	}

	public void setSistemaOrigen(String sistemaOrigen) {
		this.sistemaOrigen = sistemaOrigen;
	}

	public String getTipoCorreo() {
		return tipoCorreo;
	}

	public void setTipoCorreo(String tipoCorreo) {
		this.tipoCorreo = tipoCorreo;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public BigDecimal getEnvioId() {
		return envioId;
	}
	
	public String getFlgactivo() {
		return flgactivo;
	}

	public void setFlgactivo(String flgactivo) {
		this.flgactivo = flgactivo;
	}

	public void setEnvioId(BigDecimal envioId) {
		this.envioId = envioId;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	public String getMensajeExcepcion() {
		return mensajeExcepcion;
	}

	public void setMensajeExcepcion(String mensajeExcepcion) {
		this.mensajeExcepcion = mensajeExcepcion;
	}

}
