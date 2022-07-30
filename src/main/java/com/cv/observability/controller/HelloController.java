package com.cv.observability.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotBlank;

@RequestMapping("/hello")
@Validated
public interface HelloController {

    @GetMapping
    ResponseEntity<String> sayHello(@RequestParam("name") @NotBlank String name);
}
