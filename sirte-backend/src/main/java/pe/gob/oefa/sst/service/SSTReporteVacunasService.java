package pe.gob.oefa.sst.service;

import java.util.List;

import pe.gob.oefa.sst.dto.SSTReporteFiltroDto;
import pe.gob.oefa.sst.dto.SSTReporteVacunasDto;

public interface SSTReporteVacunasService {

	List<SSTReporteVacunasDto> getReporteVacunados(SSTReporteFiltroDto obj);

	SSTReporteVacunasDto generarReporteVacunados(SSTReporteFiltroDto sstReporteFiltroDto);

}
