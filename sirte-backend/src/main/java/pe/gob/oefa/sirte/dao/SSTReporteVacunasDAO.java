package pe.gob.oefa.sirte.dao;

import java.util.Map;

import pe.gob.oefa.sst.dto.SSTReporteVacunasDto;

public interface SSTReporteVacunasDAO extends SSTReporteDAO<SSTReporteVacunasDto> {

	Map<String, Object> getReporteVacunados(Map<String, Object> map);

}
