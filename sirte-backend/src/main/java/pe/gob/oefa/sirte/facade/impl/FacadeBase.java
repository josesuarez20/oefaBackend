package pe.gob.oefa.sirte.facade.impl;

import org.springframework.stereotype.Service;

import pe.gob.oefa.core.exception.ServiceException;
import pe.gob.oefa.core.logger.CoreLogger;
 

@Service("facadeBase")
public class FacadeBase {

	public void launchException(CoreLogger logger,Exception e) throws ServiceException{
		if(e instanceof ServiceException){
			throw (ServiceException)e;
		}else{
			logger.error("[ERROR] :" + e.getMessage(),e);
			throw new ServiceException();
		}
	}
}
