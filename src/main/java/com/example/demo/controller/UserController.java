package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserEntity request) {

        return ResponseEntity.ok(new UserEntity());
    }
}
