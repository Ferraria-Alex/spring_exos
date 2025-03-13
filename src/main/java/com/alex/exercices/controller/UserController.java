package com.alex.exercices.controller;

import com.alex.exercices.model.User;
import com.alex.exercices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Iterable<User> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/users/{userId}")
    public Optional<User> getUserById(@PathVariable Long userId) {
        return Optional.ofNullable(userService.findUserById(userId));
    }
}
