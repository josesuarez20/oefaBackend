package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RecursoSalaDataGridResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -562277274420616495L;

	private BigDecimal recursoSalaId;
	private String nombreEncargado;
	private String correoEncargado;
	private String usuarioEncargado;
	private String recurso;
	private String sala;
	private String recursoCodigo;
	private BigDecimal salaId;

	public RecursoSalaDataGridResponse() {
	}

	/**
	 * @return the recursoSalaId
	 */
	public BigDecimal getRecursoSalaId() {
		return recursoSalaId;
	}

	/**
	 * @param recursoSalaId
	 *            the recursoSalaId to set
	 */
	public void setRecursoSalaId(BigDecimal recursoSalaId) {
		this.recursoSalaId = recursoSalaId;
	}

	 

	/**
	 * @return the nombreEncargado
	 */
	public String getNombreEncargado() {
		return nombreEncargado;
	}

	/**
	 * @param nombreEncargado
	 *            the nombreEncargado to set
	 */
	public void setNombreEncargado(String nombreEncargado) {
		this.nombreEncargado = nombreEncargado;
	}

	/**
	 * @return the correoEncargado
	 */
	public String getCorreoEncargado() {
		return correoEncargado;
	}

	/**
	 * @param correoEncargado
	 *            the correoEncargado to set
	 */
	public void setCorreoEncargado(String correoEncargado) {
		this.correoEncargado = correoEncargado;
	}

	/**
	 * @return the usuarioEncargado
	 */
	public String getUsuarioEncargado() {
		return usuarioEncargado;
	}

	/**
	 * @param usuarioEncargado
	 *            the usuarioEncargado to set
	 */
	public void setUsuarioEncargado(String usuarioEncargado) {
		this.usuarioEncargado = usuarioEncargado;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
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
 

}
