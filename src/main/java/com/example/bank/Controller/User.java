package com.example.bank.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class User {

    @PostMapping
    public ResponseEntity<String> create() {
        //call service

        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
}

