package com.example.HomeWorkForSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class HomeWorkForSpringApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(HomeWorkForSpringApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "9281"));
		app.run(args); }

}
