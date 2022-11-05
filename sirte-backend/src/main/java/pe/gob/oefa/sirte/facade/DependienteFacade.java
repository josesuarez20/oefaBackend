package pe.gob.oefa.sirte.facade;

import java.math.BigDecimal;
import java.util.List;

import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.json.DependienteRequest;
import pe.gob.oefa.model.json.DependienteResponse;
import pe.gob.oefa.model.json.ProgramacionRequest;
import pe.gob.oefa.model.json.PruebaDescarteRequest;
import pe.gob.oefa.sirte.dto.DependienteDTO;

public interface DependienteFacade {

	CollectionResponse<DependienteResponse> find(DependienteRequest request);

	CollectionResponse<DependienteResponse> listaConResponsable(DependienteRequest request);

	CollectionResponse<DependienteResponse> findAdicional(DependienteRequest request);

	CollectionResponse<DependienteResponse> findprogramacion(ProgramacionRequest request);

	CollectionResponse<DependienteResponse> findprogramacionAdmin(ProgramacionRequest request) throws Exception;

	CollectionResponse<DependienteResponse> findpruebadescarte(PruebaDescarteRequest request);

	CollectionResponse<DependienteResponse> findpruebadescarteAdmin(PruebaDescarteRequest request) throws Exception;

	DependienteResponse get(DependienteRequest request);

	DependienteResponse saveOrUpdate(DependienteRequest request);

	DependienteResponse delete(DependienteRequest request);

	DependienteResponse nuevoByDni(String dni);

	DependienteResponse guardarAdicional(DependienteRequest request);

	CollectionResponse<DependienteResponse> listaConResponsableAll(DependienteRequest request) throws Exception;
}
