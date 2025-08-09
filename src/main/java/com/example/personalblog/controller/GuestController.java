package com.example.personalblog.controller;

import com.example.personalblog.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestController {
    private ArticleService articleService;

    public GuestController (ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping ("/")
    public String guest (Model model) {
        model.addAttribute ("articles", articleService.getAllArticles ());

        return "index";
    }

    @GetMapping ("/article")
    public String viewArticle (Model model) {
        return "index";
    }
}