package pe.gob.oefa.sirte.service;

import java.util.List;

import pe.gob.oefa.dto.core.ComboDTO;

public interface ComboService {

	List<ComboDTO> listarTipoVinculo(ComboDTO t);
	
	List<ComboDTO> listarVacuna(ComboDTO t);
}
