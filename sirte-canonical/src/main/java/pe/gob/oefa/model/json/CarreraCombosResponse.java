package pe.gob.oefa.model.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.core.CollectionResponse;

@JsonInclude(Include.NON_NULL)
public class CarreraCombosResponse implements Serializable {

	private static final long serialVersionUID = -8999496192484743542L;
	private CollectionResponse<ComboResponse> comboGrupoCarrea;

	public CarreraCombosResponse() {
		 
	}	
	public CollectionResponse<ComboResponse> getComboGrupoCarrera() {
		return comboGrupoCarrea;
	}
	public void setComboGrupoCarrera(CollectionResponse<ComboResponse> comboGrupoCarrea) {
		this.comboGrupoCarrea = comboGrupoCarrea;
	}
 }
