package com.example.Capstone_M2M.controllers;

import com.example.Capstone_M2M.models.User;
import com.example.Capstone_M2M.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/user")
public class UserController {
    @Autowired
    public UserServices userServices;


    @PostMapping
    public Optional<User> saveUser(@RequestBody User newUser) {
        return userServices.saveUser(newUser);
    }

//    @PutMapping ("/{id}")
//   public User updateUser(@PathVariable Long id, @RequestBody User usersNewInfo) {
//     Optional<User> usersOldInfo = userServices.getUserById(id);
//
//     if (usersOldInfo.isPresent()) {
//         User convertToUser = usersOldInfo.get();
//         convertToUser.setName(usersNewInfo.getName());
//
//     }
    //}

    @GetMapping ("/users")
    public List<User> getUser() {
        return userServices.getAllUsers();
    }

    @GetMapping ("/{id}")
    public Optional<User> getUserById(Long id){
        return userServices.getUserById(id);
    }


//    @PostMapping
//    public void loginUser (@RequestBody String email, @RequestBody String password){
//        System.out.println("login ran");
//
//
//    }
}


