package com.example.demo.controller;

import com.example.demo.PageCounter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    private final PageCounter pageCounter;

    // Inject PageCounter dependency via constructor
    public WelcomeController(PageCounter pageCounter) {
        this.pageCounter = pageCounter;
    }

    // Handle GET requests for root URL "/"
    @GetMapping("/")
    public String welcome(Model model) {
        // Increment the page view count each time the page is accessed
        pageCounter.increment();

        // Add the current page count to the model to display in the view
        model.addAttribute("pageCount", pageCounter.getCurrentPageCount());

        // Return the welcome template to be rendered
        return "welcome";
    }
}
