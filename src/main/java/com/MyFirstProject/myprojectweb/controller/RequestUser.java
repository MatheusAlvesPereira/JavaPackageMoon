package com.MyFirstProject.myprojectweb.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestUser(
        Long id,
        String username,
        String password){
}
