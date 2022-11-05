package pe.gob.oefa.model.core;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.json.ComboResponse;
import pe.gob.oefa.util.GenericUtil;
@JsonInclude(Include.NON_NULL)
public class ComboBaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 757193680506542328L;
	private List<ComboResponse> list;
	private Integer size;	

	public ComboBaseResponse() {
	}
	
	/**
	 * 
	 * @param list
	 */
	public ComboBaseResponse(List<ComboResponse> list) {
		this.list = list;
		if(GenericUtil.isNotNull(list)) {
			this.size = list.size();
		}
	}

	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * @return the list
	 */
	public List<ComboResponse> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<ComboResponse> list) {
		this.list = list;
	}
	
}
