package com.careertrack.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;

@RestControllerAdvice
public class GlobalExceptionHandler {
//Controlador de excepciones global para manejar los errores de la aplicación.
	
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse>handleResourceNotFound(ResourceNotFoundException ex){
    	//Metodo para excepción de recurso no encontrado que construye una respuesta de error con detalles.
        ErrorResponse response = ErrorResponse.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.NOT_FOUND.value())
                        .message(ex.getMessage())
                        .build();

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }

    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse>handleEmailAlreadyExists(EmailAlreadyExistsException ex){
    	//Metodo para excepción de email ya existente que construye una respuesta de error con detalles.
        ErrorResponse response = ErrorResponse.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.CONFLICT.value())
                        .message(ex.getMessage())
                        .build();

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(response);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationErrors(MethodArgumentNotValidException ex){
    	//Método que captura errores de validación de DTOs.
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult()
                .getFieldErrors()
                .forEach(error ->
                        errors.put(
                                error.getField(),
                                error.getDefaultMessage()));

        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(InvalidCredentialsException.class)
    public ResponseEntity<ErrorResponse>handleInvalidCredentials(InvalidCredentialsException ex){
    	//Método para excepción de credenciales inválidas.
        ErrorResponse response = ErrorResponse.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.UNAUTHORIZED.value())
                        .message(ex.getMessage())
                        .build();

        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(response);
    }
    
}