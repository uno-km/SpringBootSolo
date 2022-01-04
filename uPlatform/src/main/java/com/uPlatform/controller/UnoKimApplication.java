package com.uPlatform.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class UnoKimApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnoKimApplication.class, args);
	}

}
