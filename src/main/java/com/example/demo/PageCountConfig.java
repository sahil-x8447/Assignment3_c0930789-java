package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageCountConfig {

    // Create and expose PageCounter as a Spring Bean
    @Bean
    public PageCounter pageCounter() {
        return new PageCounter();  // This will be injected wherever needed
    }
}
