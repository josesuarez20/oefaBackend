package pe.gob.oefa.core.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import pe.gob.oefa.core.exception.CoreException;
import pe.gob.oefa.core.exception.ExceptionResponse;
import pe.gob.oefa.core.exception.ServiceException;
import pe.gob.oefa.core.util.ExceptionUtils;
import pe.gob.oefa.dto.json.ErrorResponse;
import pe.gob.oefa.dto.json.ErrorType;

@RestControllerAdvice
public class CoreControllerAdvice {

	private static final String DEFAULT_MESSAGE = "Lo sentimos, en este momento no podemos atenderlo";
	
	@Autowired
	private Environment environment;
	
	@ExceptionHandler
	public ResponseEntity<?> coreException(CoreException ex) {
		ErrorResponse errorResponse = new ErrorResponse(ErrorType.ERROR);
		errorResponse.setCode(ex.getErrorCode());
		String message = this.environment.getProperty(ex.getErrorCode());
		Boolean hasText = StringUtils.hasText(message);
		errorResponse.setMessage(hasText ? message: DEFAULT_MESSAGE);
		HttpStatus httpStatus = ExceptionUtils.getHeaderStatus(ex, hasText);
		return ResponseEntity.status(httpStatus).body(errorResponse);
	}
	
	
	@SuppressWarnings("deprecation")
	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<?> serviceException(ServiceException ex) {
		ErrorResponse errorResponse = new ErrorResponse(ErrorType.ERROR);
		errorResponse.setMessage(ex.getMessage());
		errorResponse.setCode(ex.getCode());
		errorResponse.setTrace(ex.fillInStackTrace().toString());
		return ResponseEntity.status(HttpStatus.METHOD_FAILURE).body(errorResponse);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> exception(ServiceException ex) {
		ErrorResponse errorResponse = new ErrorResponse(ErrorType.ERROR);
		errorResponse.setMessage(ex.getMessage());
		errorResponse.setCode(ex.getCode());
		errorResponse.setTrace(ex.fillInStackTrace().toString());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	}
	
	@ExceptionHandler(BadCredentialsException.class)
	public ResponseEntity<?> badCredentialException(BadCredentialsException e){
		ErrorResponse errorResponse = new ErrorResponse(ErrorType.ERROR);
		errorResponse.setMessage(e.getMessage());
		errorResponse.setCode("ERROR");
		errorResponse.setTrace(e.fillInStackTrace().toString());
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errorResponse);
	}
	
//	@ExceptionHandler(Exception.class)
//	public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request) {
//		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(), "Error no controlado");
//		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
	
	
}
