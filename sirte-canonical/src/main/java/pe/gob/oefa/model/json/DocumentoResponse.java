package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class DocumentoResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8739601087968324113L;
	private BigDecimal documentoId;
	private BigDecimal reunionId;
	private String tipoDocumentoCodigo;
	private String nombre;
	private String uuid;
	private BigDecimal flgactivo;

	private byte[] fileContent;

	public DocumentoResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getDocumentoId() {
		return documentoId;
	}

	public void setDocumentoId(BigDecimal documentoId) {
		this.documentoId = documentoId;
	}

	public BigDecimal getReunionId() {
		return reunionId;
	}

	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

	public String getTipoDocumentoCodigo() {
		return tipoDocumentoCodigo;
	}

	public void setTipoDocumentoCodigo(String tipoDocumentoCodigo) {
		this.tipoDocumentoCodigo = tipoDocumentoCodigo;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte[] getFileContent() {
		return fileContent;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public BigDecimal getFlgactivo() {
		return flgactivo;
	}

	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
 
}
