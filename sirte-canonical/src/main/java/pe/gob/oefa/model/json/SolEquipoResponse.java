package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolEquipoResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solEquipoId;
	private BigDecimal solicitudId;
	private BigDecimal registroId;
	private BigDecimal flgactivo;
	private String nombre;
	private String especialidad;
	private String especialidadId;
	private String estado;
	private String estadoId;
	private boolean seleccionado;
	private BigDecimal usuarioId;
	private String ruc;
	private BigDecimal flgmarcado;

	public SolEquipoResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSolEquipoId() {
		return solEquipoId;
	}

	public BigDecimal getRegistroId() {
		return registroId;
	}

	public void setSolEquipoId(BigDecimal solEquipoId) {
		this.solEquipoId = solEquipoId;
	}

	public void setRegistroId(BigDecimal registroId) {
		this.registroId = registroId;
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public BigDecimal getFlgactivo() {
		return flgactivo;
	}

	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidadId() {
		return especialidadId;
	}

	public void setEspecialidadId(String especialidadId) {
		this.especialidadId = especialidadId;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstadoId() {
		return estadoId;
	}

	public void setEstadoId(String estadoId) {
		this.estadoId = estadoId;
	}

	public boolean isSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(boolean seleccionado) {
		this.seleccionado = seleccionado;
	}

	public BigDecimal getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(BigDecimal usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public BigDecimal getFlgmarcado() {
		if (flgmarcado == null) {
			flgmarcado = BigDecimal.ZERO;
		}
		return flgmarcado;
	}

	public void setFlgmarcado(BigDecimal flgmarcado) {
		this.flgmarcado = flgmarcado;
	}

}
