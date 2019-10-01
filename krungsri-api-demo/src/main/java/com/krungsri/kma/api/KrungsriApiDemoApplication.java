package com.krungsri.kma.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//Disabling the Auto-Configuration
@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.krungsri.kma.api.repository")
@EnableJpaAuditing
@EnableAutoConfiguration(exclude = {
		 ErrorMvcAutoConfiguration.class
		})
public class KrungsriApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KrungsriApiDemoApplication.class, args);
	}

}
