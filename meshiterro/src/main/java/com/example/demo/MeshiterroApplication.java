package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MeshiterroApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeshiterroApplication.class, args);
	}

	@RestController
	public class HelloController {
		@RequestMapping("/")
		public String index() {
			return "Hello World! Spring boot.";
		}
	}
}
