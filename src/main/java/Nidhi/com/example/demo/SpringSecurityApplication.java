package Nidhi.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*@SpringBootApplication(scanBasePackages = "config") 
@ComponentScan(basePackages = { "controller","config","model","repository","service"})
@EnableJpaRepositories(basePackages = "repository")
@EntityScan(basePackages = "model")
*/

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
