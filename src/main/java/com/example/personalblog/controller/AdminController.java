package com.example.personalblog.controller;

import com.example.personalblog.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
    private ArticleService articleService;

    public AdminController (ArticleService articleService) {
        this.articleService = articleService;
    }

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
    public String dashboard (Model model) {
        model.addAttribute ("articles", articleService.getAllArticles ());

        return "dashboard";
    }

    @GetMapping("/admin/edit")
    public String edit () {
        return "dashboard";
    }

    @GetMapping("/admin/delete")
    public String delete () {
        return "dashboard";
    }
}
