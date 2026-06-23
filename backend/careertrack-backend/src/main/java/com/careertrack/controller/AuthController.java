package com.careertrack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.careertrack.dto.UserRegisterRequest;
import com.careertrack.dto.UserResponse;
import com.careertrack.service.UserService;
import com.careertrack.dto.LoginRequest;
import com.careertrack.dto.LoginResponse;
import com.careertrack.security.authentication.AuthenticationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;
    private final AuthenticationService authenticationService;
    //Inyección de dependencia.
    public AuthController(UserService userService, AuthenticationService authenticationService) {
        this.userService = userService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register( @Valid @RequestBody UserRegisterRequest request) {
    	//Método para manejar la solicitud de registro de un nuevo Usuario.
        UserResponse response = userService.register(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
    
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login( @Valid @RequestBody LoginRequest request) {
    	// Método para manejar la solicitud de inicio de sesión de un Usuario.
        return ResponseEntity.ok(authenticationService.login(request));
    }
}