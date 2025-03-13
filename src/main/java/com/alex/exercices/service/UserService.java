package com.alex.exercices.service;

import com.alex.exercices.model.User;
import com.alex.exercices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public Iterable<User> findAll() {
        if(userRepo.count() == 0){
            return null;
        }
        return userRepo.findAll();
    }

    public User findUserById(Long userId) {
        return userRepo.findById(userId).orElse(null);
    }
}
