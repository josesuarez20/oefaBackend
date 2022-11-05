package pe.gob.oefa.model.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.core.CollectionResponse;

@JsonInclude(Include.NON_NULL)
public class ActaCombosResponse implements Serializable {

	private static final long serialVersionUID = -8999496192484743542L;
	private CollectionResponse<ComboResponse> comboTipoContenido;
	private CollectionResponse<ComboResponse> comboResponsable;

	public ActaCombosResponse() {
		 
	}
	
	public CollectionResponse<ComboResponse> getComboTipoContenido() {
		return comboTipoContenido;
	}

	public void setComboTipoContenido(CollectionResponse<ComboResponse> comboTipoContenido) {
		this.comboTipoContenido = comboTipoContenido;
	}

	public CollectionResponse<ComboResponse> getComboResponsable() {
		return comboResponsable;
	}

	public void setComboResponsable(CollectionResponse<ComboResponse> comboResponsable) {
		this.comboResponsable = comboResponsable;
	}
	
 }
