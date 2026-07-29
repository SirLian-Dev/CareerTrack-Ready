package com.careertrack.security.authentication;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.careertrack.dto.LoginRequest;
import com.careertrack.dto.LoginResponse;
import com.careertrack.entity.User;
import com.careertrack.exception.InvalidCredentialsException;
import com.careertrack.repository.UserRepository;
import com.careertrack.security.jwt.JwtService;

@Service
public class AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthenticationService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtService jwtService) {
    	//Inyección de Dependencias.
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public LoginResponse login(LoginRequest request) {

        // Busca el usuario por email
        User user = userRepository.findByEmail(request.getEmail()).orElseThrow(() 
        		->new InvalidCredentialsException("Invalid credentials"));

        // Verifica contraseña BCrypt
        if (!passwordEncoder.matches(request.getPassword(),user.getPassword())) {

            throw new InvalidCredentialsException("Invalid credentials");
        }

        // Genera token JWT para posteriormente devolverlo al frontend.
        String token = jwtService.generateToken(user.getEmail());

        return LoginResponse.builder().token(token).build();
    }
}