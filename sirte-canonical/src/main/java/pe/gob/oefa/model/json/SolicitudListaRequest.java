package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolicitudListaRequest implements Serializable {

	private static final long serialVersionUID = -2171502850392441601L;
	private BigDecimal solicitudId;
	private BigDecimal padreId;
	private String usuarioId;
	private String rucNatural;
	private String nombre;
	private String categoriaNivel;
	private String estado;
	private String estadoCod;
	private String codigo;
	private Date fechaSolicitud;

	public SolicitudListaRequest() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getPadreId() {
		return padreId;
	}
	public void setPadreId(BigDecimal padreId) {
		this.padreId = padreId;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getEstadoCod() {
		return estadoCod;
	}
	public void setEstadoCod(String estadoCod) {
		this.estadoCod = estadoCod;
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}
	public String getUsuarioId() {
		return usuarioId;
	}
	public String getRucNatural() {
		return rucNatural;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCategoriaNivel() {
		return categoriaNivel;
	}
	public String getEstado() {
		return estado;
	}
	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}
	public void setRucNatural(String rucNatural) {
		this.rucNatural = rucNatural;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCategoriaNivel(String categoriaNivel) {
		this.categoriaNivel = categoriaNivel;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
}
