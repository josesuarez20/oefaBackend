package pe.gob.oefa.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
 

public class GenericUtil {

	private GenericUtil() {
	}
	
	/**
	 * checks if the object is not empty.
	 * 
	 * @param object
	 * @return true o false
	 */
	public static boolean isNotEmpty(Object object) {
		return !isObjectEmpty(object);
	}

	/**
	 * checks if the collection is empty.
	 * 
	 * @param collection
	 * @return true o false
	 */
	public static <E> boolean isEmpty(Collection<E> collection) {
		return (collection == null) || collection.isEmpty();
	}

	/**
	 * checks if the map is empty.
	 * 
	 * @param map
	 * @return true o false
	 */
	public static <K, E> boolean isEmpty(Map<K, E> map) {
		return (map == null) || (map.isEmpty());
	}

	/**
	 * checks if the character is empty.
	 * 
	 * @param character
	 * @return true o false
	 */
	public static boolean isEmpty(CharSequence character) {
		return (character == null) || (character.length() == 0);
	}
	
	public static String emptyIfStringNull(String character) {
		if (isEmpty(character)){
			return Constantes.EMPTY;
		}
		return character.trim();
	}

	/**
	 * 
	 * @param value
	 * @return true o false
	 */
	public static boolean isObjectEmpty(Object value) {
		if (value == null) {
			return true;
		} else if (value instanceof String) {
			return isEmpty((String) value);
		} else if (value instanceof CharSequence) {
			return isEmpty((CharSequence) value);
		} else if (value instanceof Collection || value instanceof Map) {
			return isCollectionEmpty(value);
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	private static boolean isCollectionEmpty(Object value) {
		if (value instanceof Collection) {
			return isEmpty((Collection<? extends Object>) value);
		} else {
			return isEmpty((Map<? extends Object, ? extends Object>) value);
		}

	}
	
	
	/**
	 * checks if the object is null.
	 * 
	 * @param object
	 * @return true o false
	 */
	public static boolean isNull(Object object) {
		if (object != null) {
			return false;
		}
		return true;
	}

	/**
	 * checks if the object is not null.
	 * 
	 * @param object
	 * @return true o false
	 */
	public static boolean isNotNull(Object object) {
		if (object != null) {
			return true;
		}
		return false;
	}
	public static Long getDefaultLong(Object objValue,Long defaultValue) {
		try {
			if (objValue != null && StringUtils.isNotBlank(objValue.toString())
					&& !objValue.toString().equals("null"))
				return Long.valueOf(objValue.toString());
		} catch (Exception e) {
			e.printStackTrace();
			return defaultValue;
		}
		return defaultValue;
	} 
	
	public  static byte[] readFile(File file) {
		Path path = Paths.get(file.getAbsolutePath());
		try {
			return Files.readAllBytes(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static  void toUpperCase(Object  input){
		try {
			for (java.lang.reflect.Field field : input.getClass().getDeclaredFields()) {
				if (field.getType().equals(String.class)) {
					if (!field.isAccessible())
						field.setAccessible(true);
					if (field.get(input) != null&& !((String) field.get(input)).trim().equals(Constantes.EMPTY)) {
						field.set(input, ((String) field.get(input)).toUpperCase());
					}
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * 
	 * @param sequencia
	 * @return
	 */
	public static String generarNumeroSolicitud(String sequencia) {
		StringBuilder sbPrefijo = new StringBuilder();
		sbPrefijo.append(DateUtil.getCurrentYear());
		if(DateUtil.getCurrentMonth()<10) {
			sbPrefijo.append("0").append(DateUtil.getCurrentMonth());
		}else {
			sbPrefijo.append(DateUtil.getCurrentMonth());
		}
		if(DateUtil.getCurrentDay()<10) {
			sbPrefijo.append("0").append(DateUtil.getCurrentDay()+1);
		}else {
			sbPrefijo.append(DateUtil.getCurrentDay()+1);
		}
		sbPrefijo.append("-").append(sequencia);
		return sbPrefijo.toString();
	}
	public static String generarSufijoDocumento(String nombreDocumento) {
		StringBuilder builder=new StringBuilder();
		builder.append(nombreDocumento);
		builder.append(DateUtil.getDateFromStringReport(DateUtil.getCurrentDate(), Constantes.DATE_FILE_SUFIX_FORMAT));
		builder.append(generarNumeroSequencia());
		builder.append(Constantes.Extension.WORD);
		return builder.toString();
	}
	
	public static String generarNumeroSequencia() {
		StringBuilder sbPrefijo = new StringBuilder();
		if(DateUtil.getCurrentHour()<10) {
			sbPrefijo.append("0").append(DateUtil.getCurrentHour());
		}else {
			sbPrefijo.append(DateUtil.getCurrentHour());
		}
		if(DateUtil.getCurrentMinute()<10) {
			sbPrefijo.append("0").append(DateUtil.getCurrentMinute());
		}else {
			sbPrefijo.append(DateUtil.getCurrentMinute());
		}
		if(DateUtil.getCurrentSecond()<10) {
			sbPrefijo.append("0").append(DateUtil.getCurrentSecond());
		}else {
			sbPrefijo.append(DateUtil.getCurrentSecond());
		}
		return sbPrefijo.toString();
	}
	public static void main(String[] args) {
		System.out.println(generarSufijoDocumento("mdmdm"));
	}

	public static String generarNombreActa(String titulo) {
		StringBuilder builder=new StringBuilder();
		//builder.append(Constantes.PREFIJO_ACTA);
		builder.append(Constantes.PREFIJO_REPORTE);
		builder.append(emptyIfStringNull(titulo));
		builder.append(Constantes.Extension.WORD);
		//builder.append(Constantes.Extension.PDF);
		return builder.toString();
	}
	
	public static String generarNombreActaPDF(String titulo) {
		StringBuilder builder=new StringBuilder();
		//builder.append(Constantes.PREFIJO_ACTA);
		builder.append(Constantes.PREFIJO_REPORTE);
		builder.append(emptyIfStringNull(titulo));
		//builder.append(Constantes.Extension.WORD);
		builder.append(Constantes.Extension.PDF);
		return builder.toString();
	}
	
	public static String generarNombreAdjunto(String nombre) {
		StringBuilder builder=new StringBuilder();
		builder.append(emptyIfStringNull(nombre));
		builder.append(DateUtil.getDateFromStringReport(DateUtil.getCurrentDate(), Constantes.DATE_FILE_UPLOAD));
		return builder.toString();
	}
}




































