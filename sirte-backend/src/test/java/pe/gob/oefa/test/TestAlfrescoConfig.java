package pe.gob.oefa.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
		"pe.gob.oefa.ws",
		})
public class TestAlfrescoConfig extends DataSourceConfig{
	
	 
	
   
}
