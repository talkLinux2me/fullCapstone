package com.example.Capstone_M2M.services;

import com.example.Capstone_M2M.models.User;
import com.example.Capstone_M2M.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServicesImplements implements UserServices {

    private final UserRepository userRepository;


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public Optional<User> saveUser(User newUser) {
        return Optional.of(userRepository.save(newUser));
    }

}
