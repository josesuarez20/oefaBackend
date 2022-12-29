package pe.gob.oefa.sirte.facade.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.model.json.DocumentoDataGridResponse;
import pe.gob.oefa.model.json.ReporteResponse;
import pe.gob.oefa.sirte.dto.DocumentoDTO;
import pe.gob.oefa.sirte.dto.DocumentoDataGridDTO;
import pe.gob.oefa.sirte.facade.DocumentoFacade;
import pe.gob.oefa.sirte.service.DocumentoService;
import pe.gob.oefa.util.Constantes;
import pe.gob.oefa.util.GenericUtil;

@Component("documentoEmoFacade")
public class DocumentoEmoFacadeImpl extends FacadeBase implements DocumentoFacade {
	private CoreLogger logger = LoggerFactory.getLogger(DocumentoEmoFacadeImpl.class);
	@Autowired
	private DocumentoService documentoService;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ReporteResponse get(String uuid) {
		try {
			return documentoService.get(uuid);
		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;

	}

	@Override
	public ReporteResponse updload(MultipartFile[] files) {
		System.out.println("files.length:::" + files.length);
		List<DocumentoDataGridResponse> listResponse = new ArrayList<>();

		ReporteResponse auxReporteResponse = new ReporteResponse();
		try {

			System.out.println("updload.....");
			if (GenericUtil.isNotEmpty(files)) {
				for (MultipartFile multipartFile : files) {

					if (multipartFile.getContentType().equalsIgnoreCase("application/pdf")
							|| multipartFile.getContentType().equalsIgnoreCase("image/jpeg")
							|| multipartFile.getContentType().equalsIgnoreCase("image/png")) {

						System.out.println("multipartFile.getContentType()...." + multipartFile.getContentType());
						/* public static final String MIME_APPLICATION_PDF = "application/pdf"; */

						DocumentoDTO documentoDTO = new DocumentoDTO();
						String nombreArchivoTpm = multipartFile.getOriginalFilename();
						System.out.println("updload....." + nombreArchivoTpm);

						String[] parts = nombreArchivoTpm.split("¬");
						
						System.out.println("valor1....." + parts[0]);
						//System.out.println("valor2....." + parts[1]);

						nombreArchivoTpm = parts[0]; // nombre original
						documentoDTO.setUbicacionDocumento(nombreArchivoTpm+"/");// ruta del archivo
						nombreArchivoTpm = nombreArchivoTpm.replace("á", "a");
						nombreArchivoTpm = nombreArchivoTpm.replace("é", "e");
						nombreArchivoTpm = nombreArchivoTpm.replace("í", "i");
						nombreArchivoTpm = nombreArchivoTpm.replace("ó", "o");
						nombreArchivoTpm = nombreArchivoTpm.replace("ú", "u");
						nombreArchivoTpm = nombreArchivoTpm.replace("ñ", "n");
						nombreArchivoTpm = nombreArchivoTpm.replace("Á", "A");
						nombreArchivoTpm = nombreArchivoTpm.replace("É", "E");
						nombreArchivoTpm = nombreArchivoTpm.replace("Í", "I");
						nombreArchivoTpm = nombreArchivoTpm.replace("Ó", "O");
						nombreArchivoTpm = nombreArchivoTpm.replace("Ú", "U");
						nombreArchivoTpm = nombreArchivoTpm.replace("Ñ", "N");
						nombreArchivoTpm = nombreArchivoTpm.replace("°", " ");
						documentoDTO.setNombre(nombreArchivoTpm);
						documentoDTO.setFileContent(multipartFile.getBytes());
						documentoDTO.setHabilitado(Constantes.HABILITADO);
						documentoDTO.setTipoDocumentoCodigo(Constantes.TipoDocumento.ADJUNTO);

						System.out.println("110:" + documentoDTO.getCreadoPor());
						System.out.println("120:" + documentoDTO.getEliminadoPor());
						System.out.println("130:" + documentoDTO.getHabilitado());
						System.out.println("140:" + documentoDTO.getMensajeasistente());
						System.out.println("150:" + documentoDTO.getModificadoPor());
						System.out.println("160:" + documentoDTO.getNombre());
						System.out.println("170:" + documentoDTO.getTipoDocumento());
						System.out.println("180:" + documentoDTO.getTipoDocumentoCodigo());
						System.out.println("190:" + documentoDTO.getUuid());
						System.out.println("200:" + documentoDTO.getDocumentoId());
						List<DocumentoDataGridDTO> auxrpta = new ArrayList<>();
						System.out.println("La cantidad de archivo es:::" + auxrpta.size());

						auxReporteResponse = documentoService.save(documentoDTO);
						return auxReporteResponse;
					} else {
						auxReporteResponse = new ReporteResponse();
						auxReporteResponse.setCodmensaje("-123");
						auxReporteResponse.setMensaje("El archivo enviado no es de formato válido");
						return auxReporteResponse;
					}
				}
			}
		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

}
