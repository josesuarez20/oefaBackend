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
import pe.gob.oefa.model.json.DependienteRequest;
import pe.gob.oefa.model.json.DependienteResponse;
import pe.gob.oefa.model.json.ProgramacionRequest;
import pe.gob.oefa.model.json.PruebaDescarteRequest;
import pe.gob.oefa.seguridad.util.UtilEncrypt;
import pe.gob.oefa.sirte.facade.DependienteFacade;
import pe.gob.oefa.util.GenericUtil;

@RestController
@RequestMapping("/business/dependiente")
public class DependienteController {

	@Autowired
	private DependienteFacade dependienteFacade;

	@Value("${encrypt.key}")
	private String key;

	@CrossOrigin("*")
	@PostMapping("/find")
	public CollectionResponse<DependienteResponse> find(@RequestBody DependienteRequest request) throws Exception {
		UtilEncrypt.init(key);
		request.setDocumentoresponsable(
				request.getDocumentoresponsable().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		request.setUltimousuario(
				request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		request.setDocumentoresponsable(documento);
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return dependienteFacade.find(request);
	}

	@CrossOrigin("*")
	@PostMapping("/listaConResponsable")
	public CollectionResponse<DependienteResponse> listaConResponsable(@RequestBody DependienteRequest request)
			throws Exception {
		// GenericUtil.toUpperCase(request);
		UtilEncrypt.init(key);
		request.setDocumentoresponsable(
				request.getDocumentoresponsable().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		request.setDocumentoresponsable(documento);
		return dependienteFacade.listaConResponsable(request);
	}

	@CrossOrigin("*")
	@PostMapping("/listaConResponsableAll")
	public CollectionResponse<DependienteResponse> listaConResponsableAll(@RequestBody DependienteRequest request)
			throws Exception {
		// GenericUtil.toUpperCase(request);
		UtilEncrypt.init(key);
		request.setDocumentoresponsable(
				request.getDocumentoresponsable().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		request.setUltimousuario(
				request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		request.setDocumentoresponsable(documento);
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return dependienteFacade.listaConResponsableAll(request);
		
	}

	@CrossOrigin("*")
	@PostMapping("/findAdicional")
	public CollectionResponse<DependienteResponse> findAdicional(@RequestBody DependienteRequest request) {
		GenericUtil.toUpperCase(request);
		return dependienteFacade.findAdicional(request);
	}

	@CrossOrigin("*")
	@PostMapping("/findprogramacion")
	public CollectionResponse<DependienteResponse> findprogramacion(@RequestBody ProgramacionRequest request)
			throws Exception {
		// GenericUtil.toUpperCase(request);
		UtilEncrypt.init(key);
		request.setDocumentoresponsable(
				request.getDocumentoresponsable().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		request.setDocumentoresponsable(documento);
		return dependienteFacade.findprogramacion(request);
	}

	@CrossOrigin("*")
	@PostMapping("/findprogramacionAdmin")
	public CollectionResponse<DependienteResponse> findprogramacionAdmin(@RequestBody ProgramacionRequest request)
			throws Exception {
		// GenericUtil.toUpperCase(request);
		// UtilEncrypt.init(key);
		// request.setDocumentoresponsable(request.getDocumentoresponsable().replace("%2F",
		// "/").replace("%20", "+").replace("%3D", "="));
		// String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		// request.setDocumentoresponsable(documento);
		return dependienteFacade.findprogramacionAdmin(request);
	}

	@CrossOrigin("*")
	@PostMapping("/findpruebadescarte")
	public CollectionResponse<DependienteResponse> findpruebadescarte(@RequestBody PruebaDescarteRequest request)
			throws Exception {
		// GenericUtil.toUpperCase(request);
		UtilEncrypt.init(key);
		request.setDocumentoresponsable(
				request.getDocumentoresponsable().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		request.setDocumentoresponsable(documento);
		return dependienteFacade.findpruebadescarte(request);
	}

	@CrossOrigin("*")
	@PostMapping("/findpruebadescarteAdmin")
	public CollectionResponse<DependienteResponse> findpruebadescarteAdmin(@RequestBody PruebaDescarteRequest request)
			throws Exception {
		// GenericUtil.toUpperCase(request);
		UtilEncrypt.init(key);
		request.setDocumentoresponsable(
				request.getDocumentoresponsable().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		request.setDocumentoresponsable(documento);
		return dependienteFacade.findpruebadescarteAdmin(request);
	}

	@CrossOrigin("*")
	// @GetMapping("/get/{secuencia}")
	@PostMapping("/get")
	public DependienteResponse get(@RequestBody DependienteRequest request) {
		return dependienteFacade.get(request);
	}

	@CrossOrigin("*")
	@PutMapping("/saveOrUpdate")
	public DependienteResponse saveOrUpdate(@RequestBody DependienteRequest request) {
		GenericUtil.toUpperCase(request);
		return dependienteFacade.saveOrUpdate(request);
	}

	@CrossOrigin("*")
	@PutMapping("/guardarAdicional")
	public DependienteResponse guardarAdicional(@RequestBody DependienteRequest request) {
		GenericUtil.toUpperCase(request);
		return dependienteFacade.guardarAdicional(request);
	}

	@CrossOrigin("*")
	@PutMapping("/delete")
	public DependienteResponse delete(@RequestBody DependienteRequest request) {
		GenericUtil.toUpperCase(request);
		return dependienteFacade.delete(request);
	}

	@CrossOrigin("*")
	@GetMapping("/nuevoByDni/{dni}")
	public DependienteResponse nuevoByDni(@PathVariable String dni) {
		return dependienteFacade.nuevoByDni(dni);
	}
}
