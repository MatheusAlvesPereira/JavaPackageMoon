package com.MyFirstProject.myprojectweb.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestUser(
        String id,
        @NotNull @NotBlank String username,
        @NotNull @NotBlank String password) {
}
