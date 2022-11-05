package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class ReunionRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6984055335639496531L;
	private BigDecimal reunionId;
	private BigDecimal solicitudId;
	private String codigo;
	private String titulo;
	private String solicitante;
	private String areaCodigo;
	private String responsableProyector;
	private String responsableDescanso;
	private String responsableLaptop;
	private String sustentoProyector;
	private String sustentoDescanso;
	private String sustentoLaptop;
	private String motivoSolicitud;
	private String motivoCancelado;
	private String fechaReunion;
	private String horaInicio;
	private String horaFin;
	private String estadoCodigo;

	public ReunionRequest() {
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

	public String getFechaReunion() {
		return fechaReunion;
	}

	public void setFechaReunion(String fechaReunion) {
		this.fechaReunion = fechaReunion;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getEstadoCodigo() {
		return estadoCodigo;
	}

	public void setEstadoCodigo(String estadoCodigo) {
		this.estadoCodigo = estadoCodigo;
	}

	public String getMotivoCancelado() {
		return motivoCancelado;
	}

	public void setMotivoCancelado(String motivoCancelado) {
		this.motivoCancelado = motivoCancelado;
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

	public String getAreaCodigo() {
		return areaCodigo;
	}

	public void setAreaCodigo(String areaCodigo) {
		this.areaCodigo = areaCodigo;
	}

	public String getResponsableProyector() {
		return responsableProyector;
	}

	public void setResponsableProyector(String responsableProyector) {
		this.responsableProyector = responsableProyector;
	}

	public String getResponsableDescanso() {
		return responsableDescanso;
	}

	public void setResponsableDescanso(String responsableDescanso) {
		this.responsableDescanso = responsableDescanso;
	}

	public String getResponsableLaptop() {
		return responsableLaptop;
	}

	public void setResponsableLaptop(String responsableLaptop) {
		this.responsableLaptop = responsableLaptop;
	}

	public String getSustentoProyector() {
		return sustentoProyector;
	}

	public void setSustentoProyector(String sustentoProyector) {
		this.sustentoProyector = sustentoProyector;
	}

	public String getSustentoDescanso() {
		return sustentoDescanso;
	}

	public void setSustentoDescanso(String sustentoDescanso) {
		this.sustentoDescanso = sustentoDescanso;
	}

	public String getSustentoLaptop() {
		return sustentoLaptop;
	}

	public void setSustentoLaptop(String sustentoLaptop) {
		this.sustentoLaptop = sustentoLaptop;
	}

	public String getMotivoSolicitud() {
		return motivoSolicitud;
	}

	public void setMotivoSolicitud(String motivoSolicitud) {
		this.motivoSolicitud = motivoSolicitud;
	}

}
