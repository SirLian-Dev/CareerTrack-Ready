package com.careertrack.exception;

public class EmailAlreadyExistsException extends RuntimeException {
//Excepción que indica que el correo electrónico ya existe en la base de datos
    public EmailAlreadyExistsException(String message) {
        super(message);
    }

}