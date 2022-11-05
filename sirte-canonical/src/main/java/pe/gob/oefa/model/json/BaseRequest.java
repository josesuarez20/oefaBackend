package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BaseRequest implements Serializable {

	private static final long serialVersionUID = 7007309705257862273L;
	private String creadoPor;
	private String modificadoPor;
	private String eliminadoPor;
	private Date creado;
	private Date modificado;
	private Date eliminado;
	
	private String habilitado;

	public BaseRequest() {
		// TODO Auto-generated constructor stub
	}
	public String getCreadoPor() {
		return creadoPor;
	}
	public String getModificadoPor() {
		return modificadoPor;
	}
	public String getEliminadoPor() {
		return eliminadoPor;
	}
	public Date getCreado() {
		return creado;
	}
	public Date getModificado() {
		return modificado;
	}
	public Date getEliminado() {
		return eliminado;
	}
	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}
	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}
	public void setEliminadoPor(String eliminadoPor) {
		this.eliminadoPor = eliminadoPor;
	}
	public void setCreado(Date creado) {
		this.creado = creado;
	}
	public void setModificado(Date modificado) {
		this.modificado = modificado;
	}
	public void setEliminado(Date eliminado) {
		this.eliminado = eliminado;
	}
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
}
