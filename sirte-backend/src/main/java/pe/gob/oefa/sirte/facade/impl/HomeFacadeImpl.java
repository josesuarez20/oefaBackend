package pe.gob.oefa.sirte.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.dto.security.DashboardResponse;
import pe.gob.oefa.sirte.facade.HomeFacade;
import pe.gob.oefa.sirte.service.HomeService;

@Component
public class HomeFacadeImpl extends FacadeBase implements HomeFacade {
	private CoreLogger logger = LoggerFactory.getLogger(HomeFacadeImpl.class);
	@Autowired
	private HomeService homeService;
	
	@Override
	public DashboardResponse getHomeDashboard() {
		try {
			return homeService.getDashboard();
		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}
	
	@Override
	public DashboardResponse getHeader() {
		try {
			return homeService.getHeader();
		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

}
