package pe.gob.oefa.apps.base.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilFecha {

	private static final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;

	public static Integer obtenerDiferenciaDias(Date fechaInicio, Date fechaFin) throws Exception {
		if (fechaInicio == null || fechaFin == null)
			return null;
		Integer diferencia;

		diferencia = (int) ((fechaFin.getTime() - fechaInicio.getTime()) / MILLSECS_PER_DAY);

		return diferencia;
	}

	public static String convertirFechaCadena(Date date, String formato) throws Exception {

		String cadena = null;
		if (date == null)
			return null;
		if (formato != null) {
			SimpleDateFormat formateador = new SimpleDateFormat(formato);
			cadena = formateador.format(date);
		}
		// logger.debug("cadena " + cadena);
		return cadena;
	}

	public static Integer obtenerAnioActual() throws Exception {

		Calendar fecha = Calendar.getInstance();
		fecha.setTime(new Date());

		return fecha.get(Calendar.YEAR);
	}
}
