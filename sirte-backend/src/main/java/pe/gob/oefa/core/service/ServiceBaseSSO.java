package pe.gob.oefa.core.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import pe.gob.oefa.sirte.dto.SSOPersonaNaturalDTO;

@Service("serviceBaseExternalSSO")
public class ServiceBaseSSO  extends ServiceBase {

	@Autowired
	protected RestTemplate restTemplate;
	
	public ServiceBaseSSO() {
	}

	

}

