package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class DocumentoFiltroRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2587504026196781804L;
	private String tipoDocumentoCodigo;
	private String nombre;
	private BigDecimal reunionId;
	public DocumentoFiltroRequest() {
		 
	}
	 
	public String getTipoDocumentoCodigo() {
		return tipoDocumentoCodigo;
	}

	public void setTipoDocumentoCodigo(String tipoDocumentoCodigo) {
		this.tipoDocumentoCodigo = tipoDocumentoCodigo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getReunionId() {
		return reunionId;
	}

	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}
	
}
