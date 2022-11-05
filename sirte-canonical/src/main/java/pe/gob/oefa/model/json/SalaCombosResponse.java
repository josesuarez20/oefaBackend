package pe.gob.oefa.model.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.core.CollectionResponse;

@JsonInclude(Include.NON_NULL)
public class SalaCombosResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5977330143335607720L;

	private CollectionResponse<ComboResponse> comboUbicacion;
	private CollectionResponse<ComboResponse> comboTipoSala;
	private CollectionResponse<ComboResponse> comboTipoFlujo;
	private CollectionResponse<ComboResponse> comboTipoAprobacion;
	private CollectionResponse<ComboResponse> comboRecurso;
	private CollectionResponse<ComboResponse> comboArea; 
	private CollectionResponse<ComboResponse> comboUsuario; 

	public SalaCombosResponse() {
	}

	 
	public CollectionResponse<ComboResponse> getComboArea() {
		return comboArea;
	}


	public void setComboArea(CollectionResponse<ComboResponse> comboArea) {
		this.comboArea = comboArea;
	}


	public CollectionResponse<ComboResponse> getComboUbicacion() {
		return comboUbicacion;
	}


	public void setComboUbicacion(CollectionResponse<ComboResponse> comboUbicacion) {
		this.comboUbicacion = comboUbicacion;
	}


	/**
	 * @return the comboTipoSala
	 */
	public CollectionResponse<ComboResponse> getComboTipoSala() {
		return comboTipoSala;
	}

	/**
	 * @param comboTipoSala
	 *            the comboTipoSala to set
	 */
	public void setComboTipoSala(CollectionResponse<ComboResponse> comboTipoSala) {
		this.comboTipoSala = comboTipoSala;
	}

	/**
	 * @return the comboTipoAprobacion
	 */
	public CollectionResponse<ComboResponse> getComboTipoAprobacion() {
		return comboTipoAprobacion;
	}

	/**
	 * @param comboTipoAprobacion
	 *            the comboTipoAprobacion to set
	 */
	public void setComboTipoAprobacion(CollectionResponse<ComboResponse> comboTipoAprobacion) {
		this.comboTipoAprobacion = comboTipoAprobacion;
	}

	public CollectionResponse<ComboResponse> getComboRecurso() {
		return comboRecurso;
	}

	public void setComboRecurso(CollectionResponse<ComboResponse> comboRecurso) {
		this.comboRecurso = comboRecurso;
	}


	public CollectionResponse<ComboResponse> getComboUsuario() {
		return comboUsuario;
	}


	public void setComboUsuario(CollectionResponse<ComboResponse> comboUsuario) {
		this.comboUsuario = comboUsuario;
	}


	public CollectionResponse<ComboResponse> getComboTipoFlujo() {
		return comboTipoFlujo;
	}


	public void setComboTipoFlujo(CollectionResponse<ComboResponse> comboTipoFlujo) {
		this.comboTipoFlujo = comboTipoFlujo;
	}
 
}
