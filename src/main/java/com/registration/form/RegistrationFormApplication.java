package com.registration.form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.registration")
public class RegistrationFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationFormApplication.class, args);
	}

}
