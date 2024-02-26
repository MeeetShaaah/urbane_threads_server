package com.shreyraj.urbane_threads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title="Ecommerce Project Api With Springboot",
		description="Welcome to the documentation for the eCommerce Project API! This API provides a set of endpoints and functionalities to interact with our eCommerce platform programmatically. With this API, you can build applications, integrations, and automate various tasks related to our online store.",
		version="v1",
		license=@License(
				name="© Code With ShreyRaj"
				)
		))
public class UrbaneThreadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrbaneThreadsApplication.class, args);
	}

}
