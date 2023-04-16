package com.NIMI505;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Nimi505Application {

	public static void main(String[] args) {
		SpringApplication.run(Nimi505Application.class, args);
	}

}
