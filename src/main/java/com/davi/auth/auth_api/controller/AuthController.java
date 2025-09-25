package com.davi.auth.auth_api.controller;

import com.davi.auth.auth_api.dto.UserRegistrationDTO;
import com.davi.auth.auth_api.entity.User;
import com.davi.auth.auth_api.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")

public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserRegistrationDTO registrationDTO){
        User registeredUser=userService.registerUser(registrationDTO.getUsername(), registrationDTO. getPassword() );
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);    
    }

}
