package pe.gob.oefa.core.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

import pe.gob.oefa.core.exception.CoreException;

public class ExceptionUtils {

	private static final List<String> ERROR_CODE_LIST = Arrays.asList("BU");
	
	/**
	 * 
	 * @param ex
	 * @param booleanSupplier
	 * @return
	 */
	public static HttpStatus getHeaderStatus(Exception ex, Boolean hasText) {
		
		if(ex instanceof CoreException) {
			return getHeaderStatusForCore((CoreException) ex, hasText);
		}
		return HttpStatus.INTERNAL_SERVER_ERROR;
	}
	
	

	private static HttpStatus getHeaderStatusForCore(CoreException ex, boolean hasText) {
		boolean isBusiness = isBusinessType(ex.getErrorCode());
		return isBusiness && hasText ? HttpStatus.NOT_FOUND
				: HttpStatus.INTERNAL_SERVER_ERROR;
	}
	
	private static boolean isBusinessType(String code) {
		return !ERROR_CODE_LIST.contains(code);
	}
}
