package com.MyFirstProject.myprojectweb.Controller;

import com.MyFirstProject.myprojectweb.Model.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class User {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public ResponseEntity getAllUser(){
        var allUser = userRepository.findAll();
        return ResponseEntity.ok(allUser);
    }

    @PostMapping
    public ResponseEntity registerUser(@RequestBody @Valid RequestUser data){
        System.out.println(data);
        return ResponseEntity.ok().build();
    }
}
