package com.passwordgenerator.passwordgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.passwordgenerator.passwordgenerator.utils.PasswordGenerator;

@RestController
@SpringBootApplication
public class PasswordgeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordgeneratorApplication.class, args);
	}
}
