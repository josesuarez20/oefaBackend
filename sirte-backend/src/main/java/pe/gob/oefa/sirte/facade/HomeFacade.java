package pe.gob.oefa.sirte.facade;

import pe.gob.oefa.dto.security.DashboardResponse;

public interface HomeFacade {

	/**
	 * 
	 * @param username
	 * @return
	 */
	public DashboardResponse getHomeDashboard();
	
	/**
	 * 
	 * @return
	 */
	public DashboardResponse getHeader();
}
