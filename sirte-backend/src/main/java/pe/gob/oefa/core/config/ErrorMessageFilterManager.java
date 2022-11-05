package pe.gob.oefa.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import pe.gob.oefa.dto.json.FilterErrorResponse;

@Component
public class ErrorMessageFilterManager {
	
	@Autowired
	public Environment environment;
	
	
	public FilterErrorResponse generateErrorResponse(Exception e) {
		FilterErrorResponse filterErrorResponse = new FilterErrorResponse();
		//TODO Por Implementar
		return filterErrorResponse;
	}

}
