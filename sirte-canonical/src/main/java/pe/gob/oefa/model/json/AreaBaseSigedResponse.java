package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AreaBaseSigedResponse implements Serializable {
	
	private static final long serialVersionUID = 4844046394663487904L;
	
	private BigDecimal idArea;
	private BigDecimal fechaCreacion;
    private String horaIngreso;
    private String horaSalida;
    private String nombre;
    private BigDecimal dependencia;
    private BigDecimal idSede;
    private BigDecimal idPersonaAa;
    private BigDecimal idPersonaJa;
    private BigDecimal idOrganoLinea;
    
    
	public AreaBaseSigedResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getIdArea() {
		return idArea;
	}
	public void setIdArea(BigDecimal idArea) {
		this.idArea = idArea;
	}
	public BigDecimal getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(BigDecimal fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getHoraIngreso() {
		return horaIngreso;
	}
	public void setHoraIngreso(String horaIngreso) {
		this.horaIngreso = horaIngreso;
	}
	public String getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getDependencia() {
		return dependencia;
	}
	public void setDependencia(BigDecimal dependencia) {
		this.dependencia = dependencia;
	}
	public BigDecimal getIdSede() {
		return idSede;
	}
	public void setIdSede(BigDecimal idSede) {
		this.idSede = idSede;
	}
	public BigDecimal getIdPersonaAa() {
		return idPersonaAa;
	}
	public void setIdPersonaAa(BigDecimal idPersonaAa) {
		this.idPersonaAa = idPersonaAa;
	}
	public BigDecimal getIdPersonaJa() {
		return idPersonaJa;
	}
	public void setIdPersonaJa(BigDecimal idPersonaJa) {
		this.idPersonaJa = idPersonaJa;
	}
	public BigDecimal getIdOrganoLinea() {
		return idOrganoLinea;
	}
	public void setIdOrganoLinea(BigDecimal idOrganoLinea) {
		this.idOrganoLinea = idOrganoLinea;
	}
    
    

}
