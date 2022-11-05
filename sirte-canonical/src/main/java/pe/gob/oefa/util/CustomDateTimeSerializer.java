package pe.gob.oefa.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
 
public class CustomDateTimeSerializer extends JsonSerializer<Date> {
 	SimpleDateFormat formatter = new SimpleDateFormat(Constantes.DATE_DATE_TIME_SQL_FORMAT);
	public void serialize(Date value, JsonGenerator jgen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
 		String formattedDate = formatter.format(value);
 		jgen.writeString(formattedDate);
	}
}