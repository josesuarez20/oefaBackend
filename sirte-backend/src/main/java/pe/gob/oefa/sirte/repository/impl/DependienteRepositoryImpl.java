package pe.gob.oefa.sirte.repository.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.gob.oefa.sirte.dao.DependienteDAO;
import pe.gob.oefa.sirte.dto.DependienteDTO;
import pe.gob.oefa.sirte.repository.DependienteRepository;

@Repository("dependienteRepository")
public class DependienteRepositoryImpl implements DependienteRepository {

	@Autowired
	private DependienteDAO dependienteDAO;
	
	@Override
	public List<DependienteDTO> getByParameter(DependienteDTO t) {
		Map<String,Object> map=new HashMap<>();
		map.put("documentoresponsable", t.getDocumentoresponsable());
		map.put("documento", t.getDocumento());
		return dependienteDAO.getByParameter(map);
	}
	
	@Override
	public List<DependienteDTO> getByParameterConResponsable(DependienteDTO t) {
		Map<String,Object> map=new HashMap<>();
		map.put("documentoresponsable", t.getDocumentoresponsable());
		map.put("documento", t.getDocumento());
		map.put("nombres", t.getNombres());
		return dependienteDAO.getByParameterConResponsable(map);
	}
	
	@Override
	public DependienteDTO get(DependienteDTO dependienteDTO) {
		return dependienteDAO.get(dependienteDTO);
	}

	@Override
	public void save(DependienteDTO materiaDTO) {
		dependienteDAO.save(materiaDTO);
	}

	@Override
	public void updateAdicional(DependienteDTO materiaDTO) {
		dependienteDAO.update(materiaDTO);
	}
	
	@Override
	public void saveAdicional(DependienteDTO materiaDTO) {
		dependienteDAO.saveAdicional(materiaDTO);
	}

	@Override
	public void update(DependienteDTO materiaDTO) {
		dependienteDAO.update(materiaDTO);
	}

	@Override
	public void delete(DependienteDTO materiaDTO) {
		dependienteDAO.delete(materiaDTO);
	}

	@Override
	public List<DependienteDTO> getByParameterAdicional(DependienteDTO t) {
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap<>();
		map.put("documentoresponsable", t.getDocumentoresponsable());
		map.put("documento", t.getDocumento());
		return dependienteDAO.getByParameterAdicional(map);
	}

	@Override
	public List<DependienteDTO> getByParameterConResponsableAll(DependienteDTO t) {
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap<>();
		map.put("documentoresponsable", t.getDocumentoresponsable());
		map.put("documento", t.getDocumento());
		map.put("nombres", t.getNombres());
		return dependienteDAO.getByParameterConResponsableAll(map);
	}

}
