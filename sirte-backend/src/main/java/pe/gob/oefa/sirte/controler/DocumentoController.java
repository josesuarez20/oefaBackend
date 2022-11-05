package pe.gob.oefa.sirte.controler;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.core.ResponseBase;
import pe.gob.oefa.model.json.DocumentoDataGridResponse;
import pe.gob.oefa.model.json.DocumentoFiltroRequest;
import pe.gob.oefa.model.json.DocumentoRequest;
import pe.gob.oefa.model.json.ReporteResponse;
import pe.gob.oefa.model.json.SolicitudFiltroRequest;
import pe.gob.oefa.sirte.facade.DocumentoFacade;
import pe.gob.oefa.util.GenericUtil;

@RestController
@RequestMapping("/business/documento")
public class DocumentoController {

	@Autowired
	private DocumentoFacade documentoFacade;

	@CrossOrigin("*")
	@GetMapping("/get/{uuid}")
	public ReporteResponse get(@PathVariable String uuid) {
		return documentoFacade.get(uuid);
	}

	@CrossOrigin("*")
	@PostMapping("/updload")
	public ReporteResponse updload(@RequestParam("files") MultipartFile[] files) {
		System.out.println("Estamos en el subir documento....------///ZZZZZ>>>>>>>>>>>>>>>>>>>>>" + files.length);
		return documentoFacade.updload(files);
	}

}
