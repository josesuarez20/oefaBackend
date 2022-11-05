package pe.gob.oefa.core.logger;

public class LoggerFactory {

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T> CoreLogger getLogger(Class<T> _class) {
		return new CoreLoggerImpl(_class);
	}
}
