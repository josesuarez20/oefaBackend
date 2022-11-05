package pe.gob.oefa.core.context;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import pe.gob.oefa.core.security.filter.JWTAuthenticationFilter;
import pe.gob.oefa.core.security.filter.JWTAuthorizationFilter;
import pe.gob.oefa.core.security.util.SecurityUtil;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// http.headers().cacheControl();
		http.authorizeRequests().antMatchers("/**").permitAll();
		http.csrf().disable();

		// http.authorizeRequests()
		// .antMatchers(SecurityUtil.URL_BASE, SecurityUtil.SIGN_UP_URL,
		// SecurityUtil.SSO_URL,SecurityUtil.DOCUMENTO_LINEAMIENTOS,
		// SecurityUtil.VERSION_TABLET_INIT, SecurityUtil.VERSION_TABLET_FIND,
		// SecurityUtil.VERSION_REGISTRO_TIPO_PERSONA,
		// SecurityUtil.VERSION_REGISTRO_TIPO_DOCUMENTO_PERSONA,
		// SecurityUtil.VERSION_REGISTRO_PERSONA_SSO_DNI,
		// SecurityUtil.VERSION_REGISTRO_OBTENER_USUARIO,
		// SecurityUtil.VERSION_REGISTRO_ASEGURA_USUARIO,
		// SecurityUtil.VERSION_REGISTRO_PERSONA_SSO_CE,
		// SecurityUtil.VERSION_REGISTRO_JURIDICAS_SSO_RUC,
		// SecurityUtil.VERSION_SAVE_VERIFICAR_PERSONA_SSO_DNI,
		// SecurityUtil.VERSION_SAVE_REGISTRO_PERSONA_SSO_DNI,
		// SecurityUtil.VERSION_TABLET_SALA_UBICACION, SecurityUtil.SUBIR_DOCUMENTOS,
		// SecurityUtil.DESCARGAR_DOCUMENTOS_SIGA,
		// SecurityUtil.DESCARGAR_DOCUMENTOS_SIGED,
		// SecurityUtil.DESCARGAR_DOCUMENTOS,
		// SecurityUtil.SOLICITUD_LISTA_FILTRO_EXT,
		// SecurityUtil.SOLICITUD_INIT_ESTADO_EXT)
		// .permitAll().anyRequest().authenticated().and().csrf().disable();
		//
		// http.addFilterBefore(new JWTAuthenticationFilter(SecurityUtil.SIGN_UP_URL,
		// authenticationManager()),
		// UsernamePasswordAuthenticationFilter.class);
		http.addFilter(new JWTAuthorizationFilter(authenticationManager()));
		http.cors();
		
	}
}
