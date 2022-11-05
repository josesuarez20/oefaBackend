package pe.gob.oefa.sirte.service;

import pe.gob.oefa.core.authentication.session.UserSession;
import pe.gob.oefa.model.json.LoginRequest;
import pe.gob.oefa.model.json.LoginResponse;

public interface LoginService {

	UserSession validateRequest(String codigo, String state) throws RuntimeException;

	LoginResponse login(LoginRequest request);

}
