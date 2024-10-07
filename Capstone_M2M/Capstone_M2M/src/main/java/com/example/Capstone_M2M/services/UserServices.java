package com.example.Capstone_M2M.services;

import com.example.Capstone_M2M.models.User;

import java.util.List;
import java.util.Optional;

public interface UserServices {
    List <User> getAllUsers();
    Optional<User> getUserById(Long id);
    void deleteUserById(Long id);
    Optional<User> saveUser(User newUser);
}
