package pe.gob.oefa.sst.service.impl;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.apps.base.util.UtilFecha;
import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.sirte.dao.SSTReporteVacunasDAO;
import pe.gob.oefa.sst.dto.SSTReporteFiltroDto;
import pe.gob.oefa.sst.dto.SSTReporteVacunasDto;
import pe.gob.oefa.sst.service.SSTReporteVacunasService;

@Service("sstreportevacunasService")
@Transactional
public class SSTReporteVacunasServiceImpl extends SSTReporteServiceImpl implements SSTReporteVacunasService {

	private CoreLogger logger = LoggerFactory.getLogger(SSTReporteVacunasServiceImpl.class);

	@Value("${template.excel.reporte.vacunados}")
	private String pathPlantillaReporteVacunados;

	@Autowired
	private SSTReporteVacunasDAO sstReporteVacunasDAO;

	@Override
	public List<SSTReporteVacunasDto> getReporteVacunados(SSTReporteFiltroDto reporteFiltro) {
		// TODO Auto-generated method stub
		List<SSTReporteVacunasDto> retorno = new ArrayList<SSTReporteVacunasDto>();
		HashMap<String, Object> row = null;

		Map<String, Object> map = new HashMap<>();
		map.put("p_documento_busqueda", reporteFiltro.getDocumentobusqueda());
		map.put("p_id_area", reporteFiltro.getIdarea());
		map.put("p_fecha_desde", reporteFiltro.getFechadesde());
		map.put("p_fecha_hasta", reporteFiltro.getFechahasta());

		sstReporteVacunasDAO.getReporteVacunados(map);

		List list = null;

		list = (ArrayList) map.get("r_sst_reporte");

		for (Object rowObj : list) {

			row = (HashMap<String, Object>) rowObj;

			SSTReporteVacunasDto objretorno = new SSTReporteVacunasDto();

			if (row.get("area") != null) {
				objretorno.setArea(row.get("area").toString());
			}
			if (row.get("persona") != null) {
				objretorno.setPersona(row.get("persona").toString());
			}
			if (row.get("correo") != null) {
				objretorno.setCorreo(row.get("correo").toString());
			}
			if (row.get("usuario") != null) {
				objretorno.setUsuario(row.get("usuario").toString());
			}
			if (row.get("primera_dosis") != null) {
				objretorno.setPrimera_dosis(row.get("primera_dosis").toString());
			}
			if (row.get("fecha_primera_dosis") != null) {
				objretorno.setFecha_primera_dosis((Date) row.get("fecha_primera_dosis"));
			}
			if (row.get("segunda_dosis") != null) {
				objretorno.setSegunda_dosis(row.get("segunda_dosis").toString());
			}
			if (row.get("fecha_segunda_dosis") != null) {
				objretorno.setFecha_segunda_dosis((Date) row.get("fecha_segunda_dosis"));
			}
			if (row.get("tercera_dosis") != null) {
				objretorno.setTercera_dosis(row.get("tercera_dosis").toString());
			}
			if (row.get("fecha_tercera_dosis") != null) {
				objretorno.setFecha_tercera_dosis((Date) row.get("fecha_tercera_dosis"));
			}
			if (row.get("cuarta_dosis") != null) {
				objretorno.setCuarta_dosis(row.get("cuarta_dosis").toString());
			}
			if (row.get("fecha_cuarta_dosis") != null) {
				objretorno.setFecha_cuarta_dosis((Date) row.get("fecha_cuarta_dosis"));
			}

			retorno.add(objretorno);

		}

		return retorno;
	}

	@Override
	public SSTReporteVacunasDto generarReporteVacunados(SSTReporteFiltroDto sstReporteFiltroDto) {
		// TODO Auto-generated method stub
		SSTReporteVacunasDto retorno = new SSTReporteVacunasDto();
		try {
			List<SSTReporteVacunasDto> lista = this.getReporteVacunados(sstReporteFiltroDto);
			if (lista != null) {
				ArrayList<HashMap<Integer, String>> data = new ArrayList<>();
				HashMap<Integer, String> hash;
				for (int i = 0; i < lista.size(); i++) {
					SSTReporteVacunasDto obj = lista.get(i);
					hash = new HashMap<>();
					hash.put(1, (i + 1) + "");
					hash.put(2, obj.getArea());
					hash.put(3, obj.getPersona());
					hash.put(4, obj.getCorreo());
					hash.put(5, obj.getUsuario());
					hash.put(6, obj.getPrimera_dosis());
					hash.put(7, UtilFecha.convertirFechaCadena(obj.getFecha_primera_dosis(), "dd/MM/yyyy"));
					hash.put(8, obj.getSegunda_dosis());
					hash.put(9, UtilFecha.convertirFechaCadena(obj.getFecha_segunda_dosis(), "dd/MM/yyyy"));
					hash.put(10, obj.getTercera_dosis());
					hash.put(11, UtilFecha.convertirFechaCadena(obj.getFecha_tercera_dosis(), "dd/MM/yyyy"));
					hash.put(12, obj.getCuarta_dosis());
					hash.put(13, UtilFecha.convertirFechaCadena(obj.getFecha_cuarta_dosis(), "dd/MM/yyyy"));

					data.add(hash);
				}
				File reporte = super.generarReporteExcel(pathPlantillaReporteVacunados, data, 6);
				retorno.setArchivoNombre(reporte.getName());
				retorno.setArchivo(Files.readAllBytes(reporte.toPath()));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;
	}

}
