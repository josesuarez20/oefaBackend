package pe.gob.oefa.dto.core;
import java.io.Serializable;

public class UserDTO implements Serializable {
	private String codigousuario;
	private String documento;
	private String nombrecompleto;
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
	public String getNombrecompleto() {
		return nombrecompleto;
	}
	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}
	
}