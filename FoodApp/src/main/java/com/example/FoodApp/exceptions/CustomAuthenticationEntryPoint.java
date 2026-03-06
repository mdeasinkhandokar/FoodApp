package com.example.FoodApp.exceptions;


import com.example.FoodApp.response.Response;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class CustomAuthenticationEntryPoint {


    private final ObjectMapper objectMapper;

    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authenticationException)
        throws IOException, ServletException{
        Response<?> errorResponse =Response.builder()
                .statusCode(HttpStatus.UNAUTHORIZED.value()) //401 error
                .message(authenticationException.getMessage())
                .build();


        response.setContentType("application/json");
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.getWriter().write(objectMapper.writeValueAsString(errorResponse));

    }






}
