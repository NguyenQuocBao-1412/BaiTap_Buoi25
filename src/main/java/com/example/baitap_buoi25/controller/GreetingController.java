package com.example.baitap_buoi25.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting() {
        return "greeting";
    }

    @PostMapping("/welcome")
    public String welcome(@RequestParam String name, Model model) {
        System.out.println("Kiem tra " + name);
        model.addAttribute("name", name);
        return "welcome";
    }
}
