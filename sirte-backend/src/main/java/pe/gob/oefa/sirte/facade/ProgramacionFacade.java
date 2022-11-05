package pe.gob.oefa.sirte.facade;

import java.math.BigDecimal;

import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.core.ResponseBase;
import pe.gob.oefa.model.json.ProgramacionDetalleRequest;
import pe.gob.oefa.model.json.ProgramacionDetalleResponse;
import pe.gob.oefa.model.json.ProgramacionRequest;
import pe.gob.oefa.model.json.ProgramacionResponse;

public interface ProgramacionFacade {

	CollectionResponse<ProgramacionResponse> find(ProgramacionRequest request);

	ProgramacionResponse get(BigDecimal id);

	ResponseBase saveOrUpdate(ProgramacionRequest request);
	
	ResponseBase saveOrUpdateAdmin(ProgramacionRequest request);

	ProgramacionResponse delete(ProgramacionRequest request);
	
	ProgramacionDetalleResponse deleteDetalle(ProgramacionDetalleRequest request);
	
	ProgramacionDetalleResponse saveDetalle(ProgramacionDetalleRequest request);
	
	ProgramacionDetalleResponse saveDetalleAdmin(ProgramacionDetalleRequest request);
}
