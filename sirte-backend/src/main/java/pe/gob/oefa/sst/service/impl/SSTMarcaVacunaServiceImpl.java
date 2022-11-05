package pe.gob.oefa.sst.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.sirte.dao.SSTMarcaVacunaDAO;
import pe.gob.oefa.sirte.dto.SSTMarcaVacunaDTO;
import pe.gob.oefa.sst.service.SSTMarcaVacunaService;

@Service("sstmarcavacunaService")
@Transactional
public class SSTMarcaVacunaServiceImpl extends ServiceBase implements SSTMarcaVacunaService {

	private CoreLogger logger = LoggerFactory.getLogger(SSTMarcaVacunaServiceImpl.class);

	@Autowired
	private SSTMarcaVacunaDAO sstMarcaVacunaDAO;

	@Override
	public List<SSTMarcaVacunaDTO> getByParameter(SSTMarcaVacunaDTO obj) {
		// TODO Auto-generated method stub
		List<SSTMarcaVacunaDTO> retorno = new ArrayList<SSTMarcaVacunaDTO>();
		HashMap<String, Object> row = null;

		if (obj.getActivo() != null) {
			if ("-1".equals(obj.getActivo())) {
				obj.setActivo(null);
			}
		}

		Map<String, Object> map = new HashMap<>();
		map.put("p_nombre", obj.getNombre());
		map.put("p_estado", obj.getActivo());

		sstMarcaVacunaDAO.getByParameter(map);

		List list = null;

		list = (ArrayList) map.get("r_sst_marcas");

		for (Object rowObj : list) {

			row = (HashMap<String, Object>) rowObj;

			SSTMarcaVacunaDTO objretorno = new SSTMarcaVacunaDTO();

			if (row.get("nu_id_marca") != null) {
				objretorno.setIdmarca(new BigDecimal(row.get("nu_id_marca").toString()));
			}
			if (row.get("tx_nombre") != null) {
				objretorno.setNombre(row.get("tx_nombre").toString());
			}

			retorno.add(objretorno);

		}

		return retorno;
	}

	@Override
	public SSTMarcaVacunaDTO get(BigDecimal id_marca) {
		// TODO Auto-generated method stub
		SSTMarcaVacunaDTO retorno = new SSTMarcaVacunaDTO();
		HashMap<String, Object> row = null;

		Map<String, Object> map = new HashMap<>();
		map.put("p_id_marca", id_marca);

		sstMarcaVacunaDAO.get(map);

		List list = null;

		list = (ArrayList) map.get("r_sst_marcas");

		for (Object rowObj : list) {

			row = (HashMap<String, Object>) rowObj;

			if (row.get("nu_id_marca") != null) {
				retorno.setIdmarca(new BigDecimal(row.get("nu_id_marca").toString()));
			}
			if (row.get("tx_nombre") != null) {
				retorno.setNombre(row.get("tx_nombre").toString());
			}

		}

		return retorno;
	}

	@Override
	public SSTMarcaVacunaDTO save(SSTMarcaVacunaDTO obj) throws Exception {
		// TODO Auto-generated method stub
		// UserSession userSession = SecurityUtil.getUserSession();
		return null;
	}

	@Override
	public SSTMarcaVacunaDTO update(SSTMarcaVacunaDTO obj) throws Exception {
		// TODO Auto-generated method stub
		// UserSession userSession = SecurityUtil.getUserSession();
		return null;
	}

	@Override
	public void delete(SSTMarcaVacunaDTO obj) throws Exception {
		// TODO Auto-generated method stub

	}

}
