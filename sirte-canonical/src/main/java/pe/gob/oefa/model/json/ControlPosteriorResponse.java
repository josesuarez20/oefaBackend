package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ControlPosteriorResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal idControlPosterior;
	private BigDecimal solicitudId;
	private Date fecha;
	private String estado;
	private int conforme;
	private BigDecimal flgactivo;
	private BigDecimal estadoDestinoId;
	private String observacion;
	private Date creado;
	private String creadoPor;
	private String modificadoPor;
	private String usuarioControl;

	public ControlPosteriorResponse() {
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

	public BigDecimal getFlgactivo() {
		return flgactivo;
	}

	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
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

	public BigDecimal getEstadoDestinoId() {
		return estadoDestinoId;
	}

	public void setEstadoDestinoId(BigDecimal estadoDestinoId) {
		this.estadoDestinoId = estadoDestinoId;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getCreadoPor() {
		return creadoPor;
	}

	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	public String getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}

	public String getUsuarioControl() {
		return usuarioControl;
	}

	public void setUsuarioControl(String usuarioControl) {
		this.usuarioControl = usuarioControl;
	}
	

}
