package pe.gob.oefa.util;

import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

import net.fortuna.ical4j.data.CalendarOutputter;
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.TimeZone;
import net.fortuna.ical4j.model.TimeZoneRegistry;
import net.fortuna.ical4j.model.TimeZoneRegistryFactory;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.component.VTimeZone;
import net.fortuna.ical4j.model.parameter.Cn;
import net.fortuna.ical4j.model.parameter.Role;
import net.fortuna.ical4j.model.property.Attendee;
import net.fortuna.ical4j.model.property.CalScale;
import net.fortuna.ical4j.model.property.Method;
import net.fortuna.ical4j.model.property.Organizer;
import net.fortuna.ical4j.model.property.ProdId;
import net.fortuna.ical4j.model.property.Uid;
import net.fortuna.ical4j.model.property.Version;
import pe.gob.oefa.model.core.EnvioCorreoParticipanteResponse;
import pe.gob.oefa.model.json.ParticipanteDataGridResponse;

public class IVCalendar {
 

	public static byte[] getInvite(EnvioCorreoParticipanteResponse t) {
		try {
			TimeZoneRegistry registry = TimeZoneRegistryFactory.getInstance().createRegistry();
			TimeZone timezone = registry.getTimeZone("America/Lima");
			VTimeZone tz = timezone.getVTimeZone();

			StringBuilder fechaInicioCalendario = new StringBuilder();
			fechaInicioCalendario.append(DateUtil.getDateFromStringReport(t.getFechaReunion(), Constantes.DATE_SQL_FORMAT));
			fechaInicioCalendario.append(Constantes.BLANK_SPACE);
			fechaInicioCalendario.append(DateUtil.getDateFromStringReport(t.getHoraInicio(), Constantes.TIME_FORMAT_CALENDAR));

			java.util.Calendar startDate = new GregorianCalendar();
			startDate.setTimeZone(timezone);
			startDate.setTime(DateUtil.getDateFromString(fechaInicioCalendario.toString(), Constantes.DATE_DATE_TIME_SQL_FORMAT));

			StringBuilder fechaFinCalendario = new StringBuilder();
			fechaFinCalendario.append(DateUtil.getDateFromStringReport(t.getFechaReunion(), Constantes.DATE_SQL_FORMAT));
			fechaFinCalendario.append(Constantes.BLANK_SPACE);
			fechaFinCalendario.append(DateUtil.getDateFromStringReport(t.getHoraFin(), Constantes.TIME_FORMAT_CALENDAR));

			java.util.Calendar endDate = new GregorianCalendar();
			endDate.setTimeZone(timezone);
			endDate.setTime(DateUtil.getDateFromString(fechaFinCalendario.toString(), Constantes.DATE_DATE_TIME_SQL_FORMAT));

			VEvent meeting = new VEvent(new DateTime(startDate.getTime()), new DateTime(endDate.getTime()),	GenericUtil.emptyIfStringNull(t.getTitulo()));

			meeting.getProperties().add(tz.getTimeZoneId());

			Uid uid = new Uid(UUID.randomUUID().toString());
			meeting.getProperties().add(uid);

			// agregamos los participantes
			List<ParticipanteDataGridResponse> correos = t.getCorreos();
			for (ParticipanteDataGridResponse tt : correos) 
			{
				Attendee participante = new Attendee(URI.create("mailto:" + tt.getCorreo()));
				participante.getParameters().add(Role.REQ_PARTICIPANT);
				participante.getParameters().add(new Cn(tt.getNombre()));
				meeting.getProperties().add(participante);
			}

			net.fortuna.ical4j.model.Calendar icsCalendar = new net.fortuna.ical4j.model.Calendar();
			icsCalendar.getProperties().add(new ProdId("-//Events Calendar//iCal4j 1.0//EN"));
			icsCalendar.getProperties().add(CalScale.GREGORIAN);
			icsCalendar.getProperties().add(Version.VERSION_2_0);

			icsCalendar.getComponents().add(meeting);

			Organizer orger = new Organizer(URI.create(GenericUtil.emptyIfStringNull(t.getCorreoSolicitante())));
			orger.getParameters().add(new Cn(GenericUtil.emptyIfStringNull(t.getSolicitante())));
			meeting.getProperties().add(orger);

			icsCalendar.getProperties().add(Method.REQUEST);

			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			CalendarOutputter outputter = new CalendarOutputter();

			outputter.output(icsCalendar, bout);
			return bout.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
 
}
