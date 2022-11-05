package pe.gob.oefa.sirte.service;

import pe.gob.oefa.sirte.dto.CorreoEnvioDTO;
import pe.gob.oefa.sirte.dto.InsertarUsuarioDTO;
import pe.gob.oefa.sirte.dto.ProgramacionDTO;

public interface EnvioCorreoService {

	public CorreoEnvioDTO sendCorreoPreventivo(ProgramacionDTO programacionDTO) throws Exception;
	
	public CorreoEnvioDTO sendCorreoCreacionUsuario(InsertarUsuarioDTO insertausuarioDTO);

}