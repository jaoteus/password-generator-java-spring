package com.passwordgenerator.passwordgenerator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<?> methodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e) {
        Map<String, String> errorMessage = new HashMap<>();
        errorMessage.put("message", e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<?> runtimeException(RuntimeException e) {
        Map<String, String> errorMessage = new HashMap<>();
//        errorMessage.put("message", e.getMessage());
//        ResponseEntity<String> errorMessage = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        errorMessage.put("message", e.getMessage());
    return new ResponseEntity<Map<String, String>>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}
