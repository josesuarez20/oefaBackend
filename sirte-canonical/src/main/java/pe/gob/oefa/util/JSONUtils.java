package pe.gob.oefa.util;

import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class JSONUtils {

	public JSONUtils() {
	}
	
	/**
	 * 
	 * @param object
	 * @param propertyNamingStrategy
	 * @return
	 */
	public static String convertObjectToJson(Object object, PropertyNamingStrategy propertyNamingStrategy) {
		ObjectMapper mapper = getConfiguredMapper(propertyNamingStrategy);
		String json = null;
		try {
			json = mapper.writeValueAsString(object);
		} catch (Exception e) {
			
		}
		return json;
	}

	/**
	 * 
	 * @param json
	 * @param responseType
	 * @param propertyNamingStrategy
	 * @return
	 */
	public static <T extends Object> T convertJSONToObject(String json, Class<T> responseType, PropertyNamingStrategy propertyNamingStrategy) {
		ObjectMapper mapper = getConfiguredMapper(propertyNamingStrategy);
		T object = null;
		try {
			object = mapper.readValue(json, responseType);
		}catch (IOException e) {

		}
		return object;
	}

	
	/**
	 * 
	 * @param namingStrategy
	 * @return
	 */
	public static ObjectMapper getConfiguredMapper(PropertyNamingStrategy namingStrategy) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.setPropertyNamingStrategy(namingStrategy);
		return mapper;
	}

}
