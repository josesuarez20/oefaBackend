package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.core.CollectionResponse;

@JsonInclude(Include.NON_NULL)
public class CategoriaRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private String categoriaId;
	private String nombre;
	private BigDecimal flgMarcado;
	private BigDecimal solicitudId;
	private List<CategoriaNivelResponse> nivel;
	
	public CategoriaRequest() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
	public BigDecimal getFlgMarcado() {
		return flgMarcado;
	}
	public void setFlgMarcado(BigDecimal flgMarcado) {
		this.flgMarcado = flgMarcado;
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
	public List<CategoriaNivelResponse> getNivel() {
		return nivel;
	}
	public void setNivel(List<CategoriaNivelResponse> nivel) {
		this.nivel = nivel;
	}
}
