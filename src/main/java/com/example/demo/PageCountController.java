package com.example.demo.controller;

import com.example.demo.PageCounter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PageCountController {

    private final PageCounter pageCounter;

    // Inject PageCounter dependency via constructor
    public PageCountController(PageCounter pageCounter) {
        this.pageCounter = pageCounter;
    }

    // Provide a REST endpoint to fetch the current page count
    @GetMapping("/currentcount")
    public int getCurrentPageCount() {
        // Return the current page count as an integer
        return pageCounter.getCurrentPageCount();
    }
}
