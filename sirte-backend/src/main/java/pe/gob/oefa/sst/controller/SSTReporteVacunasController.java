package pe.gob.oefa.sst.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.json.ReporteResponse;
import pe.gob.oefa.model.json.SSTReporteFiltroRequest;
import pe.gob.oefa.model.json.SSTReporteVacunasResponse;
import pe.gob.oefa.sst.dto.SSTReporteFiltroDto;
import pe.gob.oefa.sst.dto.SSTReporteVacunasDto;
import pe.gob.oefa.sst.service.SSTReporteVacunasService;

@RestController
@RequestMapping("/business/sstReporteVacunas")
public class SSTReporteVacunasController {

	@Autowired
	private SSTReporteVacunasService sstReporteVacunasService;

	@Autowired
	private ModelMapper modelMapper;

	@CrossOrigin("*")
	@PostMapping
	public CollectionResponse<SSTReporteVacunasResponse> find(@RequestBody SSTReporteFiltroRequest request) {
		List<SSTReporteVacunasDto> list = sstReporteVacunasService
				.getReporteVacunados(modelMapper.map(request, SSTReporteFiltroDto.class));
		List<SSTReporteVacunasResponse> listResponse = new ArrayList<>();
		for (SSTReporteVacunasDto obj : list) {
			listResponse.add(modelMapper.map(obj, SSTReporteVacunasResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}
	
	@CrossOrigin("*")
	@PostMapping("/generarReporteVacunados")
	public ReporteResponse generarReporteAutorizados(@RequestBody SSTReporteFiltroRequest request)
			throws Exception {

		ReporteResponse reporteResponse = null;
		try {
			SSTReporteVacunasDto sstReporteVacunasDto = sstReporteVacunasService
					.generarReporteVacunados(modelMapper.map(request, SSTReporteFiltroDto.class));
			if (sstReporteVacunasDto.getArchivo() != null) {
				reporteResponse = new ReporteResponse();
				reporteResponse.setFileContent(sstReporteVacunasDto.getArchivo());
				reporteResponse.setContentType("application/vnd.ms-excel");
				reporteResponse.setNombre(sstReporteVacunasDto.getArchivoNombre());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return reporteResponse;

	}

}
