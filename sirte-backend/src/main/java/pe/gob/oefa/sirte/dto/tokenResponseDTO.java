package pe.gob.oefa.sirte.dto;

import java.math.BigDecimal;

import pe.gob.oefa.core.dto.BaseDTO;

public class tokenResponseDTO  extends BaseDTO {
	
	private static final long serialVersionUID = -5755883238715448589L;	
	private String 		token;
	
	public tokenResponseDTO() 
	{
		
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	

}
