package pe.gob.oefa.sirte.repository;

import java.util.List;

import pe.gob.oefa.dto.core.ComboDTO;

public interface ComboRepository {

	List<ComboDTO> listarTipoVinculo(ComboDTO t);
	
	List<ComboDTO> listarVacuna(ComboDTO t);

}
