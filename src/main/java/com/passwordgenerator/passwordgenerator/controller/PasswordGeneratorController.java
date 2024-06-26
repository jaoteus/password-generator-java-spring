package com.passwordgenerator.passwordgenerator.controller;

import com.passwordgenerator.passwordgenerator.service.PasswordGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/generate")
public class PasswordGeneratorController {

    @Autowired
    private PasswordGeneratorService passwordGeneratorService;

    @GetMapping("/{passwordLength}")
    public ResponseEntity<Map<String, String>> generate(@PathVariable Integer passwordLength) {
        Map<String, String> passwordGeneratedResponse = passwordGeneratorService.generatePasswordResponse(passwordLength);
        return ResponseEntity.status(HttpStatus.OK).body(passwordGeneratedResponse);
    }
}
