package com.taskboard.taskboard_backend;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotBlank(message="Email is required")
        @Email(message="Invalid email")
        String email,

        @NotBlank(message ="Enter a password")
        @Size(min=8,max=72,message="message must be within 8 and 72 characters")
        String password,

        @NotBlank(message="Name should not be blank")
        @Size(max=50,message="Name should not exceed 50 characters")
        String displayName

){

}


