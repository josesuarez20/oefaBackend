package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SSTMarcaVacunaRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal idmarca;
	private String nombre;

	// auxiliar para codigo de usuario
	private String codigousuario;
	private String idusuario;

	public SSTMarcaVacunaRequest() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getIdmarca() {
		return idmarca;
	}

	public void setIdmarca(BigDecimal idmarca) {
		this.idmarca = idmarca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigousuario() {
		return codigousuario;
	}

	public void setCodigousuario(String codigousuario) {
		this.codigousuario = codigousuario;
	}

	public String getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

}
