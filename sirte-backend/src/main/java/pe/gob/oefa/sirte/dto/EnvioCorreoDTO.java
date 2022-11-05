package pe.gob.oefa.sirte.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class EnvioCorreoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3695704981989689755L;
	private BigDecimal reunionId;
	private BigDecimal solicitudId;
	private String solicitante;
	private Date fechaReunion;
	private Timestamp horaInicio;
	private Timestamp horaFin;
	private String motivoreunion;
	private String motivoCancelado;
	private String correoSolicitante;
	private String titulo;
	private String lugar;
	private String ubicacion;
	private String area; 
	private BigDecimal salaId; 

	public EnvioCorreoDTO() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSalaId() {
		return salaId;
	}

	public void setSalaId(BigDecimal salaId) {
		this.salaId = salaId;
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

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public Date getFechaReunion() {
		return fechaReunion;
	}

	public void setFechaReunion(Date fechaReunion) {
		this.fechaReunion = fechaReunion;
	}

	public Timestamp getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Timestamp horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Timestamp getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Timestamp horaFin) {
		this.horaFin = horaFin;
	}

	public String getMotivoreunion() {
		return motivoreunion;
	}

	public void setMotivoreunion(String motivoreunion) {
		this.motivoreunion = motivoreunion;
	}

	public String getMotivoCancelado() {
		return motivoCancelado;
	}

	public void setMotivoCancelado(String motivoCancelado) {
		this.motivoCancelado = motivoCancelado;
	}

	public String getCorreoSolicitante() {
		return correoSolicitante;
	}

	public void setCorreoSolicitante(String correoSolicitante) {
		this.correoSolicitante = correoSolicitante;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
 

}
