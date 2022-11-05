package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.gob.oefa.util.CustomDateSerializer;
import pe.gob.oefa.util.CustomTimeSerializer;

@JsonInclude(Include.NON_NULL)
public class ReunionResumenResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4277647764506691546L;
	private BigDecimal reunionId;
	private String sala;
	private String tipoReunion;
	private String areaCodigo;
	private String areaNombre;
	private String motivoSolicitud;
	private String motivoCancelado;
	private Date fechaReunion;	
	private Date fechaInicio;
	private Timestamp horaInicio;
	private Date fechaFin;
	private Timestamp horaFin;
	private String solicitante;
	private String titulo;
	private Date fechaInicioreunion;
	private Date fechaFinalizacion;
	private Date fechaCancelado;
	private String estadoReunion;
	private String correoSolicitante;
	private String ubicacionSalaCodigo;
	private String ubicacionSalaNombre;
	private String areaSalaCodigo;
	private String areaSalaNombre;
	private String tipoFlujo;
	private String modificadoPor;
	private String idSala;
	private String flgModificar;
	

	public ReunionResumenResponse() {
	}

	public BigDecimal getReunionId() {
		return reunionId;
	}

	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getTipoReunion() {
		return tipoReunion;
	}

	public void setTipoReunion(String tipoReunion) {
		this.tipoReunion = tipoReunion;
	}

	public String getAreaCodigo() {
		return areaCodigo;
	}

	public void setAreaCodigo(String areaCodigo) {
		this.areaCodigo = areaCodigo;
	}

	public String getAreaNombre() {
		return areaNombre;
	}

	public void setAreaNombre(String areaNombre) {
		this.areaNombre = areaNombre;
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

	@JsonSerialize(using = CustomTimeSerializer.class)
	public Timestamp getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Timestamp horaInicio) {
		this.horaInicio = horaInicio;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	@JsonSerialize(using = CustomTimeSerializer.class)
	public Timestamp getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Timestamp horaFin) {
		this.horaFin = horaFin;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFechaInicioreunion() {
		return fechaInicioreunion;
	}

	public void setFechaInicioreunion(Date fechaInicioreunion) {
		this.fechaInicioreunion = fechaInicioreunion;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFechaCancelado() {
		return fechaCancelado;
	}

	public void setFechaCancelado(Date fechaCancelado) {
		this.fechaCancelado = fechaCancelado;
	}

	public String getEstadoReunion() {
		return estadoReunion;
	}

	public void setEstadoReunion(String estadoReunion) {
		this.estadoReunion = estadoReunion;
	}

	public String getCorreoSolicitante() {
		return correoSolicitante;
	}

	public void setCorreoSolicitante(String correoSolicitante) {
		this.correoSolicitante = correoSolicitante;
	}

	public String getUbicacionSalaCodigo() {
		return ubicacionSalaCodigo;
	}

	public void setUbicacionSalaCodigo(String ubicacionSalaCodigo) {
		this.ubicacionSalaCodigo = ubicacionSalaCodigo;
	}

	public String getUbicacionSalaNombre() {
		return ubicacionSalaNombre;
	}

	public void setUbicacionSalaNombre(String ubicacionSalaNombre) {
		this.ubicacionSalaNombre = ubicacionSalaNombre;
	}

	public String getAreaSalaCodigo() {
		return areaSalaCodigo;
	}

	public void setAreaSalaCodigo(String areaSalaCodigo) {
		this.areaSalaCodigo = areaSalaCodigo;
	}

	public String getAreaSalaNombre() {
		return areaSalaNombre;
	}

	public void setAreaSalaNombre(String areaSalaNombre) {
		this.areaSalaNombre = areaSalaNombre;
	}
	
	public String getTipoFlujo() {
		return tipoFlujo;
	}

	public void setTipoFlujo(String tipoFlujo) {
		this.tipoFlujo = tipoFlujo;
	}
	
	public String getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}	
	
	public String getIdSala() {
		return idSala;
	}

	public void setIdSala(String idSala) {
		this.idSala = idSala;
	}

	public String getFlgModificar() {
		return flgModificar;
	}

	public void setFlgModificar(String flgModificar) {
		this.flgModificar = flgModificar;
	}
	
	
	
	
	

}
