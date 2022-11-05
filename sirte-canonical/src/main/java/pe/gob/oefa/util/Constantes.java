package pe.gob.oefa.util;

import java.io.File;
import java.math.BigDecimal;

public class Constantes {

	public static final String BLANK_SPACE = " ";
	public static final String GUION = "-";
	public static final String HABILITADO = "S";
	public static final String INHABILITADO = "N";
	public static final String HABILITADO_CHECK = "TRUE";
	public static final String ES_MODERADOR = "S";
	public static final String NO_MODERADOR = "N";
	public static final String ES_PERIODICO = "S";
	public static final String NO_PERIODICO = "N";
	public static final String PREFIJO_ACTA = "ACTA-";
	public static final String PREFIJO_REPORTE = "ReporteInscripcionSirte-";
	public static final String TIPO_USUARIO_INTERNO = "INTERNO";
	public static final String TIPO_USUARIO_EXTERNO = "EXTERNO";
	public static final String SI_ASISTIO = "S";
	public static final String NO_ASISTIO = "N";
	public static final String SELECCIONE_ID = "-1";
	public static final String USER_SESSION_ID = "user";
	public static final BigDecimal PAGINATION_SIZE = new BigDecimal(20L);
	public static final String EMPTY = "";
	public static final String CERO = "0";
	public static final String DATE_SHORT_FORMAT = "dd/MM/yyyy";
	public static final String DDDATE_SHORT_FORMAT = "dd";
	public static final String MMDATE_SHORT_FORMAT = "MM";
	public static final String yyyyDATE_SHORT_FORMAT = "yyyy";
	public static final String DATE_SQL_FORMAT = "yyyy-MM-dd";
	public static final String DATE_DATE_TIME_SQL_FORMAT = "yyyy-MM-dd H:mm";
	public static final String DATE_TIME_FORMAT_REPORT = "yyyy/MM/dd H:mm";
	public static final String DATE_DATE_TIME_SQL_FORMAT_AMPM = "yyyy-MM-dd H:mm a";
	public static final String DATE_FILE_SUFIX_FORMAT = "yyyyMMdd";
	public static final String DATE_FILE_UPLOAD = "yyyyMMddHHmmss";
	public static final String TIME_FORMAT = "H:mm a";
	public static final String TIME_FORMAT_CALENDAR = "H:mm";
	public static final String DATE_TIME_SQL_FORMAT = "H:mm a";
	public static final Integer MODO_USUARIO = 2;
	public static final String SEPARATOR = File.separator;
	public static final String CODIGO_ALFRESCO_NO_OK = "nok";
	public static final String USUARIO_LOCAL = "LOCAL";
	public static final String USUARIO_WS = "WS";
	public static final String DISPONIBLE = "DISPONIBLE";

	private Constantes() {
	}

	public static class Catalogo {

		public static final String TIPO_FLUJO = "TIPO_FLUJO";
		public static final String TIPO_SALA = "TIPO_SALA";
		public static final String TIPO_APROBACION = "TIPO_APROBACION";
		public static final String RECURSO_SALA = "RECURSO_SALA";
		public static final String TIPO_CONTENIDO = "TIPO_CONTENIDO";
		public static final String ESTADO_SOLICITUD = "ESTADO_SOLICITUD";
		public static final String ESTADO_REUNION = "ESTADO_REUNION";
		public static final String TIPO_REUNION = "TIPO_REUNION";
		public static final String TIPO_DOCUMENTO = "TIPO_DOCUMENTO";
		public static final String AREA_OEFA = "AREA_OEFA";
		public static final String GRUPO_CARRERA = "GRUPO_CARRERA";

		private Catalogo() {
		}
	}

	public static class MensajeCodigo {
		public static final String SUCCESS = "SUCCESS";
		public static final String ERROR_NEGOCIO = "ERROR_NEGOCIO";
		public static final String ERROR_APLICACION = "ERROR_APLICACION";

		private MensajeCodigo() {
		}
	}

	public static class ContentType {
		public static final String TYPE_PDF = "application/pdf";
		public static final String TYPE_ZIP = "application/zip";
		public static final String TYPE_EXCEL = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
		public static final String TYPE_WORD = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";

		private ContentType() {
		}
	}

	public static class Extension {
		public static final String WORD = ".docx";
		public static final String PDF = ".pdf";
		public static final String EXCEL = ".XLSX";

		private Extension() {
		}
	}

	public static class EstadoSolicitud {
		public static final String SOLICITADO = "ES001";
		public static final String ACEPTADO = "ES002";
		public static final String CANCELADO = "ES003";

		private EstadoSolicitud() {
		}
	}

	public static class EstadoReunion {
		public static final String EN_APROBACION = "ER005";
		public static final String REGISTRADO = "ER001";
		public static final String EN_EJECUCION = "ER002";
		public static final String FINALIZADO = "ER003";
		public static final String CANCELADO = "ER004";

		private EstadoReunion() {
		}
	}

	public static class TipoContenido {
		public static final String ACUERDO = "TC001";
		public static final String COMPROMISO = "TC002";
		public static final String DESARROLLO_REUNION = "TC003";

		private TipoContenido() {
		}
	}

	public static class TipoDocumento {
		public static final String ACTA_REUNION = "TD001";
		public static final String ADJUNTO = "TD002";

		private TipoDocumento() {
		}
	}

	public static class Color {
		public static final String REGISTRADO = "#00ACC1";
		public static final String EN_EJECUCION = "#0d8212";
		public static final String FINALIZADO = "#629396";
		public static final String CANCELADO = "#c31d1d";

		private Color() {
		}
	}

	public static class EstadoTablet {
		public static final String LIBRE = "LIBRE";
		public static final String RESERVADO = "RESERVADO";
		public static final String OCUPADO = "OCUPADO";

		private EstadoTablet() {
		}
	}

	public static class TipoReunion {
		public static final String INTERNA = "TR001";
		public static final String EXTERNA = "TR002";

		private TipoReunion() {
		}
	}

	public static class Siga {
		public static final String IDTCODIGO = "IDTCODIGO";
		public static final String IDZONA = "IDZONA";

		private Siga() {
		}
	}

	public static class TipoCorreo {
		// CREACIÓN DE USUARIO
		public static final String CU = "CU";
		// SOLICITUD VIGENTE
		public static final String EAP = "EAP";
		// SOLICITUD ACTUALIZADA
		public static final String AU = "AU";
		// SOLICITUD ACTUALIZADA
		public static final String MU = "MU";
		// SOLICITUD DESAPROBADA
		public static final String EAN = "EAN";
		// CANCELACION TERCERO
		public static final String CPP = "CPP";
		// CANCELACION OEFA
		public static final String CPO = "CPO";
		// SUSPENDIDO CONTROL POSTERIOR
		public static final String CPS = "CPS";
		// CANCELADO CONTROL POSTERIOR
		public static final String CPC = "CPC";
		public static final String CRU = "CRU";
		public static final String IP = "IP";
		public static final String FPS = "FPS";
		public static final String CRC = "CRC";

		private TipoCorreo() {
		}
	}

	public static class Nivel5 {
		public static final String EV = "S09300012";
		public static final String SV = "S09360005";
		public static final String FV = "S09370005";

		public static final String EI = "S09300001";
		public static final String SI = "S09360001";
		public static final String FI = "S09370001";

		public static final String EII = "S09300009";
		public static final String SII = "S09360002";
		public static final String FII = "S09370002";

		public static final String EIII = "S09300010";
		public static final String SIII = "S09360003";
		public static final String FIII = "S09370003";

		public static final String EIV = "S09300011";
		public static final String SIV = "S09360004";
		public static final String FIV = "S09370004";

		private Nivel5() {
		}
	}
}
