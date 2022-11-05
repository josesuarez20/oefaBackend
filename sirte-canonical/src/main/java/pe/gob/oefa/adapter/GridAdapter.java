package pe.gob.oefa.adapter;

import java.util.List;

import pe.gob.oefa.dto.web.GridBaseDTO;

public class GridAdapter {

	private static GridAdapter gridAdapter;
	
	private GridAdapter() {
	}
	
	/**
	 * 
	 * @return
	 */
	public static GridAdapter getInstance() {
		if(gridAdapter == null) {
			gridAdapter = new GridAdapter();
		}
		return gridAdapter;
	}
	
	/**
	 * 
	 * @param listDTO
	 * @return
	 */
	public <T> GridBaseDTO<T> getGridBaseDTO(List<T> listDTO) {
		GridBaseDTO<T> gridBaseDTO = new GridBaseDTO<T>();
		gridBaseDTO.setList(listDTO);
		gridBaseDTO.setSize(listDTO.size());
		return gridBaseDTO;
	}
 
}
