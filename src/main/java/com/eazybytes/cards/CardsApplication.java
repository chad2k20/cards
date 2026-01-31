package com.eazybytes.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.chadtech.cards.controller") })
@EnableJpaRepositories("com.chadtech.cards.repository")
@EntityScan("com.chadtech.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "MyBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Chandu Korada",
						email = "korada@chadtech.com",
						url = "https://www.chadtech.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.chadtech.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "MyBank Cards microservice REST API Documentation",
				url = "https://www.chadtech.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
