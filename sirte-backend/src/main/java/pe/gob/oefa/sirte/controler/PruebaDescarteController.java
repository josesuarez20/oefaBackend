package pe.gob.oefa.sirte.controler;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.core.ResponseBase;
import pe.gob.oefa.model.json.PruebaDescarteRequest;
import pe.gob.oefa.model.json.PruebaDescarteResponse;
import pe.gob.oefa.sirte.facade.PruebaDescarteFacade;
import pe.gob.oefa.util.GenericUtil;

@RestController
@RequestMapping("/business/pruebadescarte")
public class PruebaDescarteController {

	@Autowired
	private PruebaDescarteFacade pruebaDescarteFacade;

	@CrossOrigin("*")
	@PostMapping("/find")
	public CollectionResponse<PruebaDescarteResponse> find(@RequestBody PruebaDescarteRequest request) {
		GenericUtil.toUpperCase(request);
		return pruebaDescarteFacade.find(request);
	}

	@CrossOrigin("*")
	@GetMapping("/get/{secuencia}")
	public PruebaDescarteResponse get(@PathVariable BigDecimal secuencia) {
		return pruebaDescarteFacade.get(secuencia);
	}

	@CrossOrigin("*")
	@PutMapping("/saveOrUpdate")
	public ResponseBase saveOrUpdate(@RequestBody PruebaDescarteRequest request) {
		
		return pruebaDescarteFacade.saveOrUpdate(request);
		
	}
	
	@CrossOrigin("*")
	@PutMapping("/saveOrUpdateAdmin")
	public ResponseBase saveOrUpdateAdmin(@RequestBody PruebaDescarteRequest request) {
		
		return pruebaDescarteFacade.saveOrUpdateAdmin(request);
		
	}

	@CrossOrigin("*")
	@PutMapping("/delete")
	public PruebaDescarteResponse delete(@RequestBody PruebaDescarteRequest request) {
		return pruebaDescarteFacade.delete(request);
	}

	
}
