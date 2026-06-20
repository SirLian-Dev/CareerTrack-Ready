package com.careertrack.service;

import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.careertrack.entity.User;
import com.careertrack.repository.UserRepository;
import com.careertrack.dto.UserRegisterRequest;
import com.careertrack.dto.UserResponse;
import com.careertrack.exception.EmailAlreadyExistsException;

@Service
public class UserServiceImpl implements UserService {
//Implementa la interfaz UserService utilizando UserRepository para interactuar con la DB.

    private final UserRepository userRepository;
  //Inyección de Dependencia.
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    
    @Override
    public UserResponse register(UserRegisterRequest request) {
        //Método para registrar un nuevo Usuario. Verifica si el email ya existe, si no, crea un Nuevo.
    	if (userRepository.existsByEmail(request.getEmail())) {//Verifica si el email ya existe en la DB.
            throw new EmailAlreadyExistsException("Email already exists");
        }

        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        User savedUser = userRepository.save(user);
        //Devuelve un DTO con la información del Usuario registrado.
        return UserResponse.builder()
                .id(savedUser.getId())
                .name(savedUser.getName())
                .email(savedUser.getEmail())
                .build();
    }
}