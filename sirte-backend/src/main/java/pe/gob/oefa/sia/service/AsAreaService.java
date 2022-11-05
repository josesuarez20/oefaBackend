package pe.gob.oefa.sia.service;

import java.util.List;

import pe.gob.oefa.sia.dto.ASAreaDTO;

public interface AsAreaService {

	List<ASAreaDTO> getByParameter(ASAreaDTO obj);

}
