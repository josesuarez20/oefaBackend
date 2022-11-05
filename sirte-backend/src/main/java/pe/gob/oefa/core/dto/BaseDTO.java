package pe.gob.oefa.core.dto;

import java.io.Serializable;
import java.util.Date;

public class BaseDTO implements Serializable {

	private static final long serialVersionUID = -5951670964938207209L;
	private String creadoPor;
	private String modificadoPor;
	private String eliminadoPor;
	private Date creado;
	private Date modificado;
	private Date eliminado;

	private String habilitado;
	private String mensajeasistente;
	private Integer sec;
	private String modificadoPorNombre;

	public BaseDTO() {
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

	public String getHabilitado() {
		return habilitado;
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

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}

	public String getMensajeasistente() {
		return mensajeasistente;
	}

	public void setMensajeasistente(String mensajeasistente) {
		this.mensajeasistente = mensajeasistente;
	}

	public Integer getSec() {
		return sec;
	}

	public void setSec(Integer secuencia) {
		this.sec = secuencia;
	}

	public String getModificadoPorNombre() {
		return modificadoPorNombre;
	}

	public void setModificadoPorNombre(String modificadoPorNombre) {
		this.modificadoPorNombre = modificadoPorNombre;
	}

}
