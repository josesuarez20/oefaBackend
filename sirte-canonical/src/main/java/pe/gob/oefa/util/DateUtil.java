package pe.gob.oefa.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang.time.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalTime;

public class DateUtil {

	private DateUtil() {
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static java.sql.Date convertSQLDate(Date date){
		if(GenericUtil.isNotNull(date)) {
			return new java.sql.Date(date.getTime());
		}
		return null;
	}
	
	/**
	 * get current Date.
	 * @return Date
	 */
	public static Date getCurrentDate(){
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
	
	/**
	 * 
	 * @return
	 */
	public static Integer getCurrentYear(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR);
	}
	
	/**
	 * 
	 * @return
	 */
	public static Integer getCurrentMonth(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.MONTH);
	}
	
	/**
	 * 
	 * @return
	 */
	public static String getCurrentMonthDesc() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
	}
	
	/**
	 * 
	 * @return
	 */
	public static Integer getCurrentDay(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * 
	 * @return
	 */
	public static Integer getCurrentHour(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.HOUR);
	}
	
	/**
	 * 
	 * @return
	 */
	public static Integer getCurrentMinute(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.MINUTE);
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static Integer getCurrentSecond(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.SECOND);
	}
	
	/**
	 * 
	 * @param mesId
	 * @return
	 */
	public static String getMonth(Integer mesId){
		String mes=Constantes.EMPTY;
		switch (mesId) {
			case 1:mes ="Enero" ;break;
			case 2:mes ="Febrero" ;break;
			case 3:mes ="Marzo" ;break;
			case 4:mes ="Abril" ;break;
			case 5:mes ="Mayo" ;break;
			case 6:mes ="Junio" ;break;
			case 7:mes ="Julio" ;break;
			case 8:mes ="Agosto" ;break;
			case 9:mes ="Setiembre" ;break;
			case 10:mes ="Octubre" ;break;
			case 11:mes ="Noviembre" ;break;
			case 12:mes ="Diciembre" ;break;
		default:
			break;
		}
		return mes;
	}
	
	public static  String getDateToText(Date date){
		if(GenericUtil.isNotNull(date)){
			TimeZone timeZone = TimeZone.getTimeZone("America/Lima");
			Locale locale= new Locale("es","PE");
			Calendar calendar=Calendar.getInstance(timeZone,locale);
			calendar.setTime(date);
			DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG,locale);
			return df4.format(calendar.getTime());
		}
		return Constantes.EMPTY;
	}
	public static String getDateFromStringReport(Date fecha,String format) {
		if(GenericUtil.isNull(fecha)){
			return Constantes.EMPTY;
		}
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);
		return dateFormat.format(fecha);
	}
	
	public static String getHora(Timestamp fecha,String format) {
		if(GenericUtil.isNull(fecha)){
			return Constantes.EMPTY;
		}
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);
		return dateFormat.format(fecha);
	}
	
	public static Date getDateFromString(String fecha,String format) {
		if(GenericUtil.isNull(fecha)){
			return getCurrentDate();
		}
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);
		try {
			return dateFormat.parse(fecha.trim());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Timestamp getCurrentTimestamp() {
		return new Timestamp(getCurrentDate().getTime());
	}
	public static Timestamp getTimestampFromString(String fecha,String format) {
		if(GenericUtil.isNull(fecha)){
			return new Timestamp(getCurrentDate().getTime());
		}
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);
		try {
			return new Timestamp(dateFormat.parse(fecha).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getMonthName(Date date){
		if(GenericUtil.isNotNull(date)){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			int mesId= calendar.get(Calendar.MONTH)+1;
			return getMonth(mesId);
		}
		return Constantes.EMPTY;
	}
	
	public static Integer getDias(Date desde, Date hasta) {
		if(GenericUtil.isNotNull(desde) && GenericUtil.isNotNull(hasta)) {
			DateTime fechaInicio=new DateTime(desde);
			DateTime fechaFin=new DateTime(hasta);
			return Days.daysBetween(fechaInicio, fechaFin).getDays();
		}
		return 0;
	} 
	public static Date addDias(Date fecha, Integer cantidad) {
		if(GenericUtil.isNotNull(fecha) && GenericUtil.isNotNull(cantidad)) {
			DateTime fechaInicio=new DateTime(fecha);
			DateTime nuevaFecha=	fechaInicio.plusDays(cantidad);
			return nuevaFecha.toDate();
		}
		return null;
	}  
	
	public static Date getFechaSolicitud(Date fecha, Timestamp hora){
		Calendar calendar=Calendar.getInstance();
		if(GenericUtil.isNotNull(fecha) && GenericUtil.isNotNull(hora)) {
			calendar.set(fecha.getYear(), fecha.getMonth(), fecha.getDate(), hora.getHours(), hora.getMinutes());
		}else {
			if(GenericUtil.isNotNull(fecha)) {
				calendar.setTime(fecha);
			}
		}
		return calendar.getTime();
	}
	public static Date addFecha(Date fecha,Integer minutos){
		return DateUtils.addMinutes(fecha, minutos);
	}
	
	public static List<Date> getFillCalendario(){
		List<Date>  fechas=new LinkedList<>();
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		Date fecha=calendar.getTime();
		int minutoXDia=24*60;
		int count=0;
		while (count<minutoXDia) {
			fechas.add(fecha);
			count=count+1;
			fecha=addFecha(fecha, 1);
		}
		return fechas;
	}
	
	public static Integer getMinutos(Date fechaInicio, Date fechaFin) {
		Calendar fechaInicial=Calendar.getInstance();
		fechaInicial.setTime(fechaInicio);
		Calendar fechaFinal=Calendar.getInstance();
		fechaFinal.setTime(fechaFin);
		return (fechaFinal.get(Calendar.MINUTE) - fechaInicial.get(Calendar.MINUTE));
	}
	
	public static String  getDateText(Date fecha) {
		if(GenericUtil.isNotEmpty(fecha)) {
			DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
			return dateFormat.format(fecha);
		}
		return Constantes.EMPTY;
	}
	
	public static boolean compareTime(Timestamp hi, Timestamp hf) {
		LocalTime horaInicio=new LocalTime(getHora(hi, Constantes.TIME_FORMAT_CALENDAR));
		LocalTime horaFin=new LocalTime(getHora(hf, Constantes.TIME_FORMAT_CALENDAR));
		return horaFin.isAfter(horaInicio);
	}
	
	public static void main(String[] args) {
		Timestamp horaInicio=new Timestamp(getCurrentDate().getTime());
		Timestamp horaFin=new Timestamp(addFecha(getCurrentDate(), 5).getTime());
		 System.out.println(compareTime(horaInicio, horaFin));
	}
	 
	 
}
