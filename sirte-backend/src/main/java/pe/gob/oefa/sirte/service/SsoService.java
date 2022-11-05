package pe.gob.oefa.sirte.service;

import java.util.List;

import pe.gob.oefa.sirte.dto.CredencialesUsuarioSSODTO;
import pe.gob.oefa.sirte.dto.InsertarUsuarioDTO;
import pe.gob.oefa.sirte.dto.InsertarUsuarioResponseDTO;
import pe.gob.oefa.sirte.dto.ObtenerUsuarioSSODTO;
import pe.gob.oefa.sirte.dto.OpcionesPorUsuarioSSODTO;
import pe.gob.oefa.sirte.dto.PerfilPorUsuarioSSODTO;
import pe.gob.oefa.sirte.dto.PersonaJuridicaSSODTO;
import pe.gob.oefa.sirte.dto.PersonaNaturalSSODTO;
import pe.gob.oefa.sirte.dto.SSOUsuarioxPerfilDTO;
import pe.gob.oefa.srsalas.dto.seguridad.OpcionDTO;

public interface SsoService {

	ObtenerUsuarioSSODTO findSSOByTipoDocumentoDocumento(String tipodocumento, String documento);

	PersonaNaturalSSODTO findSSOByDni(String dni);

	PersonaNaturalSSODTO findSSOByCE(String ce);

	PersonaJuridicaSSODTO findSSOByRuc(String ruc);

	InsertarUsuarioResponseDTO findUsuarioSIRTE(InsertarUsuarioDTO insertausuarioDTO);

	InsertarUsuarioResponseDTO cambiarClave(InsertarUsuarioDTO insertausuarioDTO);

	// InsertarUsuarioResponseDTO cambiarClave(CredencialesUsuarioSSODTO
	// credencialusuarioDTO,String ClaveNueva);

	InsertarUsuarioResponseDTO validarUsuario(CredencialesUsuarioSSODTO credencialusuarioDTO);

	List<PerfilPorUsuarioSSODTO> findPerfilPorUsuarioSSOByIdusuario(String idusuario);

	List<OpcionesPorUsuarioSSODTO> ListarOpcionPorIdUsuarioIdAplicacion(String idusuario);

	List<InsertarUsuarioResponseDTO> ListarUsuariosPorAplicacion();

	List<SSOUsuarioxPerfilDTO> ListarUsuariosPorPerfilAdmin(String tokenSession);

	List<SSOUsuarioxPerfilDTO> ListarUsuariosPorPerfilResponsable(String tokenSession);

	List<SSOUsuarioxPerfilDTO> ListarUsuariosPorPerfilAdicional(String tokenSession);

	List<SSOUsuarioxPerfilDTO> ListarUsuariosPorPerfilSiga(String tokenSession);

	List<OpcionDTO> ListarOpcionHomePorIdUsuarioIdAplicacion(String idusuario);

	ObtenerUsuarioSSODTO findSSOaseguraUsuario(String idusuario, String tipodocumento, String documento, String clave,
			String correo);

	List<PerfilPorUsuarioSSODTO> findPerfilPorUsuarioSSOByIdusuarioSSO2(String idusuario, String tokenSession);

	List<OpcionesPorUsuarioSSODTO> ListarOpcionPorIdUsuarioIdAplicacionSSO2(String idusuario, String tokenSession);

}
