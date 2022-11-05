package pe.gob.oefa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@ComponentScan("pe.gob.oefa")
@SpringBootApplication
public class JbossApplication extends SpringBootServletInitializer {

	private static Class<JbossApplication> applicationClass = JbossApplication.class;

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(JbossApplication.class);
		ConfigurableEnvironment environment = new StandardEnvironment();
		for (String string : args) {
			System.out.println(string);
		}
		environment.setActiveProfiles("dev");

		application.setEnvironment(environment);
		application.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

	

}
