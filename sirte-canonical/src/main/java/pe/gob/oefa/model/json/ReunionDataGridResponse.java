package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.gob.oefa.util.CustomDateSerializer;
import pe.gob.oefa.util.CustomTimeSerializer;

@JsonInclude(Include.NON_NULL)
public class ReunionDataGridResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -588106990344275459L;
	private BigDecimal reunionId;
	private BigDecimal solicitudId;
	private String codigo;
	private String titulo;
	private String solicitante;
	private String motivoSolicitud;
	private String motivoCancelado;
	private String estadoReunion;
	private Date fechaReunion;
	private Date fechaInicio;
	private Date fechaFin;
	private Date horaInicio;
	private Date horaFin;
	private String lugar;
	private String correoSolicitante;
	private String usuarioSolicitante;
	private BigDecimal usuarioSolicitanteId;
	private String sala;
	private String sede;
	private String responsableSala;
	private String correoResponsable;
	private String estadoCodigo;
	private Boolean cancelar;
	private String esModerador;
	private boolean flgModificar;

	

	public ReunionDataGridResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getReunionId() {
		return reunionId;
	}

	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getMotivoSolicitud() {
		return motivoSolicitud;
	}

	public void setMotivoSolicitud(String motivoSolicitud) {
		this.motivoSolicitud = motivoSolicitud;
	}

	public String getMotivoCancelado() {
		return motivoCancelado;
	}

	public void setMotivoCancelado(String motivoCancelado) {
		this.motivoCancelado = motivoCancelado;
	}

	public String getEstadoReunion() {
		return estadoReunion;
	}

	public void setEstadoReunion(String estadoReunion) {
		this.estadoReunion = estadoReunion;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFechaReunion() {
		return fechaReunion;
	}

	public void setFechaReunion(Date fechaReunion) {
		this.fechaReunion = fechaReunion;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@JsonSerialize(using = CustomTimeSerializer.class)
	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@JsonSerialize(using = CustomTimeSerializer.class)
	public Date getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getCorreoSolicitante() {
		return correoSolicitante;
	}

	public void setCorreoSolicitante(String correoSolicitante) {
		this.correoSolicitante = correoSolicitante;
	}

	public String getUsuarioSolicitante() {
		return usuarioSolicitante;
	}

	public void setUsuarioSolicitante(String usuarioSolicitante) {
		this.usuarioSolicitante = usuarioSolicitante;
	}

	public BigDecimal getUsuarioSolicitanteId() {
		return usuarioSolicitanteId;
	}

	public void setUsuarioSolicitanteId(BigDecimal usuarioSolicitanteId) {
		this.usuarioSolicitanteId = usuarioSolicitanteId;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getResponsableSala() {
		return responsableSala;
	}

	public void setResponsableSala(String responsableSala) {
		this.responsableSala = responsableSala;
	}

	public String getCorreoResponsable() {
		return correoResponsable;
	}

	public void setCorreoResponsable(String correoResponsable) {
		this.correoResponsable = correoResponsable;
	}

	public String getEstadoCodigo() {
		return estadoCodigo;
	}

	public void setEstadoCodigo(String estadoCodigo) {
		this.estadoCodigo = estadoCodigo;
	}

	/**
	 * @return the cancelar
	 */
	public Boolean getCancelar() {
		return cancelar;
	}

	/**
	 * @param cancelar
	 *            the cancelar to set
	 */
	public void setCancelar(Boolean cancelar) {
		this.cancelar = cancelar;
	}

	public String getEsModerador() {
		return esModerador;
	}

	public void setEsModerador(String esModerador) {
		this.esModerador = esModerador;
	}

	public boolean isFlgModificar() {
		return flgModificar;
	}

	public void setFlgModificar(boolean flgModificar) {
		this.flgModificar = flgModificar;
	}

	
	
}
