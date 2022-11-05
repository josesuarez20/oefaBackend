package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.core.CollectionResponse;

@JsonInclude(Include.NON_NULL)
public class CategoriaNivelResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private String nivelId;
	private String categoriaId;
	private String nombre;
	private BigDecimal flgSel;
	private BigDecimal solicitudId;
	private BigDecimal solCatNvlId;
	private String habilitado;
	private String requisito;
	private String flgModifica;

	private CollectionResponse<CategoriaNivelResponse> categoriaNivel;

	public CategoriaNivelResponse(String categoriaId, String nombre) {
		super();
		this.categoriaId = categoriaId;
		this.nombre = nombre;
	}

	public CategoriaNivelResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSolCatNvlId() {
		return solCatNvlId;
	}

	public void setSolCatNvlId(BigDecimal solCatNvlId) {
		this.solCatNvlId = solCatNvlId;
	}

	public String getNivelId() {
		return nivelId;
	}

	public void setNivelId(String nivelId) {
		this.nivelId = nivelId;
	}

	public String getCategoriaId() {
		return categoriaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setCategoriaId(String categoriaId) {
		this.categoriaId = categoriaId;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getFlgSel() {
		return flgSel;
	}

	public void setFlgSel(BigDecimal flgSel) {
		this.flgSel = flgSel;
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public CollectionResponse<CategoriaNivelResponse> getCategoriaNivel() {
		return categoriaNivel;
	}

	public void setCategoriaNivel(CollectionResponse<CategoriaNivelResponse> categoriaNivel) {
		this.categoriaNivel = categoriaNivel;
	}

	public String getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}

	public String getRequisito() {
		return requisito;
	}

	public void setRequisito(String requisito) {
		this.requisito = requisito;
	}

	public String getFlgModifica() {
		return flgModifica;
	}

	public void setFlgModifica(String flgModifica) {
		this.flgModifica = flgModifica;
	}
	
	
}
