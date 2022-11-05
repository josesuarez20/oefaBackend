package pe.gob.oefa.srsalas.dto.seguridad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UsuarioModelDTO implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 2139420831541954652L;
	private Integer usuarioId;
	private String usuario;
	private String nombre;
	private String areaId;
	private String area;
	private String cargoId;
	private String cargo;
	private String dni;
	private String email;
	private List<PerfilDTO> perfiles;
	private String ip;
	private String unidadOrganicaId;
	private String perfilId;
	private String rol;
	public UsuarioModelDTO() {
		this.perfiles=new ArrayList<>();
	}
	
	 
	public Integer getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCargoId() {
		return cargoId;
	}
	public void setCargoId(String cargoId) {
		this.cargoId = cargoId;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<PerfilDTO> getPerfiles() {
		return perfiles;
	}
	public void setPerfiles(List<PerfilDTO> perfiles) {
		this.perfiles = perfiles;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUnidadOrganicaId() {
		return unidadOrganicaId;
	}
	public void setUnidadOrganicaId(String unidadOrganicaId) {
		this.unidadOrganicaId = unidadOrganicaId;
	}
	public String getPerfilId() {
		return perfilId;
	}
	public void setPerfilId(String perfilId) {
		this.perfilId = perfilId;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	 	
}
