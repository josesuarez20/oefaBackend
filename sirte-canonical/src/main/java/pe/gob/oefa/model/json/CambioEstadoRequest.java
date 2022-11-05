package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CambioEstadoRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal idControlPosterior;;
	private BigDecimal idSolicitud;
	private BigDecimal idEstadoOirgen;
	private BigDecimal idEstadoDestino;
	private Date fecha;
	private Date fechaSuspension;
	private String motivo;

	public CambioEstadoRequest() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getIdControlPosterior() {
		return idControlPosterior;
	}

	public void setIdControlPosterior(BigDecimal idControlPosterior) {
		this.idControlPosterior = idControlPosterior;
	}

	public BigDecimal getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(BigDecimal idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public BigDecimal getIdEstadoOirgen() {
		return idEstadoOirgen;
	}

	public void setIdEstadoOirgen(BigDecimal idEstadoOirgen) {
		this.idEstadoOirgen = idEstadoOirgen;
	}

	public BigDecimal getIdEstadoDestino() {
		return idEstadoDestino;
	}

	public void setIdEstadoDestino(BigDecimal idEstadoDestino) {
		this.idEstadoDestino = idEstadoDestino;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

}
