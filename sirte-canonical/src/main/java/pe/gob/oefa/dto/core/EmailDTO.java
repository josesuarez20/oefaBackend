package pe.gob.oefa.dto.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmailDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6536915072135992006L;

	private List<String> tos;
	private List<String> cc;
	private List<String> bcc;
	private String subject;
	private String content;
	private String contentType;
	private List<Object> attachments;
	private Map<String, Object> parameters;
	private String template;
	private byte[] iCalendar;
	private byte[] fileContent;
	private String fileName;
	private String fileContentType;

	public EmailDTO() {
		contentType = "text/plain";
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

	/**
	 * @return the tos
	 */
	public List<String> getTos() {
		return tos;
	}

	/**
	 * @param tos
	 *            the tos to set
	 */
	public void setTos(List<String> tos) {
		this.tos = tos;
	}

	/**
	 * @return the cc
	 */
	public List<String> getCc() {
		if (cc == null) {
			cc = new ArrayList<>();
		}
		return cc;
	}

	/**
	 * @param cc
	 *            the cc to set
	 */
	public void setCc(List<String> cc) {
		this.cc = cc;
	}

	/**
	 * @return the bcc
	 */
	public List<String> getBcc() {
		if (bcc == null) {
			bcc = new ArrayList<>();
		}
		return bcc;
	}

	/**
	 * @param bcc
	 *            the bcc to set
	 */
	public void setBcc(List<String> bcc) {
		this.bcc = bcc;
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @param contentType
	 *            the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * @return the attachments
	 */
	public List<Object> getAttachments() {
		return attachments;
	}

	/**
	 * @param attachments
	 *            the attachments to set
	 */
	public void setAttachments(List<Object> attachments) {
		this.attachments = attachments;
	}

	/**
	 * @return the parameters
	 */
	public Map<String, Object> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters
	 *            the parameters to set
	 */
	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	/**
	 * @return the template
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * @param template
	 *            the template to set
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

}
