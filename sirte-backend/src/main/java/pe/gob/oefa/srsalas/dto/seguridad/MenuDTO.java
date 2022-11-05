package pe.gob.oefa.srsalas.dto.seguridad;

import java.util.ArrayList;
import java.util.List;

import pe.gob.oefa.ws.seguridad.bean.Pagina;
 

public class MenuDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Pagina menu;
	private List<OpcionDTO> opciones;
	
	public MenuDTO(){
		menu = new Pagina();
		opciones = new ArrayList<OpcionDTO>();
	}
	
	public void setMenu(Pagina menu) {
		this.menu = menu;
	}
	public void setOpciones(List<OpcionDTO> opciones) {
		this.opciones = opciones;
	}
	
	public Pagina getMenu() {
		return menu;
	}
	public List<OpcionDTO> getOpciones() {
		return opciones;
	}
	
}
