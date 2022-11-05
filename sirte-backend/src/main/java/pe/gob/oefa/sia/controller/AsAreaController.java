package pe.gob.oefa.sia.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.json.AsAreaRequest;
import pe.gob.oefa.model.json.AsAreaResponse;
import pe.gob.oefa.sia.dto.ASAreaDTO;
import pe.gob.oefa.sia.service.AsAreaService;

@RestController
@RequestMapping("/business/asarea")
public class AsAreaController {

	@Autowired
	private AsAreaService asAreaService;

	@Autowired
	private ModelMapper modelMapper;

	@CrossOrigin("*")
	@PostMapping("/find")
	public CollectionResponse<AsAreaResponse> find(@RequestBody AsAreaRequest request) {
		List<ASAreaDTO> list = asAreaService.getByParameter(modelMapper.map(request, ASAreaDTO.class));
		List<AsAreaResponse> listResponse = new ArrayList<>();
		for (ASAreaDTO obj : list) {
			listResponse.add(modelMapper.map(obj, AsAreaResponse.class));
		}
		return new CollectionResponse<>(listResponse);

	}

}
