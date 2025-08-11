package com.example.personalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String admin () {
        return "admin";
    }

    @PostMapping("/admin/login")
    public String login (@RequestParam String username, @RequestParam String password, Model model) {
        if (username.equals ("admin") && password.equals ("admin123")) {
            return "redirect:/admin/dashboard";
        } else {
            model.addAttribute ("error", "Incorrect username or password");
            return "admin";
        }
    }

    @GetMapping("/admin/dashboard")
    public String dashboard () {
        return "dashboard";
    }
}
