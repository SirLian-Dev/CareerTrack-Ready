package com.careertrack.exception;

public class ResourceNotFoundException extends RuntimeException {
//Excepción que no se encuentra un recurso en la base de datos.
    public ResourceNotFoundException(String message) {
        super(message);
    }

}