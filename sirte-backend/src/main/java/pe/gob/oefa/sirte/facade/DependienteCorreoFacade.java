package pe.gob.oefa.sirte.facade;

import java.math.BigDecimal;

import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.json.DependienteCorreoRequest;
import pe.gob.oefa.model.json.DependienteCorreoResponse;

public interface DependienteCorreoFacade {

	CollectionResponse<DependienteCorreoResponse> find(DependienteCorreoRequest request);

	DependienteCorreoResponse get(BigDecimal id);

	DependienteCorreoResponse saveOrUpdate(DependienteCorreoRequest request);

	DependienteCorreoResponse delete(DependienteCorreoRequest request);
	
}
