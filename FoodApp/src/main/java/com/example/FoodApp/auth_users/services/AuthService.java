package com.example.FoodApp.auth_users.services;

import com.example.FoodApp.auth_users.dtos.LoginRequest;
import com.example.FoodApp.auth_users.dtos.LoginResponse;
import com.example.FoodApp.auth_users.dtos.RegistrationRequest;
import com.example.FoodApp.response.Response;
import jakarta.validation.Valid;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    @Nullable Response<?> register(@Valid RegistrationRequest registrationRequest);

    @Nullable Response<LoginResponse> login(@Valid LoginRequest loginRequest);
}
