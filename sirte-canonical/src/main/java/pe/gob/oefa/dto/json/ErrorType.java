package pe.gob.oefa.dto.json;

public enum ErrorType {
	
	ERROR("error"),INFORMATION("information"),WARNING("warning"),FATAL("fatal");
	
	private String descripcion;
	
	private ErrorType(String description) {
		this.descripcion = description;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
}
