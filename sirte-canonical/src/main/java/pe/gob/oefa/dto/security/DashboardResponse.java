package pe.gob.oefa.dto.security;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DashboardResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8021939157489695987L;

	private String urlFoto;
	private String dni;
	private String nombres;
	private String perfil;
	private String tipodocumento;
	private String correoelectronico;
	private List<MenuResponse> menus;
	private List<MenuResponse> opcioneshome;
	
	//para validar que el registro está cancelado por oefa
	private String flgcancelado;

	public DashboardResponse() {
	}

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres
	 *            the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the menus
	 */
	public List<MenuResponse> getMenus() {
		return menus;
	}

	/**
	 * @param menus
	 *            the menus to set
	 */
	public void setMenus(List<MenuResponse> menus) {
		this.menus = menus;
	}

	/**
	 * @return the urlFoto
	 */
	public String getUrlFoto() {
		return urlFoto;
	}

	/**
	 * @param urlFoto
	 *            the urlFoto to set
	 */
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni
	 *            the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public List<MenuResponse> getOpcioneshome() {
		return opcioneshome;
	}

	public void setOpcioneshome(List<MenuResponse> opcioneshome) {
		this.opcioneshome = opcioneshome;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getFlgcancelado() {
		return flgcancelado;
	}

	public void setFlgcancelado(String flgcancelado) {
		this.flgcancelado = flgcancelado;
	}
	
}
