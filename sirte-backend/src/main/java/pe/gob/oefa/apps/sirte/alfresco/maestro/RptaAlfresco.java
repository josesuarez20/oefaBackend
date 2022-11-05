package pe.gob.oefa.apps.sirte.alfresco.maestro;

import java.io.File;
import java.util.List;

import pe.com.alfresco.rest.bean.Status;

public class RptaAlfresco {
	private Status status;
	private String message;
	private String uuid;
	private String time;
	private String server;
	private String fileName;
	private String exception;
	private List<String> callstack;
	private String code;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public List<String> getCallstack() {
		return callstack;
	}

	public void setCallstack(List<String> callstack) {
		this.callstack = callstack;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
