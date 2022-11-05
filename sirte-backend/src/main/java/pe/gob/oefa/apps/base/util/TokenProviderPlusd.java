package pe.gob.oefa.apps.base.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class TokenProviderPlusd {
	
	public static final String SECRET_KEY_PLUSD= "D8ZSZZweMNtziAnxivJQqmDSdQttEdXY91KFiCBLh0JvNw==";
	public static final long TOKEN_EXPIRATION_TIME = 86_400_000; // 1 día
	
	public static void main(String[] args) {

	}

	
	public static Claims obtenerTodosLosClaimsDelToken(String token) {
        Claims claims;
        byte[] signingKey = null;
        	signingKey = SECRET_KEY_PLUSD.getBytes();
        try {
            claims = Jwts.parser()
                    .setSigningKey(signingKey)
                    .parseClaimsJws(token)
                    .getBody();
            
            System.out.println(claims);
        } catch (Exception e) {
            claims = null;
            e.printStackTrace();
        }
        return claims;
    }
	
}
