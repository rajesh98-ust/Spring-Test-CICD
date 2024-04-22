package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringTestCiApplication {
	
	@RequestMapping("/welcome")
	public String show() {
		
		return "welcome to the spring CICD git pipeline";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTestCiApplication.class, args);
	}

}
