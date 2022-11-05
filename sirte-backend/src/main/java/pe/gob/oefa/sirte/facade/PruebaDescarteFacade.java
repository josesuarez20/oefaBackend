package pe.gob.oefa.sirte.facade;

import java.math.BigDecimal;

import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.core.ResponseBase;
import pe.gob.oefa.model.json.PruebaDescarteRequest;
import pe.gob.oefa.model.json.PruebaDescarteResponse;

public interface PruebaDescarteFacade {

	CollectionResponse<PruebaDescarteResponse> find(PruebaDescarteRequest request);

	PruebaDescarteResponse get(BigDecimal id);

	ResponseBase saveOrUpdate(PruebaDescarteRequest request);
	
	ResponseBase saveOrUpdateAdmin(PruebaDescarteRequest request);

	PruebaDescarteResponse delete(PruebaDescarteRequest request);
	
}
