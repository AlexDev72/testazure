package com.example.SiteC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SiteCApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiteCApplication.class, args);
	}
	@GetMapping("/")
	public String message() {
		return "Bonjour";
	}
}
