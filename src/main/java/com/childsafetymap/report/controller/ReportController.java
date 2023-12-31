package com.childsafetymap.report.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    @PostMapping("/{markerId}")
    public ResponseEntity<?> createReport(@PathVariable String markerId) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
