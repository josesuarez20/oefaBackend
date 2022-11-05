package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GrupoCarreraMateriaResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal grupoCarreraMateriaId;
	private BigDecimal grupoCarreraId;
	private BigDecimal materiaId;
	private BigDecimal flgactivo;
	
	public GrupoCarreraMateriaResponse() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getGrupoCarreraMateriaId() {
		return grupoCarreraMateriaId;
	}
	public BigDecimal getMateriaId() {
		return materiaId;
	}
	public void setGrupoCarreraMateriaId(BigDecimal grupoCarreraMateriaId) {
		this.grupoCarreraMateriaId = grupoCarreraMateriaId;
	}
	public void setMateriaId(BigDecimal materiaId) {
		this.materiaId = materiaId;
	}
	public BigDecimal getGrupoCarreraId() {
		return grupoCarreraId;
	}
	public void setGrupoCarreraId(BigDecimal grupoCarreraId) {
		this.grupoCarreraId = grupoCarreraId;
	}
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
}
