package pe.gob.oefa.dto.core;
import java.io.Serializable;

public class UserDTO implements Serializable {
	private String codigousuario;
	private String documento;
	private String nombrecompleto;
	private String codigopuesto;
	private String descripcion;
	private long nombre;
	private String area;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCodigousuario() {
		return codigousuario;
	}
	public void setCodigousuario(String codigousuario) {
		this.codigousuario = codigousuario;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public long getNombre() {
		return nombre;
	}
	public void setNombre(long nombre) {
		this.nombre = nombre;
	}
	public String getNombrecompleto() {
		return nombrecompleto;
	}
	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}
	public String getCodigopuesto() {
		return codigopuesto;
	}
	public void setCodigopuesto(String codigopuesto) {
		this.codigopuesto = codigopuesto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}