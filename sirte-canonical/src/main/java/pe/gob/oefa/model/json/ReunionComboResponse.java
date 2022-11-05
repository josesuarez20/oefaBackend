package pe.gob.oefa.model.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.core.CollectionResponse;

@JsonInclude(Include.NON_NULL)
public class ReunionComboResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 864973452959684539L;

	private CollectionResponse<ComboResponse> comboUbicacion;
	private CollectionResponse<ComboResponse> comboEstado;
	private CollectionResponse<ComboResponse> comboTipoReunion;
	private CollectionResponse<ComboResponse> comboArea;
	private CollectionResponse<ComboResponse> comboSolicitante;
	private Boolean exportar;
	private String perfil;

	public ReunionComboResponse() {
	}

	/**
	 * @return the comboSede
	 */

	/**
	 * @return the comboEstado
	 */
	public CollectionResponse<ComboResponse> getComboEstado() {
		return comboEstado;
	}

	public CollectionResponse<ComboResponse> getComboUbicacion() {
		return comboUbicacion;
	}

	public void setComboUbicacion(CollectionResponse<ComboResponse> comboUbicacion) {
		this.comboUbicacion = comboUbicacion;
	}

	/**
	 * @param comboEstado
	 *            the comboEstado to set
	 */
	public void setComboEstado(CollectionResponse<ComboResponse> comboEstado) {
		this.comboEstado = comboEstado;
	}

	/**
	 * @return the comboTipoReunion
	 */
	public CollectionResponse<ComboResponse> getComboTipoReunion() {
		return comboTipoReunion;
	}

	/**
	 * @param comboTipoReunion
	 *            the comboTipoReunion to set
	 */
	public void setComboTipoReunion(CollectionResponse<ComboResponse> comboTipoReunion) {
		this.comboTipoReunion = comboTipoReunion;
	}

	/**
	 * @return the comboArea
	 */
	public CollectionResponse<ComboResponse> getComboArea() {
		return comboArea;
	}

	/**
	 * @param comboArea
	 *            the comboArea to set
	 */
	public void setComboArea(CollectionResponse<ComboResponse> comboArea) {
		this.comboArea = comboArea;
	}

	public CollectionResponse<ComboResponse> getComboSolicitante() {
		return comboSolicitante;
	}

	public void setComboSolicitante(CollectionResponse<ComboResponse> comboSolicitante) {
		this.comboSolicitante = comboSolicitante;
	}

	/**
	 * @return the exportar
	 */
	public Boolean getExportar() {
		return exportar;
	}

	/**
	 * @param exportar
	 *            the exportar to set
	 */
	public void setExportar(Boolean exportar) {
		this.exportar = exportar;
	}

	/**
	 * @return the perfil
	 */
	public String getPerfil() {
		return perfil;
	}
	
	/**
	 * @param exportar
	 * the perfil to set
	 */

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}
