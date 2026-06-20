package com.careertrack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.careertrack.dto.UserRegisterRequest;
import com.careertrack.dto.UserResponse;
import com.careertrack.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;
    //Inyección de dependencia.
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register( @Valid @RequestBody UserRegisterRequest request) {
    	//Método para manejar la solicitud de registro de un nuevo Usuario.
        UserResponse response = userService.register(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}