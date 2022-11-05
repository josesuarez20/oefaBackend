package pe.gob.oefa.sirte.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class DocumentoDataGridDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8739601087968324113L;
	private BigDecimal documentoId;	
	private String tipoDocumento;
	private String nombre;
	private String uuid;

	public DocumentoDataGridDTO() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getDocumentoId() {
		return documentoId;
	}

	public void setDocumentoId(BigDecimal documentoId) {
		this.documentoId = documentoId;
	}

	
 

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
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
 
}
