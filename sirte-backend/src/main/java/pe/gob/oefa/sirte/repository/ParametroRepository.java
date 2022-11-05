package pe.gob.oefa.sirte.repository;

import java.util.List;

import pe.gob.oefa.dto.core.ParametroDTO;

public interface ParametroRepository {

	List<ParametroDTO> obtener(ParametroDTO t);

}
