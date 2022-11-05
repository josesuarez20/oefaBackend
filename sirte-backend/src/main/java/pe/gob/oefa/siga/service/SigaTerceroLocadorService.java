package pe.gob.oefa.siga.service;

import java.util.List;

import pe.gob.oefa.siga.dto.SigaTerceroLocadorDTO;

public interface SigaTerceroLocadorService {

	List<SigaTerceroLocadorDTO> getByParameter(SigaTerceroLocadorDTO obj) throws Exception;

}
