package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolicitudListaResponse extends BaseRequest implements Serializable {

	private static final long serialVersionUID = -7277958607367458698L;
	private BigDecimal solicitudId;
	private BigDecimal padreId;
	private String usuarioId;
	private String rucNatural;
	private String nombre;
	private String categoriaNivel;
	private String estado;
	private String estadoCod;
	private String codigo;
	private Date fechaSolicitud;
	private String lastCambioEstado;
	private String lastControlPosterior;
	private BigDecimal idControlPosterior;
	private BigDecimal estadoId;
	private String usuarioControl;

	// cancelacion oefa
	private BigDecimal arcMotivocan;
	private BigDecimal motivocanId;

	// muestreo
	private String contrato;
	private String iniciocontrato;
	private String fincontrato;
	private BigDecimal dochabilidad;
	private BigDecimal docsctr;
	private BigDecimal arc_observacion;

	public SolicitudListaResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getPadreId() {
		return padreId;
	}

	public void setPadreId(BigDecimal padreId) {
		this.padreId = padreId;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstadoCod() {
		return estadoCod;
	}

	public void setEstadoCod(String estadoCod) {
		this.estadoCod = estadoCod;
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public String getRucNatural() {
		return rucNatural;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCategoriaNivel() {
		return categoriaNivel;
	}

	public String getEstado() {
		return estado;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public void setRucNatural(String rucNatural) {
		this.rucNatural = rucNatural;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCategoriaNivel(String categoriaNivel) {
		this.categoriaNivel = categoriaNivel;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public String getLastCambioEstado() {
		return lastCambioEstado;
	}

	public void setLastCambioEstado(String lastCambioEstado) {
		this.lastCambioEstado = lastCambioEstado;
	}

	public BigDecimal getIdControlPosterior() {
		return idControlPosterior;
	}

	public void setIdControlPosterior(BigDecimal idControlPosterior) {
		this.idControlPosterior = idControlPosterior;
	}

	public String getLastControlPosterior() {
		return lastControlPosterior;
	}

	public void setLastControlPosterior(String lastControlPosterior) {
		this.lastControlPosterior = lastControlPosterior;
	}

	public BigDecimal getEstadoId() {
		return estadoId;
	}

	public void setEstadoId(BigDecimal estadoId) {
		this.estadoId = estadoId;
	}

	public String getUsuarioControl() {
		return usuarioControl;
	}

	public void setUsuarioControl(String usuarioControl) {
		this.usuarioControl = usuarioControl;
	}

	public BigDecimal getArcMotivocan() {
		return arcMotivocan;
	}

	public void setArcMotivocan(BigDecimal arcMotivocan) {
		this.arcMotivocan = arcMotivocan;
	}

	public BigDecimal getMotivocanId() {
		return motivocanId;
	}

	public void setMotivocanId(BigDecimal motivocanId) {
		this.motivocanId = motivocanId;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getIniciocontrato() {
		return iniciocontrato;
	}

	public void setIniciocontrato(String iniciocontrato) {
		this.iniciocontrato = iniciocontrato;
	}

	public String getFincontrato() {
		return fincontrato;
	}

	public void setFincontrato(String fincontrato) {
		this.fincontrato = fincontrato;
	}

	public BigDecimal getDochabilidad() {
		return dochabilidad;
	}

	public void setDochabilidad(BigDecimal dochabilidad) {
		this.dochabilidad = dochabilidad;
	}

	public BigDecimal getDocsctr() {
		return docsctr;
	}

	public void setDocsctr(BigDecimal docsctr) {
		this.docsctr = docsctr;
	}

	public BigDecimal getArc_observacion() {
		return arc_observacion;
	}

	public void setArc_observacion(BigDecimal arc_observacion) {
		this.arc_observacion = arc_observacion;
	}
	
}
