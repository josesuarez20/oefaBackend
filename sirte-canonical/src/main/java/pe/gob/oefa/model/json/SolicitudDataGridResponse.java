package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.gob.oefa.util.CustomDateSerializer;
import pe.gob.oefa.util.CustomDateTimeReporteSerializer;
import pe.gob.oefa.util.CustomTimeSerializer;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SolicitudDataGridResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3525255945421587855L;
	private BigDecimal solicitudId;
	private String ubicacionNombre;
	private String sala;
	private String titulo;
	private String solicitante;
	private String areaCodigo;
	private String esPeriodo;
	private String codigo;
	private Date fechaInicio;
	private Date fechaFin;
	private Date horaInicio;
	private Date horaFin;
	private String motivoSolicitud;
	private String estadoCodigo;
	private String correoSolicitannte;
	private String usuarioSolicitante;
	private BigDecimal usuarioSolicitanteId;
	private String estadoSolicitud;
	private Boolean aprobar;
	private Timestamp fechaSolicitud;

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	@JsonSerialize(using=CustomDateTimeReporteSerializer.class)
	public Timestamp getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Timestamp fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
 

	public String getUbicacionNombre() {
		return ubicacionNombre;
	}

	public void setUbicacionNombre(String ubicacionNombre) {
		this.ubicacionNombre = ubicacionNombre;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
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

	public String getAreaCodigo() {
		return areaCodigo;
	}

	public void setAreaCodigo(String areaCodigo) {
		this.areaCodigo = areaCodigo;
	}

	public String getEsPeriodo() {
		return esPeriodo;
	}

	public void setEsPeriodo(String esPeriodo) {
		this.esPeriodo = esPeriodo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getMotivoSolicitud() {
		return motivoSolicitud;
	}

	public void setMotivoSolicitud(String motivoSolicitud) {
		this.motivoSolicitud = motivoSolicitud;
	}

	public String getEstadoCodigo() {
		return estadoCodigo;
	}

	public void setEstadoCodigo(String estadoCodigo) {
		this.estadoCodigo = estadoCodigo;
	}

	public String getCorreoSolicitannte() {
		return correoSolicitannte;
	}

	public void setCorreoSolicitannte(String correoSolicitannte) {
		this.correoSolicitannte = correoSolicitannte;
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

	/**
	 * @return the aprobar
	 */
	public Boolean getAprobar() {
		return aprobar;
	}

	/**
	 * @param aprobar the aprobar to set
	 */
	public void setAprobar(Boolean aprobar) {
		this.aprobar = aprobar;
	}
	
	
}
