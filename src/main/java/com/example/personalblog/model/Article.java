package com.example.personalblog.model;

import jakarta.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Article {
    private String title;
    private LocalDate date;
    private String content;

    public Article (String title, LocalDate date, String content) {
        this.title = title;
        this.date = date;
        this.content = content;
    }

    public void setTitle (String title) {
        this.title = title;
    }
    public void setDate (LocalDate date) {
        this.date = date;
    }
    public void setContent (String content) {
        this.content = content;
    }

    public String getTitle () {
        return this.title;
    }
    public LocalDate getDate () {
        return this.date;
    }
    public String getContent () {
        return this.content;
    }
}