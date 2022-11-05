package pe.gob.oefa.model.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.core.CollectionResponse;

@JsonInclude(Include.NON_NULL)
public class SolicitudCombosResponse implements Serializable {

	private static final long serialVersionUID = 5977330143335607720L;

	private CollectionResponse<ComboResponse> comboSede;
	private CollectionResponse<ComboResponse> comboSala;
	private CollectionResponse<ComboResponse> comboArea;
	private CollectionResponse<ComboResponse> comboTipoReunion;
	private CollectionResponse<ComboResponse> comboEstadoSolicitud;
	private CollectionResponse<ComboResponse> comboSolicitante;
	private CollectionResponse<ComboResponse> comboUbicacion;
	private CollectionResponse<ComboResponse> comboTipoVia;
	private CollectionResponse<ComboResponse> comboTipoZona;
	private CollectionResponse<ComboResponse> comboGrado;
	private CollectionResponse<ComboResponse> comboTipoInstitucion;
	private CollectionResponse<ComboResponse> comboTipoEntidad;

	private CollectionResponse<ComboResponse> comboCarrera;
	private CollectionResponse<ComboResponse> comboColegio;
	private CollectionResponse<ComboResponse> comboInstitucion;
	private CollectionResponse<ComboResponse> comboOtroGrado;
	private CollectionResponse<ComboResponse> comboActividad;
	private CollectionResponse<ComboResponse> comboGradoAcademico;
	private CollectionResponse<ComboResponse> comboMotivoCancelacion;
	private CollectionResponse<ComboResponse> comboEspecialidad;
	private CollectionResponse<ComboResponse> comboMateria;
	private CollectionResponse<ComboResponse> comboTipoVinculo;
	
	private Boolean exportar;

	private CollectionResponse<ComboResponse> comboEstado;

	public SolicitudCombosResponse() {
	}

	public CollectionResponse<ComboResponse> getComboTipoEntidad() {
		return comboTipoEntidad;
	}

	public void setComboTipoEntidad(CollectionResponse<ComboResponse> comboTipoEntidad) {
		this.comboTipoEntidad = comboTipoEntidad;
	}

	public CollectionResponse<ComboResponse> getComboOtroGrado() {
		return comboOtroGrado;
	}

	public void setComboOtroGrado(CollectionResponse<ComboResponse> comboOtroGrado) {
		this.comboOtroGrado = comboOtroGrado;
	}

	public CollectionResponse<ComboResponse> getComboGrado() {
		return comboGrado;
	}

	public void setComboGrado(CollectionResponse<ComboResponse> comboGrado) {
		this.comboGrado = comboGrado;
	}

	public CollectionResponse<ComboResponse> getComboCarrera() {
		return comboCarrera;
	}

	public void setComboCarrera(CollectionResponse<ComboResponse> comboCarrera) {
		this.comboCarrera = comboCarrera;
	}

	public CollectionResponse<ComboResponse> getComboTipoVia() {
		return comboTipoVia;
	}

	public CollectionResponse<ComboResponse> getComboTipoInstitucion() {
		return comboTipoInstitucion;
	}

	public void setComboTipoInstitucion(CollectionResponse<ComboResponse> comboTipoInstitucion) {
		this.comboTipoInstitucion = comboTipoInstitucion;
	}

	public CollectionResponse<ComboResponse> getComboTipoZona() {
		return comboTipoZona;
	}

	public void setComboTipoVia(CollectionResponse<ComboResponse> comboTipoVia) {
		this.comboTipoVia = comboTipoVia;
	}

	public void setComboTipoZona(CollectionResponse<ComboResponse> comboTipoZona) {
		this.comboTipoZona = comboTipoZona;
	}

	public CollectionResponse<ComboResponse> getComboEstado() {
		return comboEstado;
	}

	public void setComboEstado(CollectionResponse<ComboResponse> comboEstado) {
		this.comboEstado = comboEstado;
	}

	public CollectionResponse<ComboResponse> getComboSala() {
		return comboSala;
	}

	public void setComboSala(CollectionResponse<ComboResponse> comboSala) {
		this.comboSala = comboSala;
	}

	public CollectionResponse<ComboResponse> getComboEstadoSolicitud() {
		return comboEstadoSolicitud;
	}

	public void setComboEstadoSolicitud(CollectionResponse<ComboResponse> comboEstadoSolicitud) {
		this.comboEstadoSolicitud = comboEstadoSolicitud;
	}

	public CollectionResponse<ComboResponse> getComboSede() {
		return comboSede;
	}

	public void setComboSede(CollectionResponse<ComboResponse> comboSede) {
		this.comboSede = comboSede;
	}

	public CollectionResponse<ComboResponse> getComboArea() {
		return comboArea;
	}

	public void setComboArea(CollectionResponse<ComboResponse> comboArea) {
		this.comboArea = comboArea;
	}

	public CollectionResponse<ComboResponse> getComboTipoReunion() {
		return comboTipoReunion;
	}

	public void setComboTipoReunion(CollectionResponse<ComboResponse> comboTipoReunion) {
		this.comboTipoReunion = comboTipoReunion;
	}

	public CollectionResponse<ComboResponse> getComboSolicitante() {
		return comboSolicitante;
	}

	public void setComboSolicitante(CollectionResponse<ComboResponse> comboSolicitante) {
		this.comboSolicitante = comboSolicitante;
	}

	public CollectionResponse<ComboResponse> getComboUbicacion() {
		return comboUbicacion;
	}

	public void setComboUbicacion(CollectionResponse<ComboResponse> comboUbicacion) {
		this.comboUbicacion = comboUbicacion;
	}

	public CollectionResponse<ComboResponse> getComboActividad() {
		return comboActividad;
	}

	public void setComboActividad(CollectionResponse<ComboResponse> comboActividad) {
		this.comboActividad = comboActividad;
	}

	public CollectionResponse<ComboResponse> getComboColegio() {
		return comboColegio;
	}

	public void setComboColegio(CollectionResponse<ComboResponse> comboColegio) {
		this.comboColegio = comboColegio;
	}

	public CollectionResponse<ComboResponse> getComboInstitucion() {
		return comboInstitucion;
	}

	public void setComboInstitucion(CollectionResponse<ComboResponse> comboInstitucion) {
		this.comboInstitucion = comboInstitucion;
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

	public CollectionResponse<ComboResponse> getComboGradoAcademico() {
		return comboGradoAcademico;
	}

	public void setComboGradoAcademico(CollectionResponse<ComboResponse> comboGradoAcademico) {
		this.comboGradoAcademico = comboGradoAcademico;
	}

	public CollectionResponse<ComboResponse> getComboMotivoCancelacion() {
		return comboMotivoCancelacion;
	}

	public void setComboMotivoCancelacion(CollectionResponse<ComboResponse> comboMotivoCancelacion) {
		this.comboMotivoCancelacion = comboMotivoCancelacion;
	}

	public CollectionResponse<ComboResponse> getComboEspecialidad() {
		return comboEspecialidad;
	}

	public void setComboEspecialidad(CollectionResponse<ComboResponse> comboEspecialidad) {
		this.comboEspecialidad = comboEspecialidad;
	}

	public CollectionResponse<ComboResponse> getComboMateria() {
		return comboMateria;
	}

	public void setComboMateria(CollectionResponse<ComboResponse> comboMateria) {
		this.comboMateria = comboMateria;
	}

	public CollectionResponse<ComboResponse> getComboTipoVinculo() {
		return comboTipoVinculo;
	}

	public void setComboTipoVinculo(CollectionResponse<ComboResponse> comboTipoVinculo) {
		this.comboTipoVinculo = comboTipoVinculo;
	}
	
}
