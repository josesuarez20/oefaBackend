package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolDecJurRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solDecJurId;
	private BigDecimal solicitudId;
	private BigDecimal decJurId;
	private BigDecimal flgmarcado;
	private BigDecimal flgactivo;
	private BigDecimal flgobligado;	
	private String nombre;
	private String habilitado;
				
	public SolDecJurRequest() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getSolDecJurId() {
		return solDecJurId;
	}
	public BigDecimal getDecJurId() {
		return decJurId;
	}
	public BigDecimal getFlgmarcado() {
		return flgmarcado;
	}
	public void setSolDecJurId(BigDecimal solDecJurId) {
		this.solDecJurId = solDecJurId;
	}
	public void setDecJurId(BigDecimal decJurId) {
		this.decJurId = decJurId;
	}
	public void setFlgmarcado(BigDecimal flgmarcado) {
		this.flgmarcado = flgmarcado;
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getFlgobligado() {
		return flgobligado;
	}
	public void setFlgobligado(BigDecimal flgobligado) {
		this.flgobligado = flgobligado;
	}
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	
}
