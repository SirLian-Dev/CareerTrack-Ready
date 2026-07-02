package com.careertrack.exception;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
//JSON que recibirá el cliente en caso de error
    private LocalDateTime timestamp;
    private int status;
    private String message;

}