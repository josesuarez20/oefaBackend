package pe.gob.oefa.sirte.dto;

import java.math.BigDecimal;

import pe.gob.oefa.core.dto.BaseDTO;

public class DocumentoDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8739601087968324113L;

	private BigDecimal documentoId;
	//private BigDecimal reunionId;
	private String tipoDocumentoCodigo;
	private String nombre;
	private String uuid;
	private byte[] fileContent;
	private BigDecimal flgactivo;
	private String ubicacionDocumento;
	private String tipoDocumento;

	public DocumentoDTO() {
	}
	public BigDecimal getDocumentoId() {
		return documentoId;
	}
	public void setDocumentoId(BigDecimal documentoId) {
		this.documentoId = documentoId;
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
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public byte[] getFileContent() {
		return fileContent;
	}
	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
	public String getUbicacionDocumento() {
		return ubicacionDocumento;
	}
	public void setUbicacionDocumento(String ubicacionDocumento) {
		this.ubicacionDocumento = ubicacionDocumento;
	}
}
