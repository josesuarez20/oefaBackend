package pe.gob.oefa.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("serviceBaseExternal")
public class ServiceBaseIntranet extends ServiceBase {

	@Autowired
	protected RestTemplate restTemplate;
	
	public ServiceBaseIntranet() {
	}
	
}
