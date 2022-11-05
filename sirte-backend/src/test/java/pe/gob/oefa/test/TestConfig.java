package pe.gob.oefa.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
@ComponentScan(basePackages = {
		"pe.gob.oefa.srsalas.*"
		})
@MapperScan("pe.gob.oefa.core.dao")
public class TestConfig extends DataSourceConfig{
	
	
   
}
