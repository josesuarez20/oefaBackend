package pe.gob.oefa.dto.json;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FilterErrorResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4972730918495358125L;
	
	private String code;
	private String message;
	private ErrorType type;

	@JsonIgnore
	private HttpStatus httpStatus;

	public FilterErrorResponse() {
	}

	public FilterErrorResponse(String code, String message, ErrorType type, HttpStatus httpStatus) {
		this.code = code;
		this.message = message;
		this.type = type;
		this.httpStatus = httpStatus;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the type
	 */
	public ErrorType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(ErrorType type) {
		this.type = type;
	}

	/**
	 * @return the httpStatus
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * @param httpStatus
	 *            the httpStatus to set
	 */
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
