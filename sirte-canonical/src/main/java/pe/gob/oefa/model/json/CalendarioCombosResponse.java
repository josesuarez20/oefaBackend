package pe.gob.oefa.model.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.core.CollectionResponse;

@JsonInclude(Include.NON_NULL)
public class CalendarioCombosResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5977330143335607720L;

	private CollectionResponse<ComboResponse> comboSede;
	private CollectionResponse<ComboResponse> comboSala;
	private CollectionResponse<ComboResponse> comboSolicitante;
	private CollectionResponse<ComboResponse> comboEstadoReunion;
	private CollectionResponse<ComboResponse> comboUbicacion;
	

	public CalendarioCombosResponse() {
	}

	/**
	 * @return the comboSede
	 */
	public CollectionResponse<ComboResponse> getComboSede() {
		return comboSede;
	}

	public CollectionResponse<ComboResponse> getComboSala() {
		return comboSala;
	}

	public CollectionResponse<ComboResponse> getComboSolicitante() {
		return comboSolicitante;
	}

	public void setComboSolicitante(CollectionResponse<ComboResponse> comboSolicitante) {
		this.comboSolicitante = comboSolicitante;
	}

	public CollectionResponse<ComboResponse> getComboEstadoReunion() {
		return comboEstadoReunion;
	}

	public void setComboEstadoReunion(CollectionResponse<ComboResponse> comboEstadoReunion) {
		this.comboEstadoReunion = comboEstadoReunion;
	}

	public void setComboSede(CollectionResponse<ComboResponse> comboSede) {
		this.comboSede = comboSede;
	}

	public void setComboSala(CollectionResponse<ComboResponse> comboSala) {
		this.comboSala = comboSala;
	}

	public CollectionResponse<ComboResponse> getComboUbicacion() {
		return comboUbicacion;
	}

	public void setComboUbicacion(CollectionResponse<ComboResponse> comboUbicacion) {
		this.comboUbicacion = comboUbicacion;
	}

}
