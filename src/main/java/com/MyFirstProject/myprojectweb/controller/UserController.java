package com.MyFirstProject.myprojectweb.controller;

import com.MyFirstProject.myprojectweb.model.User;
import com.MyFirstProject.myprojectweb.model.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity getAllUser(){
        var allUser = userRepository.findAll();
        return ResponseEntity.ok(allUser);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity registerUser(@RequestBody @Valid RequestUser data){
        User newUser = new User(data);
        userRepository.save(newUser);
        return ResponseEntity.ok().build();
    }
}
