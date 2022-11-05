package pe.gob.oefa.dto.web;

import java.io.Serializable;
import java.util.List;

public class GridBaseDTO<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7025118748317849984L;

	private List<T> list;
	private Integer size;

	public GridBaseDTO() {
	}

	/**
	 * @return the list
	 */
	public List<?> getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(List<T> list) {
		this.list = list;
	}

	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

}
