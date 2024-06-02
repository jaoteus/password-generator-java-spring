package com.passwordgenerator.passwordgenerator.service;

import com.passwordgenerator.passwordgenerator.utils.PasswordGenerator;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PasswordGeneratorService {

    public Map<String, String> generatePasswordResponse (Integer passwordLenght) {
        if (passwordLenght < 26) {
            throw new RuntimeException("Apenas é permitido gerar senhas a partir de 26 caracteres");
        }
        Map<String, String> passwordGeneratedResponse = new HashMap<String, String>();
        passwordGeneratedResponse.put("passwordGenerated", PasswordGenerator.generate(passwordLenght));
        return passwordGeneratedResponse;
    }
}
