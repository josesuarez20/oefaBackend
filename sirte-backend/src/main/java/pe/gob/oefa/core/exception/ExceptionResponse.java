package pe.gob.oefa.core.exception;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import pe.gob.oefa.util.DateUtil;

public class ExceptionResponse {

	private String message;
	private String details;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Timestamp timestamp;

	public ExceptionResponse(String message, String details) {
		super();
		this.timestamp = DateUtil.getCurrentTimestamp();
		this.message = message;
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

}
