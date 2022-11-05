package pe.gob.oefa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@ComponentScan("pe.gob.oefa")
@SpringBootApplication
public class Application {
 

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		ConfigurableEnvironment environment = new StandardEnvironment();
		for (String string : args) {
			System.out.println(string);
		}
		environment.setActiveProfiles("dev");
		application.setEnvironment(environment);
		application.run(args);
	}
}
