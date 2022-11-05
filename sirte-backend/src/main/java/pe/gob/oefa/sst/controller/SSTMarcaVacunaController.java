package pe.gob.oefa.sst.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.oefa.apps.base.util.ValidateException;
import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.json.SSTMarcaVacunaRequest;
import pe.gob.oefa.model.json.SSTMarcaVacunaResponse;
import pe.gob.oefa.sirte.dto.SSTMarcaVacunaDTO;
import pe.gob.oefa.sst.service.SSTMarcaVacunaService;
import pe.gob.oefa.util.GenericUtil;

@RestController
@RequestMapping("/business/sstMarcaVacuna")
public class SSTMarcaVacunaController {

	@Autowired
	private SSTMarcaVacunaService sstMarcaVacunaService;

	@Autowired
	private ModelMapper modelMapper;

	@Value("${encrypt.key}")
	private String key;

	@CrossOrigin("*")
	@PostMapping("/find")
	public CollectionResponse<SSTMarcaVacunaResponse> find(@RequestBody SSTMarcaVacunaRequest request) {
		GenericUtil.toUpperCase(request);
		List<SSTMarcaVacunaDTO> list = sstMarcaVacunaService
				.getByParameter(modelMapper.map(request, SSTMarcaVacunaDTO.class));
		List<SSTMarcaVacunaResponse> listResponse = new ArrayList<>();
		for (SSTMarcaVacunaDTO obj : list) {
			listResponse.add(modelMapper.map(obj, SSTMarcaVacunaResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

	

	@CrossOrigin("*")
	@GetMapping("/get/{idmarca}")
	public SSTMarcaVacunaResponse get(@PathVariable BigDecimal idmarca) {
		try {
			SSTMarcaVacunaResponse obj = modelMapper.map(sstMarcaVacunaService.get(idmarca),
					SSTMarcaVacunaResponse.class);
			return obj;
		} catch (ValidateException e) {
			return null;
		} catch (Exception e) {
			return null;
		}
	}
}
