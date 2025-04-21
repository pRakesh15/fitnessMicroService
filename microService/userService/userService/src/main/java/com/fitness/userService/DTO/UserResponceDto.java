package com.fitness.userService.DTO;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResponceDto {
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
