package pe.gob.oefa.sst.service;

import java.math.BigDecimal;
import java.util.List;

import pe.gob.oefa.sirte.dto.SSTMarcaVacunaDTO;

public interface SSTMarcaVacunaService {

	List<SSTMarcaVacunaDTO> getByParameter(SSTMarcaVacunaDTO obj);

	SSTMarcaVacunaDTO save(SSTMarcaVacunaDTO obj) throws Exception;

	SSTMarcaVacunaDTO update(SSTMarcaVacunaDTO obj) throws Exception;

	void delete(SSTMarcaVacunaDTO obj) throws Exception;

	SSTMarcaVacunaDTO get(BigDecimal idmarca) throws Exception;

}
