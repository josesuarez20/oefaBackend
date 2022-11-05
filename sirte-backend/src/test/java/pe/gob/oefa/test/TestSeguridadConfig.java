package pe.gob.oefa.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
		"pe.gob.oefa.ws.seguridad.service",
		})
public class TestSeguridadConfig extends DataSourceConfig{
	
	
   
}
