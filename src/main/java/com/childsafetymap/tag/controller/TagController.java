package com.childsafetymap.tag.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tag")
public class TagController {

    @GetMapping
    public ResponseEntity<?> getTagMarker() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
