package com.fitness.userService.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequestDto {

    private String firstname;
    private String lastname;
    @NotBlank(message = "email is required ")
    @Email(message = "invalid email format")
    private String email;
    @NotBlank(message = "Password is required ")
    @Size(min = 6, message = "password must be 6 letter attlist ")
    private String password;
}
