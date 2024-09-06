package com.example.simple_http_service.controller;

import com.example.simple_http_service.dto.StartResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class SimpleHttpController {
    @GetMapping(value = "/start", produces = "application/json")
    public ResponseEntity<StartResponse>  getTest(){
        log.info("I was here");
        StartResponse startResponse = StartResponse.builder().message("Hi this is a task").build();
        return ResponseEntity.ok(startResponse);
    }

    @PostMapping("/processNumbers")
    public int processNumbers(@RequestBody List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}
