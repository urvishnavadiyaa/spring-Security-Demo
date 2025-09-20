package com.example.springsecurity.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "welcome in spring security  " + request.getSession().getId();
    }
}
