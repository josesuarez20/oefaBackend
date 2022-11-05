package pe.gob.oefa.dto.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailMetaDataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -552764207764159138L;

	private List<String> listTo;
	private List<String> listCc;
	private List<String> listBc;
	private String subject;
	private String contenido;
	private Map<String, Object> parametros = new HashMap<>();
	private byte[] iCalendar;
	private byte[] fileContent;
	private String fileName;
	private String fileContentType;
	private String template;

	public EmailMetaDataDTO() {
	}

	/**
	 * @return the listTo
	 */
	public List<String> getListTo() {
		return listTo;
	}

	/**
	 * @param listTo
	 *            the listTo to set
	 */
	public void setListTo(List<String> listTo) {
		this.listTo = listTo;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido
	 *            the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Map<String, Object> getParametros() {
		return parametros;
	}

	public void setParametros(Map<String, Object> parametros) {
		this.parametros = parametros;
	}

	public byte[] getiCalendar() {
		return iCalendar;
	}

	public void setiCalendar(byte[] iCalendar) {
		this.iCalendar = iCalendar;
	}

	public byte[] getFileContent() {
		return fileContent;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public List<String> getListCc() {
		return listCc;
	}

	public void setListCc(List<String> listCc) {
		this.listCc = listCc;
	}

	public List<String> getListBc() {
		return listBc;
	}

	public void setListBc(List<String> listBc) {
		this.listBc = listBc;
	}

}
