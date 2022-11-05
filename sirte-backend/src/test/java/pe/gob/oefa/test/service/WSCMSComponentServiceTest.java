package pe.gob.oefa.test.service;

import java.io.File;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.gob.oefa.test.TestAlfrescoConfig;
import pe.gob.oefa.util.GenericUtil;
import pe.gob.oefa.ws.ContenidoECMBean;
import pe.gob.oefa.ws.RptaWsBean;
import pe.gob.oefa.ws.WSCMSComponentService;
import pe.gob.oefa.ws.WsCmsCliente;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestAlfrescoConfig.class)
public class WSCMSComponentServiceTest {

	@Autowired
	private WSCMSComponentService wscmsComponentService;
	
	
	@Test
	public void leerDocumento() {
		try {
			ContenidoECMBean contenidoECMBean= WsCmsCliente.leerDocumento("8259813f-683e-4621-b072-8a05eef08f4c");
			System.out.println(contenidoECMBean.getNombreArchivo());
		} catch (RemoteException | ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	
//	@Test
//	public void registrarDocumento() {
//		try {  
//			RptaWsBean contenidoECMBean= WsCmsCliente.registrarDocumento("acta_template.docx", "SRSALAS", GenericUtil.readFile(new File("D:/DOCUMENTOS/DEMO.DOCX")));
//			System.out.println(contenidoECMBean.getCadMsg());
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
	@Test
	public void registrarDocumento() {
		try {  
			RptaWsBean contenidoECMBean= wscmsComponentService.registrarDocumento("DEMO_DOCUMENT_SR.docx", "SRSALAS", GenericUtil.readFile(new File("D:/DOCUMENTOS/DEMO.DOCX")));
			System.out.println(contenidoECMBean.getCadMsg());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	 
	 
}
