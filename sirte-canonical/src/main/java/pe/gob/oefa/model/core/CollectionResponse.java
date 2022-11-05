package pe.gob.oefa.model.core;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import pe.gob.oefa.util.Constantes;

public class CollectionResponse<T> {

	private List<T> elements;
	private BigDecimal total;
	private BigDecimal pageSize=Constantes.PAGINATION_SIZE;
	private BigDecimal pageNumber;
	private List<Integer> pageList=new ArrayList<>();

	public CollectionResponse(List<T> elements) {
		super();
		this.elements = elements;
	}
	public CollectionResponse(List<T> elements,BigDecimal total,BigDecimal pageNumber) {
		super();
		this.elements = elements;
		this.total=total;
		this.pageNumber=pageNumber;
	}

	/**
	 * @return the elements
	 */
	public List<T> getElements() {
		return elements;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getPageSize() {
		return pageSize;
	}

	public void setPageSize(BigDecimal pageSize) {
		this.pageSize = pageSize;
	}

	public BigDecimal getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(BigDecimal pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Integer> getPageList() {
		return pageList;
	}

	public void setPageList(List<Integer> pageList) {
		this.pageList = pageList;
	}

	public void setElements(List<T> elements) {
		this.elements = elements;
	}
	
	
}
