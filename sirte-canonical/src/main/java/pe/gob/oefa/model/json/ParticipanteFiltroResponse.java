package pe.gob.oefa.model.json;

import java.io.Serializable;

import pe.gob.oefa.model.core.CollectionResponse;

public class ParticipanteFiltroResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3775122065779251792L;
	
	private CollectionResponse<ComboResponse> comboUbicacion;
	private CollectionResponse<PersonaResponse> comboUsuario;
	private CollectionResponse<ComboResponse> comboUsuarioRender;
	private Integer capacidadSala;
	

	public ParticipanteFiltroResponse() {
	}

	 

	public CollectionResponse<ComboResponse> getComboUbicacion() {
		return comboUbicacion;
	}



	public void setComboUbicacion(CollectionResponse<ComboResponse> comboUbicacion) {
		this.comboUbicacion = comboUbicacion;
	}



	public CollectionResponse<PersonaResponse> getComboUsuario() {
		return comboUsuario;
	}



	public void setComboUsuario(CollectionResponse<PersonaResponse> comboUsuario) {
		this.comboUsuario = comboUsuario;
	}



	public CollectionResponse<ComboResponse> getComboUsuarioRender() {
		return comboUsuarioRender;
	}



	public void setComboUsuarioRender(CollectionResponse<ComboResponse> comboUsuarioRender) {
		this.comboUsuarioRender = comboUsuarioRender;
	}



	public Integer getCapacidadSala() {
		return capacidadSala;
	}



	public void setCapacidadSala(Integer capacidadSala) {
		this.capacidadSala = capacidadSala;
	}


 

 
 
}
