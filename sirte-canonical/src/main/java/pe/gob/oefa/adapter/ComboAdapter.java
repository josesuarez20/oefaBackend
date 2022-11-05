package pe.gob.oefa.adapter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import pe.gob.oefa.model.core.ComboBaseResponse;
import pe.gob.oefa.model.json.ComboResponse;

public class ComboAdapter{

	private static ComboAdapter comboAdapter;
	
	private Boolean codigoCadena = true;
	private String atrCodigo = "codigo";
	private String atrNombre = "nombre";
	
	private ComboAdapter() {
	}
	
	public static ComboAdapter getInstance() {
		if(comboAdapter == null) {
			comboAdapter = new ComboAdapter();
		}
		return comboAdapter;
	}
	
	public void setConfigurarion(Boolean codigoCadena) {
		this.codigoCadena = codigoCadena;
		this.atrCodigo = "codigo";
		this.atrNombre = "nombre";
	}
	
	public void setConfigurarion(String atrCodigo,String atrNombre) {
		this.atrCodigo = atrCodigo;
		this.atrNombre = atrNombre;
	}

	public void setConfigurarion(Boolean codigoCadena, String atrCodigo,String atrNombre) {
		this.codigoCadena = codigoCadena;
		this.atrCodigo = atrCodigo;
		this.atrNombre = atrNombre;
	}
	
	public <T> ComboBaseResponse getComboBaseDTO(List<T> listDTO){
		ComboBaseResponse comboBaseDTO = new ComboBaseResponse();
		List<ComboResponse> list = new ArrayList<>();
		ComboResponse comboDTO = null;
		for (T bean : listDTO) {
			try {
				comboDTO = new ComboResponse();
				if(codigoCadena) {
					comboDTO.setCodigo(BeanUtils.getProperty(bean, atrCodigo));
				}else {
					comboDTO.setId(new BigDecimal(BeanUtils.getProperty(bean, atrCodigo)));
				}
				comboDTO.setNombre(BeanUtils.getProperty(bean, atrNombre));
				list.add(comboDTO);
			} catch (Exception e) {
				e.printStackTrace();
				//TODO por mejorar, se necesita modularizar las excepciones en un core.
			}
		}
		comboBaseDTO.setList(list);
		comboBaseDTO.setSize(list.size());
		return comboBaseDTO;
	}
}
