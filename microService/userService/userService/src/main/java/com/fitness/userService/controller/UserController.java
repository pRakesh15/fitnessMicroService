package com.fitness.userService.controller;

import com.fitness.userService.DTO.RegisterRequestDto;
import com.fitness.userService.DTO.UserResponceDto;
import com.fitness.userService.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponceDto> getUserProfile(@PathVariable String userId){
        return  ResponseEntity.ok(userService.getUserProfile(userId));
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponceDto> createUser(@Valid @RequestBody RegisterRequestDto registerRequest){
        return ResponseEntity.ok(userService.register(registerRequest));
    }



}
