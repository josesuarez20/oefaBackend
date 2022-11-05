package pe.gob.oefa.sia.service.impl;

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
import pe.gob.oefa.sia.dto.ASAreaDTO;
import pe.gob.oefa.sia.service.AsAreaService;
import pe.gob.oefa.sirte.dao.AsAreaDAO;

@Service("asareaService")
@Transactional
public class AsAreaServiceImpl extends ServiceBase implements AsAreaService {

	private CoreLogger logger = LoggerFactory.getLogger(AsAreaServiceImpl.class);

	@Autowired
	private AsAreaDAO asAreaDAO;

	@Override
	public List<ASAreaDTO> getByParameter(ASAreaDTO obj) {
		// TODO Auto-generated method stub
		List<ASAreaDTO> retorno = new ArrayList<ASAreaDTO>();
		HashMap<String, Object> row = null;

		Map<String, Object> map = new HashMap<>();
		map.put("p_nombre", obj.getNombre());
		map.put("p_estado", obj.getEstado());

		asAreaDAO.getByParameter(map);

		List list = null;

		list = (ArrayList) map.get("r_as_areas");

		for (Object rowObj : list) {

			row = (HashMap<String, Object>) rowObj;

			ASAreaDTO objretorno = new ASAreaDTO();

			if (row.get("idarea") != null) {
				objretorno.setIdarea(new BigDecimal(row.get("idarea").toString()));
			}
			if (row.get("nombre") != null) {
				objretorno.setNombre(row.get("nombre").toString());
			}

			retorno.add(objretorno);

		}

		return retorno;
	}

}
