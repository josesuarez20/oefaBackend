package pe.gob.oefa.sirte.controler;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.oefa.dto.security.DashboardResponse;
import pe.gob.oefa.seguridad.util.UtilEncrypt;
import pe.gob.oefa.sirte.facade.HomeFacade;
import pe.gob.oefa.sirte.service.HomeService;

@RestController
@RequestMapping("/business/home")
public class HomeController {

	@Value("${encrypt.key}")
	private String key;

	@Value("${Token_REST:#{null}}")
	private String tokenSession;

	@Value("${Token_REST2}")
	private String tokenSession2;

	@Autowired
	private HomeFacade homeFacade;

	@Autowired
	private HomeService homeService;

	@CrossOrigin("*")
	@GetMapping("/dashboard")
	public ResponseEntity<DashboardResponse> getDashboard() {
		DashboardResponse dashboardResponse = homeFacade.getHomeDashboard();
		return new ResponseEntity<>(dashboardResponse, HttpStatus.OK);
	}

	@CrossOrigin("*")
	@GetMapping("/header")
	public ResponseEntity<DashboardResponse> getHeader() {
		DashboardResponse dashboardResponse = homeFacade.getHeader();
		return new ResponseEntity<>(dashboardResponse, HttpStatus.OK);
	}

	@CrossOrigin("*")
	@GetMapping("/dashboardsso2/{parametro}")
	public ResponseEntity<DashboardResponse> getDashboardsso2(@PathVariable String parametro, HttpSession session)
			throws Exception {

		UtilEncrypt.init(key);
		parametro = parametro.replace("_", "/").replace("_", "/").replace("%2F", "/").replace("%20", "+").replace("%3D",
				"=");
		String PK_eIdUsuarioDecrypt = UtilEncrypt.decrypt(parametro);

		System.out.println("tokenSession " + tokenSession2);

		DashboardResponse dashboardResponse = homeService.getDashboardSSO2(PK_eIdUsuarioDecrypt, tokenSession2);
		return new ResponseEntity<>(dashboardResponse, HttpStatus.OK);
	}
}
