package pe.gob.oefa.core.context;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import pe.gob.oefa.dto.json.ErrorType;
import pe.gob.oefa.dto.json.FilterErrorResponse;
import pe.gob.oefa.util.JSONUtils;

@Component
public class SalasSessionInformationExpiredStrategy implements SessionInformationExpiredStrategy {

	@Autowired
	private ApplicationContext context;
	
	@Override
	public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException, ServletException {
		
		String message = this.context.getMessage("login.session.expired", null,
				"Tu sesión ha finalizado. Ingresa nuevamente para continuar.",
				new Locale("es", "PE"));
		FilterErrorResponse errorResponse = new FilterErrorResponse("999", message, ErrorType.ERROR, HttpStatus.UNAUTHORIZED);
		
		String json = JSONUtils.convertObjectToJson(errorResponse, PropertyNamingStrategy.LOWER_CAMEL_CASE);
		
		HttpServletResponse response = event.getResponse();
		SecurityContextHolder.clearContext();
		response.getStatus();
		response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
		response.getWriter().write(json);
		response.getWriter().close();
	}

}
