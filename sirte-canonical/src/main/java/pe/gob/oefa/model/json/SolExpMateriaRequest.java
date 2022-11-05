package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolExpMateriaRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solExpMateriaId;
	private BigDecimal solExperienciaId;
	private BigDecimal materiaId;
	private BigDecimal flgactivo;
				
	public SolExpMateriaRequest() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getSolExpMateriaId() {
		return solExpMateriaId;
	}
	public BigDecimal getSolExperienciaId() {
		return solExperienciaId;
	}
	public BigDecimal getMateriaId() {
		return materiaId;
	}
	public void setSolExpMateriaId(BigDecimal solExpMateriaId) {
		this.solExpMateriaId = solExpMateriaId;
	}
	public void setSolExperienciaId(BigDecimal solExperienciaId) {
		this.solExperienciaId = solExperienciaId;
	}
	public void setMateriaId(BigDecimal materiaId) {
		this.materiaId = materiaId;
	}
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
}
