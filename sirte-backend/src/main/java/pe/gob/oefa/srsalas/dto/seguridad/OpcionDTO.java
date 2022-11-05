package pe.gob.oefa.srsalas.dto.seguridad;

import pe.gob.oefa.ws.seguridad.bean.Pagina;

public class OpcionDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Pagina opcion;
	
	public OpcionDTO() {
		opcion = new Pagina();
	}
	
	public void setOpcion(Pagina opcion) {
		this.opcion = opcion;
	}
	public Pagina getOpcion() {
		return opcion;
	}
	
	
}
