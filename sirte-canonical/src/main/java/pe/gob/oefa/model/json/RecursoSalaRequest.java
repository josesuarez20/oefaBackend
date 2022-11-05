package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

public class RecursoSalaRequest extends BaseRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal recursoSalaId;
	private BigDecimal salaId;
	private String recursoCodigo;
	private String nombreEncargado;
	private String correoEncargado;
	private String usuarioEncargado;
	private String usuarioDni;
	public RecursoSalaRequest() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getRecursoSalaId() {
		return recursoSalaId;
	}
	public void setRecursoSalaId(BigDecimal recursoSalaId) {
		this.recursoSalaId = recursoSalaId;
	}
	public BigDecimal getSalaId() {
		return salaId;
	}
	public void setSalaId(BigDecimal salaId) {
		this.salaId = salaId;
	}
	public String getRecursoCodigo() {
		return recursoCodigo;
	}
	public void setRecursoCodigo(String recursoCodigo) {
		this.recursoCodigo = recursoCodigo;
	}
	 
	public String getNombreEncargado() {
		return nombreEncargado;
	}
	public void setNombreEncargado(String nombreEncargado) {
		this.nombreEncargado = nombreEncargado;
	}
	public String getCorreoEncargado() {
		return correoEncargado;
	}
	public void setCorreoEncargado(String correoEncargado) {
		this.correoEncargado = correoEncargado;
	}
	public String getUsuarioEncargado() {
		return usuarioEncargado;
	}
	public void setUsuarioEncargado(String usuarioEncargado) {
		this.usuarioEncargado = usuarioEncargado;
	}
	public String getUsuarioDni() {
		return usuarioDni;
	}
	public void setUsuarioDni(String usuarioDni) {
		this.usuarioDni = usuarioDni;
	}
	
}
