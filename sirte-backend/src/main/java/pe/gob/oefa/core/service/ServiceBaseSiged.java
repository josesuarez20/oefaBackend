package pe.gob.oefa.core.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import pe.gob.oefa.sirte.dto.SSOPersonaNaturalDTO;

@Service("serviceBaseExternalSiged")
public class ServiceBaseSiged  extends ServiceBase {

	@Autowired
	protected RestTemplate restTemplate;
	
	public ServiceBaseSiged() {
	}

	

}

