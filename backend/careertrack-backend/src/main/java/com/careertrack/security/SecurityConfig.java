package com.careertrack.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	// Configuración de seguridad temporal de prueba.
    @Bean
    SecurityFilterChain securityFilterChain(
            HttpSecurity http) throws Exception {http
    	
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                    .anyRequest().permitAll());
            //Todas las rutas son permitidas.
        return http.build();
    }
}