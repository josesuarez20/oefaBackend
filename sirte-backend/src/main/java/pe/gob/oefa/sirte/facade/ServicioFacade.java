package pe.gob.oefa.sirte.facade;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PathVariable;

import pe.gob.oefa.interoperabilidad.ws.migraciones.service.RespuestaBean;
import pe.gob.oefa.interoperabilidad.ws.pj.service.RpatBeanPJ;
import pe.gob.oefa.interoperabilidad.ws.sunarp.service.ResultadoTitularidad;
import pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanDdp;
import pe.gob.oefa.interoperabilidad.ws.sunedu.service.GtPersonaType;
import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.json.DataInpeResponse;
import pe.gob.oefa.model.json.DataPersonaResponse;
import pe.gob.oefa.model.json.SolRepresentanteResponse;
import pe.gob.oefa.model.json.SolicitudResponse;
import pe.gob.reniec.ws.ResultadoConsulta;

public interface ServicioFacade {
	
	DataPersonaResponse initReniec();
//	RespuestaBean initMigra();
	DataPersonaResponse initMigra();
	
	CollectionResponse<GtPersonaType> initSunedu(BigDecimal id);
	
	DataInpeResponse initInpe(BigDecimal id);
	
	RpatBeanPJ initPJ(BigDecimal id);
	

	
	BeanDdp initSunat();
	
	CollectionResponse<ResultadoTitularidad> initSunarp();
	
	SolicitudResponse initJur();	

	CollectionResponse<SolRepresentanteResponse> initRP(BigDecimal id);	

}
