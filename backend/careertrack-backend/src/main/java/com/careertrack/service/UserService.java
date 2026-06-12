package com.careertrack.service;

import java.util.List;
import java.util.Optional;

import com.careertrack.dto.UserRegisterRequest;
import com.careertrack.dto.UserResponse;
import com.careertrack.entity.User;

public interface UserService {

    User saveUser(User user);
    
    UserResponse register(UserRegisterRequest request);

    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);

    List<User> findAllUsers();

    boolean existsByEmail(String email);

    void deleteUser(Long id);

}