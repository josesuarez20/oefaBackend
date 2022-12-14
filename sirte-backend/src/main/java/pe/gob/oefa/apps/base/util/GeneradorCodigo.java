package pe.gob.oefa.apps.base.util;

public class GeneradorCodigo {
	
	public static String NUMEROS = "0123456789";
	 
	public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 

	

	public GeneradorCodigo() {

	}
	
	public static String getPinNumber() {
		return getPassword(NUMEROS, 4);
	}
 
	public static String getPassword() {
		return getPassword(8);
	}
 
	public static String getPassword(int length) {
		return getPassword(NUMEROS + MAYUSCULAS, length);
	}
 
	public static String getPassword(String key, int length) {
		String pswd = "";
 
		for (int i = 0; i < length; i++) {
			pswd+=(key.charAt((int)(Math.random() * key.length())));
		}
 
		return pswd;
	}
	

	public static void main(String[] args) {
		
		
		
	}
	
	public String generarCodigo(int cantCaracteres,String valorInicial, String codigo){
		
		int longitudvalorInicial=valorInicial.length();
		String codigoGenerado = "";
		int numero =cantCaracteres-longitudvalorInicial;
		if(longitudvalorInicial<cantCaracteres && numero>codigo.length()){
			
			int cantidadCadena=cantCaracteres-(longitudvalorInicial+codigo.length());
			
			String cadena="";
			for(int i=0;i<cantidadCadena;i++){
				cadena=cadena+"0";
			}
			
			codigoGenerado=	valorInicial+cadena+codigo;
			
		}
		
		return codigoGenerado;
	}

	
	public static int validaExtensiones(String nombreDocumento,String extension){

		int result =0;
		String cadenaDondeBuscar = nombreDocumento;
		String loQueQuieroBuscar = extension;
		String[] palabras = loQueQuieroBuscar.split("\\s+");
		for (String palabra : palabras) {
		    if (cadenaDondeBuscar.contains(palabra)) {
		    	result=1;
		        //aquí tu lógica en caso que se haya encontrado...
		    }else{
		    	result = 0;
		    }
		}
		
		return result;

	}


}
