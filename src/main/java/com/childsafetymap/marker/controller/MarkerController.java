package com.childsafetymap.marker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/marker")
public class MarkerController {

    @PostMapping
    public ResponseEntity<?> createMarker() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping("/{markerId}")
    public ResponseEntity<?> getMarker(@PathVariable String markerId) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getMarkers() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<?> updateMarkers() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteMarker() {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getUserMarkers(@PathVariable String userId) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
