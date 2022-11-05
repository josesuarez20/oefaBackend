package pe.gob.oefa.sirte.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.oefa.dto.core.ComboDTO;
import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.json.ComboResponse;
import pe.gob.oefa.model.json.InsertarAseguraUsuarioRequest;
import pe.gob.oefa.model.json.SSOObtenerUsuarioResponse;
import pe.gob.oefa.model.json.SSOPersonaNaturalResponse;
import pe.gob.oefa.model.json.SolicitudCombosResponse;
import pe.gob.oefa.sirte.facade.ComboFacade;

@RestController
@RequestMapping("/comun/combo")
public class ComboController {

	@Autowired
	private ComboFacade comboFacade;

	@CrossOrigin("*")
	@GetMapping("/tipovinculo")
	public SolicitudCombosResponse tipovinculo() {
		return comboFacade.listarTipoVinculo(new ComboDTO());
	}

	@CrossOrigin("*")
	@GetMapping("/vacuna")
	public CollectionResponse<ComboResponse> vacuna() {
		return comboFacade.listarVacuna(new ComboDTO());
	}

	@CrossOrigin("*")
	@PostMapping("/SSOAseguraUsuario")
	public SSOObtenerUsuarioResponse SSOAseguraUsuario(@RequestBody InsertarAseguraUsuarioRequest request) {
		System.out.println("Estamos en el comun/combo/ssoaseguraUsuario");
		// GenericUtil.toUpperCase(request);
		return comboFacade.SSOaseguraUsuario(request);
	}

	@CrossOrigin("*")
	@GetMapping("/SSOfindPersonaPorDni/{dni}")
	public SSOPersonaNaturalResponse ssofindPersonaPorDni(@PathVariable String dni) {
		System.out.println("estamos en el ssofindPersonaPorDni");
		return comboFacade.SSOfindByDni(dni);
	}

	@CrossOrigin("*")
	@GetMapping("/SSOObtenerUsuario/{tipodocumento}/{documento}")
	public SSOObtenerUsuarioResponse ssoobtenerUsuarioPorDocumento(@PathVariable String tipodocumento,
			@PathVariable String documento) {
		System.out.println("estamos en el ssofindPersonaPorDni");
		return comboFacade.SSOobtenerusuarioByTipoDocumentoDocumento(tipodocumento, documento);
	}

}
