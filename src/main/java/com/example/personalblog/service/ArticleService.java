package com.example.personalblog.service;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ArticleService {
    private Path fileDirectory;

    public ArticleService () {
        this.fileDirectory = Paths.get ("articles");
    }
}
