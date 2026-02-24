package com.example.FoodApp.auth_users.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class LoginRequest {

    @NotBlank(message="Email is required")
    @Email(message="Invalid email format")
    private String email;

    private String password;

}
