package com.bilgeadam.commentapp.java4.controller;

import com.bilgeadam.commentapp.java4.repository.entity.User;
import com.bilgeadam.commentapp.java4.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @GetMapping("/orderbyname")
    public ResponseEntity<List<User>> getUsersByName() {


        return ResponseEntity.ok(userService.findByOrderByName());

    }

    @GetMapping("/containsvalue")
    public ResponseEntity<List<User>> findAllByNameContains(String value) {
        return ResponseEntity.ok(userService.findAllByNameContains(value).get());
    }

    @GetMapping("/containsemail")
    public ResponseEntity<List<User>> findAllByEmailContains(String value) {
        return ResponseEntity.ok(userService.findAllByEmailContains(value).get());

    }

    @GetMapping("/endingemail")
    public ResponseEntity<List<User>> findAllByNameEnding(String value) {
        return ResponseEntity.ok(userService.findAllByEmailEnding(value).get());

    }

    @GetMapping("/login")
    public ResponseEntity<User> login(String email, String password) {
        return ResponseEntity.ok(userService.login(email, password).get());
    }

    @GetMapping("/controlpassword")
    public ResponseEntity<List<User>> controlPassword(int length) {
        return ResponseEntity.ok(userService.passwordControl(length));
    }

    @GetMapping("/controlpassword2")
    public ResponseEntity<List<User>> controlPassword2(int length) {
        return ResponseEntity.ok(userService.passwordControl2(length));
    }

}