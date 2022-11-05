package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ReporteResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8226750067679844999L;
	private byte[] fileContent;
	private String nombre;
	private String contentType;
	private String extension;
	private List<ReporteResponse> documentos;
	private String mensaje;
	private String codmensaje;
	private BigDecimal auxiliar;
	
	//auxiliares
	private String nombreArchivo;

	public ReporteResponse() {
		// TODO Auto-generated constructor stub
	}

	public ReporteResponse(String nombre) {
		super();
		this.nombre = nombre;
	}

	public byte[] getFileContent() {
		return fileContent;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public List<ReporteResponse> getDocumentos() {
		if (documentos == null) {
			documentos = new ArrayList<>();
		}
		return documentos;
	}

	public void setDocumentos(List<ReporteResponse> documentos) {
		this.documentos = documentos;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getCodmensaje() {
		return codmensaje;
	}

	public void setCodmensaje(String codmensaje) {
		this.codmensaje = codmensaje;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public BigDecimal getAuxiliar() {
		return auxiliar;
	}

	public void setAuxiliar(BigDecimal auxiliar) {
		this.auxiliar = auxiliar;
	}
	

}
