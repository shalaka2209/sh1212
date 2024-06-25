package com.example.Jenkinsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class JenkinsprojectApplication {
	@GetMapping("/msg1")
	public String getMessage() {
		return "Hello....";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsprojectApplication.class, args);
	}

}