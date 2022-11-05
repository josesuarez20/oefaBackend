package pe.gob.oefa.sirte.facade;

import pe.gob.oefa.dto.core.ComboDTO;
import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.json.ComboResponse;
import pe.gob.oefa.model.json.InsertarAseguraUsuarioRequest;
import pe.gob.oefa.model.json.SSOObtenerUsuarioResponse;
import pe.gob.oefa.model.json.SSOPersonaNaturalResponse;
import pe.gob.oefa.model.json.SolicitudCombosResponse;

public interface ComboFacade {
	
	public SolicitudCombosResponse listarTipoVinculo(ComboDTO t);

	public CollectionResponse<ComboResponse> listarVacuna(ComboDTO t);
	
	public SSOObtenerUsuarioResponse SSOaseguraUsuario(InsertarAseguraUsuarioRequest request);
	
	public SSOPersonaNaturalResponse SSOfindByDni(String dni) ;
	
	public SSOObtenerUsuarioResponse SSOobtenerusuarioByTipoDocumentoDocumento(String tipodocumento, String documento); 

}
