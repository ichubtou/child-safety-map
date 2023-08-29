package com.childsafetymap.guardianwards.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guardianwards")
public class GuardianWardsController {

    @GetMapping("/parents/{userId}")
    public ResponseEntity<?> findParents(@PathVariable String userId) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping("/child/{userId}")
    public ResponseEntity<?> findChild(@PathVariable String userId) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
