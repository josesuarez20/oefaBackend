package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AreaSigedResponse implements Serializable{
	
	private static final long serialVersionUID = 2112699059011517992L;
	
	private String estado;
	private String mensaje;
	private List<AreaBaseSigedResponse> areas;
	
	
	public AreaSigedResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public List<AreaBaseSigedResponse> getAreas() {
		return areas;
	}
	public void setAreas(List<AreaBaseSigedResponse> areas) {
		this.areas = areas;
	}
	
	

}
