package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.gob.oefa.util.CustomDateSerializer;
import pe.gob.oefa.util.CustomTimeSerializer;

public class Solicitud2DataGridResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3525255945421587855L;
	
	
	private String codigoubicacion;
	private String descripcionubicacion;	
	private BigDecimal salaId;	
	private String nombresala;
	private String tipoSalaCodigo;
	private String descripcionsala;
	private Integer capacidad;
	private String tipoAprobacionCodigo;	
	private String tipoFlujoCodigo;	
	private String tipoFlujoDescripcion;
	private String esperido;
	private Date fechaInicio;
	private Date fechaFin;
	private Date horaInicio;
	private Date horaFin;
	private String solicitante;
	private String solicitanteDni;
	private String usuarioSolicitante;
	private String correoSolicitante;
	private String areaCodigo;
	private Boolean aprobar;
	private String estadoCodigo;
	
	public String getCodigoubicacion() {
		return codigoubicacion;
	}
	public void setCodigoubicacion(String codigoubicacion) {
		this.codigoubicacion = codigoubicacion;
	}
	public String getDescripcionubicacion() {
		return descripcionubicacion;
	}
	public void setDescripcionubicacion(String descripcionubicacion) {
		this.descripcionubicacion = descripcionubicacion;
	}
	public BigDecimal getSalaId() {
		return salaId;
	}
	public void setSalaId(BigDecimal salaId) {
		this.salaId = salaId;
	}
	public String getNombresala() {
		return nombresala;
	}
	public void setNombresala(String nombresala) {
		this.nombresala = nombresala;
	}
	public String getTipoSalaCodigo() {
		return tipoSalaCodigo;
	}
	public void setTipoSalaCodigo(String tipoSalaCodigo) {
		this.tipoSalaCodigo = tipoSalaCodigo;
	}
	public String getDescripcionsala() {
		return descripcionsala;
	}
	public void setDescripcionsala(String descripcionsala) {
		this.descripcionsala = descripcionsala;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public String getTipoAprobacionCodigo() {
		return tipoAprobacionCodigo;
	}
	public void setTipoAprobacionCodigo(String tipoAprobacionCodigo) {
		this.tipoAprobacionCodigo = tipoAprobacionCodigo;
	}
	public String getTipoFlujoCodigo() {
		return tipoFlujoCodigo;
	}
	public void setTipoFlujoCodigo(String tipoFlujoCodigo) {
		this.tipoFlujoCodigo = tipoFlujoCodigo;
	}
	public String getEsperido() {
		return esperido;
	}
	public void setEsperido(String esperido) {
		this.esperido = esperido;
	}	
	//------------------------
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
	//------------------------
	
	public String getUsuarioSolicitante() {
		return usuarioSolicitante;
	}
	public void setUsuarioSolicitante(String usuarioSolicitante) {
		this.usuarioSolicitante = usuarioSolicitante;
	}
	
	public Boolean getAprobar() {
		return aprobar;
	}
	public void setAprobar(Boolean aprobar) {
		this.aprobar = aprobar;
	}
	public String getEstadoCodigo() {
		return estadoCodigo;
	}
	public void setEstadoCodigo(String estadoCodigo) {
		this.estadoCodigo = estadoCodigo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getTipoFlujoDescripcion() {
		return tipoFlujoDescripcion;
	}
	public void setTipoFlujoDescripcion(String tipoFlujoDescripcion) {
		this.tipoFlujoDescripcion = tipoFlujoDescripcion;
	}
	public String getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	public String getSolicitanteDni() {
		return solicitanteDni;
	}
	public void setSolicitanteDni(String solicitanteDni) {
		this.solicitanteDni = solicitanteDni;
	}
	public String getCorreoSolicitante() {
		return correoSolicitante;
	}
	public void setCorreoSolicitante(String correoSolicitante) {
		this.correoSolicitante = correoSolicitante;
	}
	public String getAreaCodigo() {
		return areaCodigo;
	}
	public void setAreaCodigo(String areaCodigo) {
		this.areaCodigo = areaCodigo;
	}
}
