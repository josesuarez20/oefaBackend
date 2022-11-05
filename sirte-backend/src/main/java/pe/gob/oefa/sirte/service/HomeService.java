package pe.gob.oefa.sirte.service;

import pe.gob.oefa.dto.security.DashboardResponse;

public interface HomeService {

	/**
	 * 
	 * @return
	 */
	DashboardResponse getDashboard();

	/**
	 * 
	 * @return
	 */
	DashboardResponse getHeader();

	/**
	 * 
	 * @return
	 */
	DashboardResponse getDashboardSSO2(String idusuario, String token);

}
