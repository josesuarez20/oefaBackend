package pe.gob.oefa.sirte.controler;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.oefa.model.json.LoginRequest;

@RestController
@RequestMapping("/security/login")	
public class LoginController {
 
	
	@CrossOrigin("*")
	@PostMapping("/sing-up")
	public ResponseEntity<Void> find(@RequestBody LoginRequest request){
		URI uri = null;
		try {
			uri = new URI("/");
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	    return ResponseEntity.status(HttpStatus.FOUND).location(uri).build();
	}
}
