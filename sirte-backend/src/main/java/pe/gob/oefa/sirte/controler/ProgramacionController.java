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
import pe.gob.oefa.model.core.ResponseBase;
import pe.gob.oefa.model.json.ProgramacionDetalleRequest;
import pe.gob.oefa.model.json.ProgramacionDetalleResponse;
import pe.gob.oefa.model.json.ProgramacionRequest;
import pe.gob.oefa.model.json.ProgramacionResponse;
import pe.gob.oefa.seguridad.util.UtilEncrypt;
import pe.gob.oefa.sirte.facade.ProgramacionFacade;
import pe.gob.oefa.util.GenericUtil;

@RestController
@RequestMapping("/business/programacion")
public class ProgramacionController {

	@Value("${encrypt.key}")
	private String key;

	@Autowired
	private ProgramacionFacade programacionFacade;

	@CrossOrigin("*")
	@PostMapping("/find")
	public CollectionResponse<ProgramacionResponse> find(@RequestBody ProgramacionRequest request) {
		GenericUtil.toUpperCase(request);
		return programacionFacade.find(request);
	}

	@CrossOrigin("*")
	@GetMapping("/get/{secuencia}")
	public ProgramacionResponse get(@PathVariable BigDecimal secuencia) {
		return programacionFacade.get(secuencia);
	}

	@CrossOrigin("*")
	@PutMapping("/saveOrUpdate")
	public ResponseBase saveOrUpdate(@RequestBody ProgramacionRequest request) throws Exception {
		UtilEncrypt.init(key);
		request.setDocumentoresponsable(
				request.getDocumentoresponsable().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		request.setUltimousuario(
				request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		request.setDocumentoresponsable(documento);
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return programacionFacade.saveOrUpdate(request);

	}

	@CrossOrigin("*")
	@PutMapping("/saveOrUpdateAdmin")
	public ResponseBase saveOrUpdateAdmin(@RequestBody ProgramacionRequest request) throws Exception {
		UtilEncrypt.init(key);
		request.setUltimousuario(
				request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return programacionFacade.saveOrUpdateAdmin(request);

	}

	@CrossOrigin("*")
	@PutMapping("/delete")
	public ProgramacionResponse delete(@RequestBody ProgramacionRequest request) throws Exception {
		UtilEncrypt.init(key);
		request.setDocumentoresponsable(
				request.getDocumentoresponsable().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		request.setUltimousuario(
				request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		request.setDocumentoresponsable(documento);
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return programacionFacade.delete(request);
	}

	@CrossOrigin("*")
	@PutMapping("/deleteDetalle")
	public ProgramacionDetalleResponse deleteDetalle(@RequestBody ProgramacionDetalleRequest request) throws Exception {
		UtilEncrypt.init(key);
		request.setDocumentoresponsable(
				request.getDocumentoresponsable().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		request.setUltimousuario(
				request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		request.setDocumentoresponsable(documento);
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return programacionFacade.deleteDetalle(request);
	}

	@CrossOrigin("*")
	@PutMapping("/saveDetalle")
	public ProgramacionDetalleResponse saveDetalle(@RequestBody ProgramacionDetalleRequest request) throws Exception {
		UtilEncrypt.init(key);
		request.setDocumentoresponsable(
				request.getDocumentoresponsable().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		request.setUltimousuario(
				request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String documento = UtilEncrypt.decrypt(request.getDocumentoresponsable());
		request.setDocumentoresponsable(documento);
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return programacionFacade.saveDetalle(request);
	}

	@CrossOrigin("*")
	@PutMapping("/saveDetalleAdmin")
	public ProgramacionDetalleResponse saveDetalleAdmin(@RequestBody ProgramacionDetalleRequest request)
			throws Exception {
		UtilEncrypt.init(key);
		request.setUltimousuario(
				request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return programacionFacade.saveDetalleAdmin(request);
	}

	@CrossOrigin("*")
	@PutMapping("/deleteAdmin")
	public ProgramacionResponse deleteAdmin(@RequestBody ProgramacionRequest request) throws Exception {
		UtilEncrypt.init(key);
		request.setUltimousuario(
				request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return programacionFacade.delete(request);
	}

	@CrossOrigin("*")
	@PutMapping("/deleteDetalleAdmin")
	public ProgramacionDetalleResponse deleteDetalleAdmin(@RequestBody ProgramacionDetalleRequest request)
			throws Exception {
		UtilEncrypt.init(key);
		request.setUltimousuario(
				request.getUltimousuario().replace("%2F", "/").replace("%20", "+").replace("%3D", "="));
		String idusuariosso = UtilEncrypt.decrypt(request.getUltimousuario());
		request.setUltimousuario(idusuariosso);
		return programacionFacade.deleteDetalle(request);
	}

}
