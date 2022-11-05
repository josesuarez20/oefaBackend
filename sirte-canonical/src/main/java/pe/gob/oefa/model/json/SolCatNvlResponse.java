package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolCatNvlResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solCatNvlId;
	private BigDecimal solicitudId;
	private String catalogoId;
	private BigDecimal flgactivo;
	private BigDecimal flgmarcado;
	private String habilitado;
		
	public SolCatNvlResponse() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getSolCatNvlId() {
		return solCatNvlId;
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}
	public String getCatalogoId() {
		return catalogoId;
	}
	public void setSolCatNvlId(BigDecimal solCatNvlId) {
		this.solCatNvlId = solCatNvlId;
	}
	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
	public void setCatalogoId(String catalogoId) {
		this.catalogoId = catalogoId;
	}
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
	public BigDecimal getFlgmarcado() {
		return flgmarcado;
	}
	public void setFlgmarcado(BigDecimal flgmarcado) {
		this.flgmarcado = flgmarcado;
	}
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	
}
