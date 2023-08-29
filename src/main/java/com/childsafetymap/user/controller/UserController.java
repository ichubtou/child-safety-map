package com.childsafetymap.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping
    public ResponseEntity<?> createUser() {
        return ResponseEntity.created(null).build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUser(@PathVariable String userId) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PatchMapping("/update")
    public ResponseEntity<?> updateUser() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PatchMapping("/update/image")
    public ResponseEntity<?> updateUserProfileImage() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PatchMapping("/update/password")
    public ResponseEntity<?> updateUserPassword() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable String userId) {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/image")
    public ResponseEntity<?> deleteImage()   {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
