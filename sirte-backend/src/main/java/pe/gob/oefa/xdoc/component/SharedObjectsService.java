package pe.gob.oefa.xdoc.component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import pe.gob.oefa.core.exception.ServiceException;
@Component
public final class SharedObjectsService {

	private static final Logger logger = LoggerFactory.getLogger(SharedObjectsService.class);
	private static final ConcurrentMap<String, Semaphore> sharedObjects = new ConcurrentHashMap<String, Semaphore>();

	private SharedObjectsService() {
	}
	
	public static void putInMemory(String key) {
		Semaphore semaphore = new Semaphore(1);
		Semaphore prev = sharedObjects.putIfAbsent(key, semaphore);
		semaphore = prev == null ? semaphore : prev;
		try {
			if (!semaphore.tryAcquire(5, TimeUnit.SECONDS)) {
				throw new ServiceException("Tiemplo estimado de bloqueo: ["+key+"]");
			}
			logger.info("bloqueado por: " + key);
		} catch (InterruptedException ex) {
			logger.error(ex.getMessage(), ex);
			throw new ServiceException(ex.getMessage(), ex);
		}
	}

	public static void deleteFromMemory(String key) {
		Semaphore semaphore = sharedObjects.get(key);
		if (!semaphore.hasQueuedThreads()) {
			boolean removed = sharedObjects.remove(key, semaphore);
			logger.debug("Un objecto se elimina de memoria: " + key +", " + removed);
		}
		semaphore.release();
		logger.info("Documento o codigo de Bloqueo: " + key);
	}
}
