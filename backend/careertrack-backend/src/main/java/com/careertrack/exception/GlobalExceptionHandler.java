package com.careertrack.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
//Controlador de excepciones global para manejar errores comunes en la aplicación.
	
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse>
    handleResourceNotFound(ResourceNotFoundException ex) {
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
    public ResponseEntity<ErrorResponse>
    handleEmailAlreadyExists(EmailAlreadyExistsException ex) {
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

}