package pe.gob.oefa.sirte.dto;



import pe.gob.oefa.core.dto.BaseDTO;

public class CredencialesUsuarioSSODTO  extends BaseDTO {
	
	private static final long serialVersionUID = -5755883238715448589L;		
	private String 		usuario;
	private String 		clave;
	
	public CredencialesUsuarioSSODTO() 
	{
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	



}
