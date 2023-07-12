package com.MyFirstProject.myprojectweb.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestUser(
        @NotNull @NotBlank String username,
        @NotNull @NotBlank String password) {
}
