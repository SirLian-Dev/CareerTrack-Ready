package com.careertrack.security;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.careertrack.repository.UserRepository;

@Service
public class CustomUserDetailsService
        implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
    	//Inyección de Dependencia.
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email)throws UsernameNotFoundException {

        // Spring Security utilizará el email para buscar usuarios
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
