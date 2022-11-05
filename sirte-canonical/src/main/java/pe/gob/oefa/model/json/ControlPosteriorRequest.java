package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ControlPosteriorRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal idControlPosterior;
	private BigDecimal solicitudId;
	private String estado;
	private Date fecha;
	private int conforme;

	// VARIABLES AUXILIARES PARA EL CAMBIO DE ESTADO
	private BigDecimal estadoDestinoId;
	private Date fechaSuspension;
	private String motivo;
	private String requerimientoId;
	private String observacion;

	public ControlPosteriorRequest() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getIdControlPosterior() {
		return idControlPosterior;
	}

	public void setIdControlPosterior(BigDecimal idControlPosterior) {
		this.idControlPosterior = idControlPosterior;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getConforme() {
		return conforme;
	}

	public void setConforme(int conforme) {
		this.conforme = conforme;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public Date getFechaSuspension() {
		return fechaSuspension;
	}

	public void setFechaSuspension(Date fechaSuspension) {
		this.fechaSuspension = fechaSuspension;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public BigDecimal getEstadoDestinoId() {
		return estadoDestinoId;
	}

	public void setEstadoDestinoId(BigDecimal estadoDestinoId) {
		this.estadoDestinoId = estadoDestinoId;
	}

	public String getRequerimientoId() {
		return requerimientoId;
	}

	public void setRequerimientoId(String requerimientoId) {
		this.requerimientoId = requerimientoId;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
}
