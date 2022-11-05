package pe.gob.oefa.sirte.controler;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.json.DependienteCorreoRequest;
import pe.gob.oefa.model.json.DependienteCorreoResponse;
import pe.gob.oefa.seguridad.util.UtilEncrypt;
import pe.gob.oefa.sirte.facade.DependienteCorreoFacade;
import pe.gob.oefa.util.GenericUtil;

@RestController
@RequestMapping("/business/dependientecorreo")
public class DependienteCorreoController {

	@Value("${encrypt.key}")
	private String key;
	
	@Autowired
	private DependienteCorreoFacade dependienteCorreoFacade;

	@CrossOrigin("*")
	@PostMapping("/find")
	public CollectionResponse<DependienteCorreoResponse> find(@RequestBody DependienteCorreoRequest request) {
		GenericUtil.toUpperCase(request);
		return dependienteCorreoFacade.find(request);
	}

	@CrossOrigin("*")
	@GetMapping("/get/{secuencia}")
	public DependienteCorreoResponse get(@PathVariable BigDecimal secuencia) {
		return dependienteCorreoFacade.get(secuencia);
	}

	@CrossOrigin("*")
	@PutMapping("/saveOrUpdate")
	public DependienteCorreoResponse saveOrUpdate(@RequestBody DependienteCorreoRequest request) throws Exception{
		UtilEncrypt.init(key);
		request.setDocumentoresponsable(request.getDocumentoresponsable().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		request.setUltimousuario(request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));

		String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		request.setDocumentoresponsable(documento);
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return dependienteCorreoFacade.saveOrUpdate(request);
	}
	
	@CrossOrigin("*")
	@PutMapping("/saveOrUpdateAdmin")
	public DependienteCorreoResponse saveOrUpdateAdmin(@RequestBody DependienteCorreoRequest request) throws Exception{
		UtilEncrypt.init(key);
		request.setUltimousuario(request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return dependienteCorreoFacade.saveOrUpdate(request);
	}
	
	

	@CrossOrigin("*")
	@PutMapping("/delete")
	public DependienteCorreoResponse delete(@RequestBody DependienteCorreoRequest request) {
		return dependienteCorreoFacade.delete(request);
	}
	
}
