package pe.gob.oefa.srsalas.dto.seguridad;

import java.io.Serializable;

public class PerfilDTO implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 881843350560543044L;
	private Integer perfilId;
	private String nombre;
	 public PerfilDTO() {
		// TODO Auto-generated constructor stub
	}
	 
	public PerfilDTO(Integer perfilId, String nombre) {
		super();
		this.perfilId = perfilId;
		this.nombre = nombre;
	}

	public Integer getPerfilId() {
		return perfilId;
	}
	public void setPerfilId(Integer perfilId) {
		this.perfilId = perfilId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	 
 

}
