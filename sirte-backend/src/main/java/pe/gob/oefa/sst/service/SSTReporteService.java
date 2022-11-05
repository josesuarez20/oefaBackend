package pe.gob.oefa.sst.service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import pe.gob.oefa.sst.dto.SSTReporteDto;

public interface SSTReporteService<T extends SSTReporteDto> {

	public File generarReporteExcel(String plnatilla, ArrayList<HashMap<Integer, String>> data, int rowIni)
			throws Exception;

}
