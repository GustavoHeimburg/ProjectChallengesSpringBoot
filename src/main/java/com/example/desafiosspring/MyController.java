package com.example.desafiosspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/index")
    public String hello(Model model) {
        model.addAttribute("message", "Hello from Spring Boot!");
        return "index";
    }
}

//test aplication html / spring
