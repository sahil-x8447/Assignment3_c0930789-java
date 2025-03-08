package com.example.demo;

import org.springframework.stereotype.Component;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class PageCounter {
    // Atomic integer for thread-safe page count management
    private final AtomicInteger pageCounter = new AtomicInteger(0);

    // Increment the page counter by 1
    public void increment() {
        pageCounter.incrementAndGet();
    }

    // Return the current page count
    public int getCurrentPageCount() {
        return pageCounter.get();
    }
}
