package pe.gob.oefa.sirte.dto;

import java.io.File;
import java.io.Serializable;
import java.util.List;

 

public class ReporteResponseDTO   implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3369525503709454264L;
	private byte[] fileContent;
	private String nombre;
	private File file;
	private String contentType;
	private String extension;
	private List<ReporteResponseDTO> documentos;

	public ReporteResponseDTO() {
		// TODO Auto-generated constructor stub
	}

	public ReporteResponseDTO(String nombre) {
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

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
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

	public List<ReporteResponseDTO> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<ReporteResponseDTO> documentos) {
		this.documentos = documentos;
	}

}
