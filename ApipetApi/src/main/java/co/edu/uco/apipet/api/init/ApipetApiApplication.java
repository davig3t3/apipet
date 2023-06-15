package co.edu.uco.apipet.api.init;

//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.azure.security.keyvault.secrets.models.KeyVaultSecret;

//import co.edu.uco.apipet.api.keyvault.KeyVaultAutoconfiguredClient;
//import co.edu.uco.apipet.api.keyvault.KeyVaultClient;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.uco.apipet"})
@EnableJpaRepositories(basePackages = {"co.edu.uco.apipet"})
@EntityScan(basePackages = {"co.edu.uco.apipet"})
public class ApipetApiApplication {

	/*@Value("${database.secret.value}")
    private String mySecret;

    private final KeyVaultClient keyVaultClient;

    public ApipetApiApplication(@Qualifier(value = "KeyVaultAutoconfiguredClient") KeyVaultAutoconfiguredClient keyVaultAutoconfiguredClient) {
        this.keyVaultClient = keyVaultAutoconfiguredClient;
    }*/
    
	public static void main(String[] args) {
		SpringApplication.run(ApipetApiApplication.class, args);
	}

	/*@Override
    public void run(String... args) throws Exception {
        KeyVaultSecret keyVaultSecret = keyVaultClient.getSecret("my-secret");
        System.out.println("Hey, our secret is here ->" + keyVaultSecret.getValue());
        System.out.println("Hey, our secret is here from application properties file ->" + mySecret);
    }*/

}
