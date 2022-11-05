package pe.gob.oefa.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;

import net.sf.jxls.transformer.XLSTransformer;

public class ExcelUtil {

	@SuppressWarnings("rawtypes")
	public static byte[] generateXls(Map beans, InputStream input)  {
		Workbook workbook=null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			XLSTransformer transformer = new XLSTransformer();
			  workbook = transformer.transformXLS(input, beans);
			  workbook.write(baos);
			  baos.flush();
			  baos.close();
		} catch (InvalidFormatException | IOException e) {
			 
		} 
		return baos.toByteArray();
	}
}
