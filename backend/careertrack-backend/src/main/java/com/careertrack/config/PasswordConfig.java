package com.careertrack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {
  
    @Bean
    PasswordEncoder passwordEncoder() { 
    //Bean reutilizable para cifrar contraseñas
        return new BCryptPasswordEncoder();
    }
}