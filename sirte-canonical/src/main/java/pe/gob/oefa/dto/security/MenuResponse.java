package pe.gob.oefa.dto.security;

import java.io.Serializable;
import java.util.List;

public class MenuResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6119192635679620038L;

	private Integer idMenu;
	private Integer paginaPadre;
	private String nombre;
	private String url;
	private String icono;
	private Integer Orden;
	private String mensaje;
	private String perfil;
	private Boolean visible;
	
	private List<MenuResponse> hijos;

	public MenuResponse() {
	}

	public MenuResponse(String nombre, String url, String icono) {
		super();
		this.nombre = nombre;
		this.url = url;
		this.icono = icono;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the icono
	 */
	public String getIcono() {
		return icono;
	}

	/**
	 * @param icono
	 *            the icono to set
	 */
	public void setIcono(String icono) {
		this.icono = icono;
	}

	/**
	 * @return the paginaPadre
	 */
	public Integer getPaginaPadre() {
		return paginaPadre;
	}

	/**
	 * @param paginaPadre
	 *            the paginaPadre to set
	 */
	public void setPaginaPadre(Integer paginaPadre) {
		this.paginaPadre = paginaPadre;
	}

	/**
	 * @return the visible
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * @param visible
	 *            the visible to set
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	/**
	 * @return the idMenu
	 */
	public Integer getIdMenu() {
		return idMenu;
	}

	/**
	 * @param idMenu
	 *            the idMenu to set
	 */
	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}

	/**
	 * @return the hijos
	 */
	public List<MenuResponse> getHijos() {
		return hijos;
	}

	/**
	 * @param hijos the hijos to set
	 */
	public void setHijos(List<MenuResponse> hijos) {
		this.hijos = hijos;
	}
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Integer getOrden() {
		return Orden;
	}

	public void setOrden(Integer orden) {
		Orden = orden;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	
}
