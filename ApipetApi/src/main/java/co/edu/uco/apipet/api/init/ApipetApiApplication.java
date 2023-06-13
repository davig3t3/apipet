package co.edu.uco.apipet.api.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.uco.apipet"})
@EnableJpaRepositories(basePackages = {"co.edu.uco.apipet"})
@EntityScan(basePackages = {"co.edu.uco.apipet"})
public class ApipetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApipetApiApplication.class, args);
	}

}
