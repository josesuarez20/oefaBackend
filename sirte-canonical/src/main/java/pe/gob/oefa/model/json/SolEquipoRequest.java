package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolEquipoRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solEquipoId;
	private BigDecimal solicitudId;
	private BigDecimal registroId;
	private BigDecimal flgactivo;
	private String ruc;
	private String estadoId;
	private String especialidadId;
	private String solicitante;
	private Boolean seleccionado;
	
	//auxiliar
	private Boolean soloequipo;
	
					
	public SolEquipoRequest() {
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
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getEstadoId() {
		return estadoId;
	}
	public void setEstadoId(String estadoId) {
		this.estadoId = estadoId;
	}
	public String getEspecialidadId() {
		return especialidadId;
	}
	public void setEspecialidadId(String especialidadId) {
		this.especialidadId = especialidadId;
	}
	public String getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	public Boolean getSeleccionado() {
		if(seleccionado == null) {
			seleccionado = false;
		}
		return seleccionado;
	}
	public void setSeleccionado(Boolean seleccionado) {
		this.seleccionado = seleccionado;
	}
	public Boolean getSoloequipo() {
		if(soloequipo == null) {
			soloequipo = false;
		}
		return soloequipo;
	}
	public void setSoloequipo(Boolean soloequipo) {
		this.soloequipo = soloequipo;
	}
	
	
}
