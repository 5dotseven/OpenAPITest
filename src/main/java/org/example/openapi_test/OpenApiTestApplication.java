package org.example.openapi_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenApiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenApiTestApplication.class, args);
	}

}
