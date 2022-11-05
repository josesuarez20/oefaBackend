package pe.gob.oefa.sirte.dao;

import java.util.List;
import java.util.Map;

import pe.gob.oefa.dto.core.ComboDTO;

public interface ComboDAO {

	List<ComboDTO> listarTipoVinculo(Map<String, Object> map);
	
	List<ComboDTO> listarVacuna(Map<String, Object> map);

}
