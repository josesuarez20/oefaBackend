package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RecursoReunionDataGridResponse implements Serializable {
 

	/**
	 * 
	 */
	private static final long serialVersionUID = 7869470566315291895L;
	private BigDecimal recursoReunionId;
	private BigDecimal reunionId;
	private String recursoCodigo;
	private String sustento;
	private BigDecimal usuarioSolicitanteId;
	private String nombreEncargado;
	private String correoEncargado;
	private String usuarioEncargado;
	private String reunion;
	private String recurso;

	public RecursoReunionDataGridResponse() {
	}

	public BigDecimal getRecursoReunionId() {
		return recursoReunionId;
	}

	public void setRecursoReunionId(BigDecimal recursoReunionId) {
		this.recursoReunionId = recursoReunionId;
	}

	public BigDecimal getReunionId() {
		return reunionId;
	}

	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

	public String getRecursoCodigo() {
		return recursoCodigo;
	}

	public void setRecursoCodigo(String recursoCodigo) {
		this.recursoCodigo = recursoCodigo;
	}

	public String getSustento() {
		return sustento;
	}

	public void setSustento(String sustento) {
		this.sustento = sustento;
	}

	public BigDecimal getUsuarioSolicitanteId() {
		return usuarioSolicitanteId;
	}

	public void setUsuarioSolicitanteId(BigDecimal usuarioSolicitanteId) {
		this.usuarioSolicitanteId = usuarioSolicitanteId;
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

	public String getReunion() {
		return reunion;
	}

	public void setReunion(String reunion) {
		this.reunion = reunion;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}
 
}
