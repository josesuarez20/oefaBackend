package pe.gob.oefa.siga.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.apps.base.util.UtilFecha;
import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.siga.dto.SigaTerceroLocadorDTO;
import pe.gob.oefa.siga.service.SigaTerceroLocadorService;
import pe.gob.oefa.sirte.dao.SigaTerceroLocadorDAO;

@Service("sigaTerceroLocadorService")
@Transactional
public class SigaTerceroLocadorServiceImpl extends ServiceBase implements SigaTerceroLocadorService {

	@Autowired
	private SigaTerceroLocadorDAO sigaTerceroLocadorDAO;

	@Override
	public List<SigaTerceroLocadorDTO> getByParameter(SigaTerceroLocadorDTO obj) throws Exception {
		// TODO Auto-generated method stub
		List<SigaTerceroLocadorDTO> retorno = new ArrayList<SigaTerceroLocadorDTO>();

		HashMap<String, Object> row = null;

		Map<String, Object> map = new HashMap<>();
		map.put("p_idanoproc", UtilFecha.obtenerAnioActual());
		map.put("p_iduejecod", "001");
		map.put("p_idppicodigo", null);
		map.put("p_dni", obj.getDni());
		map.put("p_ruc", null);
		map.put("p_id_area", obj.getIdareasia());
		map.put("p_nombre", obj.getNombrecompleto());

		sigaTerceroLocadorDAO.getByParameter(map);

		List list = null;

		list = (ArrayList) map.get("p_results");

		for (Object rowObj : list) {

			row = (HashMap<String, Object>) rowObj;

			SigaTerceroLocadorDTO objretorno = new SigaTerceroLocadorDTO();

			if (row.get("dni") != null) {
				objretorno.setDni(row.get("dni").toString());
			}

			if (row.get("ruc") != null) {
				objretorno.setRuc(row.get("ruc").toString());
			}
			if (row.get("nombrecompleto") != null) {
				objretorno.setNombrecompleto(row.get("nombrecompleto").toString());
			}

			if (row.get("oficina") != null) {
				objretorno.setOficina(row.get("oficina").toString());
			}

			if (row.get("nroordencontrato") != null) {
				objretorno.setNroordencontrato(row.get("nroordencontrato").toString());
			}

			if (row.get("contratodescripcion") != null) {
				objretorno.setContratodescripcion(row.get("contratodescripcion").toString());
			}

			if (row.get("flgvigente") != null) {
				objretorno.setFlgVigente(row.get("flgvigente").toString());
			}

			if (row.get("fechadesde") != null) {
				objretorno.setFechadesde((Date) row.get("fechadesde"));
			}
			if (row.get("fechahasta") != null) {
				objretorno.setFechahasta((Date) row.get("fechahasta"));
			}

			if (row.get("area_sia") != null) {
				objretorno.setIdareasia(new BigDecimal(row.get("area_sia").toString()));
			}

			if (row.get("nombre_area_sia") != null) {
				objretorno.setNombreareasia(row.get("nombre_area_sia").toString());
			}

			retorno.add(objretorno);

		}

		return retorno;
	}

}
