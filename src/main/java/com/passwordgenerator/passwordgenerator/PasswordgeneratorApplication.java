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

	@GetMapping("/generate/{passwordLenght}")
	public ResponseEntity<String> generatePasswd(@PathVariable Integer passwordLenght) {

		if (passwordLenght < 26) {
			return ResponseEntity.status(HttpStatus.OK).body("Apenas é permitido gerar senhas a partir de 26 caracteres");
		}

		var password = PasswordGenerator.generate(passwordLenght);

		return ResponseEntity.status(HttpStatus.OK).body(password);
	}
}
