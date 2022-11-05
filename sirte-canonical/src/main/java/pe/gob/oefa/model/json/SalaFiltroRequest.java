package pe.gob.oefa.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SalaFiltroRequest {

	private String ubicacionCodigo;
	private String nombre;
	private String tipoSalaCodigo;
	private String nombreResponsable;

	public SalaFiltroRequest() {
	}
	

	public String getNombreResponsable() {
		return nombreResponsable;
	}


	public void setNombreResponsable(String nombreResponsable) {
		this.nombreResponsable = nombreResponsable;
	}


	public String getUbicacionCodigo() {
		return ubicacionCodigo;
	}

	public void setUbicacionCodigo(String ubicacionCodigo) {
		this.ubicacionCodigo = ubicacionCodigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoSalaCodigo() {
		return tipoSalaCodigo;
	}

	public void setTipoSalaCodigo(String tipoSalaCodigo) {
		this.tipoSalaCodigo = tipoSalaCodigo;
	}
 
}
