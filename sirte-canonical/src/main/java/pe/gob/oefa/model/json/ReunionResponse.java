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
public class ReunionResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6984055335639496531L;

	private BigDecimal reunionId;
	private BigDecimal solicitudId;
	private BigDecimal sedeId;
	private BigDecimal salaId;
	private String tipoReunionCodigo;
	private String tipoReunion;
	private String areaCodigo;
	private String area;

	private String codigo;
	private String titulo;
	private String solicitante;
	private String responsableProyector;
	private String responsableDescanso;
	private String responsableLaptop;
	private String sustentoProyector;
	private String sustentoDescanso;
	private String sustentoLaptop;
	private String motivoSolicitud;
	private String motivoCancelado;
	private Date fechaReunion;
	private Timestamp horaInicio;
	private Timestamp horaFin;
	private String estadoCodigo;

	private String sala;
	private String sede;

	private Date fechaInicioReunion;
	private Date fechaFinalizacion;
	private Date fechaCancelacion;
	private String estadoReunion;

	public ReunionResponse() {
	}
 
	public String getEstadoReunion() {
		return estadoReunion;
	}

	public void setEstadoReunion(String estadoReunion) {
		this.estadoReunion = estadoReunion;
	}

	/**
	 * @return the reunionId
	 */
	public BigDecimal getReunionId() {
		return reunionId;
	}

	/**
	 * @param reunionId
	 *            the reunionId to set
	 */
	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

	/**
	 * @return the solicitudId
	 */
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	/**
	 * @param solicitudId
	 *            the solicitudId to set
	 */
	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	/**
	 * @return the sedeId
	 */
	public BigDecimal getSedeId() {
		return sedeId;
	}

	/**
	 * @param sedeId
	 *            the sedeId to set
	 */
	public void setSedeId(BigDecimal sedeId) {
		this.sedeId = sedeId;
	}

	/**
	 * @return the salaId
	 */
	public BigDecimal getSalaId() {
		return salaId;
	}

	/**
	 * @param salaId
	 *            the salaId to set
	 */
	public void setSalaId(BigDecimal salaId) {
		this.salaId = salaId;
	}

	/**
	 * @return the tipoReunionCodigo
	 */
	public String getTipoReunionCodigo() {
		return tipoReunionCodigo;
	}

	/**
	 * @param tipoReunionCodigo
	 *            the tipoReunionCodigo to set
	 */
	public void setTipoReunionCodigo(String tipoReunionCodigo) {
		this.tipoReunionCodigo = tipoReunionCodigo;
	}

	/**
	 * @return the areaCodigo
	 */
	public String getAreaCodigo() {
		return areaCodigo;
	}

	/**
	 * @param areaCodigo
	 *            the areaCodigo to set
	 */
	public void setAreaCodigo(String areaCodigo) {
		this.areaCodigo = areaCodigo;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 *            the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the solicitante
	 */
	public String getSolicitante() {
		return solicitante;
	}

	/**
	 * @param solicitante
	 *            the solicitante to set
	 */
	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	/**
	 * @return the responsableProyector
	 */
	public String getResponsableProyector() {
		return responsableProyector;
	}

	/**
	 * @param responsableProyector
	 *            the responsableProyector to set
	 */
	public void setResponsableProyector(String responsableProyector) {
		this.responsableProyector = responsableProyector;
	}

	/**
	 * @return the responsableDescanso
	 */
	public String getResponsableDescanso() {
		return responsableDescanso;
	}

	/**
	 * @param responsableDescanso
	 *            the responsableDescanso to set
	 */
	public void setResponsableDescanso(String responsableDescanso) {
		this.responsableDescanso = responsableDescanso;
	}

	/**
	 * @return the responsableLaptop
	 */
	public String getResponsableLaptop() {
		return responsableLaptop;
	}

	/**
	 * @param responsableLaptop
	 *            the responsableLaptop to set
	 */
	public void setResponsableLaptop(String responsableLaptop) {
		this.responsableLaptop = responsableLaptop;
	}

	/**
	 * @return the sustentoProyector
	 */
	public String getSustentoProyector() {
		return sustentoProyector;
	}

	/**
	 * @param sustentoProyector
	 *            the sustentoProyector to set
	 */
	public void setSustentoProyector(String sustentoProyector) {
		this.sustentoProyector = sustentoProyector;
	}

	/**
	 * @return the sustentoDescanso
	 */
	public String getSustentoDescanso() {
		return sustentoDescanso;
	}

	/**
	 * @param sustentoDescanso
	 *            the sustentoDescanso to set
	 */
	public void setSustentoDescanso(String sustentoDescanso) {
		this.sustentoDescanso = sustentoDescanso;
	}

	/**
	 * @return the sustentoLaptop
	 */
	public String getSustentoLaptop() {
		return sustentoLaptop;
	}

	/**
	 * @param sustentoLaptop
	 *            the sustentoLaptop to set
	 */
	public void setSustentoLaptop(String sustentoLaptop) {
		this.sustentoLaptop = sustentoLaptop;
	}

	/**
	 * @return the motivoSolicitud
	 */
	public String getMotivoSolicitud() {
		return motivoSolicitud;
	}

	/**
	 * @param motivoSolicitud
	 *            the motivoSolicitud to set
	 */
	public void setMotivoSolicitud(String motivoSolicitud) {
		this.motivoSolicitud = motivoSolicitud;
	}

	/**
	 * @return the motivoCancelado
	 */
	public String getMotivoCancelado() {
		return motivoCancelado;
	}

	/**
	 * @param motivoCancelado
	 *            the motivoCancelado to set
	 */
	public void setMotivoCancelado(String motivoCancelado) {
		this.motivoCancelado = motivoCancelado;
	}

	/**
	 * @return the fechaReunion
	 */
	@JsonSerialize(using=CustomDateSerializer.class)
	public Date getFechaReunion() {
		return fechaReunion;
	}

	/**
	 * @param fechaReunion
	 *            the fechaReunion to set
	 */
	public void setFechaReunion(Date fechaReunion) {
		this.fechaReunion = fechaReunion;
	}
 
	@JsonSerialize(using=CustomTimeSerializer.class)
	public Timestamp getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Timestamp horaInicio) {
		this.horaInicio = horaInicio;
	}
	@JsonSerialize(using=CustomTimeSerializer.class)
	public Timestamp getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Timestamp horaFin) {
		this.horaFin = horaFin;
	}

	/**
	 * @return the estadoCodigo
	 */
	public String getEstadoCodigo() {
		return estadoCodigo;
	}

	/**
	 * @param estadoCodigo
	 *            the estadoCodigo to set
	 */
	public void setEstadoCodigo(String estadoCodigo) {
		this.estadoCodigo = estadoCodigo;
	}

	/**
	 * @return the tipoReunion
	 */
	public String getTipoReunion() {
		return tipoReunion;
	}

	/**
	 * @param tipoReunion
	 *            the tipoReunion to set
	 */
	public void setTipoReunion(String tipoReunion) {
		this.tipoReunion = tipoReunion;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the sala
	 */
	public String getSala() {
		return sala;
	}

	/**
	 * @param sala
	 *            the sala to set
	 */
	public void setSala(String sala) {
		this.sala = sala;
	}

	/**
	 * @return the sede
	 */
	public String getSede() {
		return sede;
	}

	/**
	 * @param sede
	 *            the sede to set
	 */
	public void setSede(String sede) {
		this.sede = sede;
	}
	@JsonSerialize(using=CustomDateSerializer.class)
	public Date getFechaInicioReunion() {
		return fechaInicioReunion;
	}

	public void setFechaInicioReunion(Date fechaInicioReunion) {
		this.fechaInicioReunion = fechaInicioReunion;
	}
	@JsonSerialize(using=CustomDateSerializer.class)
	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	@JsonSerialize(using=CustomDateSerializer.class)
	public Date getFechaCancelacion() {
		return fechaCancelacion;
	}

	public void setFechaCancelacion(Date fechaCancelacion) {
		this.fechaCancelacion = fechaCancelacion;
	}

}
