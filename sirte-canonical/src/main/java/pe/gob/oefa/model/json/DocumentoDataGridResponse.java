package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DocumentoDataGridResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4525156103827919736L;

	private BigDecimal documentoId;
	private BigDecimal reunionId;
	private String tipoDocumento;
	private String nombre;
	private String uuid;

	public DocumentoDataGridResponse() {
	}

	/**
	 * @return the documentoId
	 */
	public BigDecimal getDocumentoId() {
		return documentoId;
	}

	/**
	 * @param documentoId
	 *            the documentoId to set
	 */
	public void setDocumentoId(BigDecimal documentoId) {
		this.documentoId = documentoId;
	}

	/**
	 * @return the reunionId
	 */
	public BigDecimal getReunionId() {
		return reunionId;
	}

	/**
	 * @param reunionId
	 *            the reunionId to set
	 */
	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

	/**
	 * @return the tipoDocumento
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento
	 *            the tipoDocumento to set
	 */
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid
	 *            the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
