package com.siva.externalRestApiIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExternalRestApiIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalRestApiIntegrationApplication.class, args);
	}

}
