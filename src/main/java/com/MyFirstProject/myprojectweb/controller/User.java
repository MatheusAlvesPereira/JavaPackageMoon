package com.MyFirstProject.myprojectweb.controller;

import com.MyFirstProject.myprojectweb.model.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class User {
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
        System.out.println(data);
        return ResponseEntity.ok().build();
    }
}
