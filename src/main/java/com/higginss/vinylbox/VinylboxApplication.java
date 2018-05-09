package com.higginss.vinylbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VinylboxApplication {

    public static void main(String[] args) {
        System.out.println("Running main...");
        SpringApplication.run(VinylboxApplication.class, args);
    }
}
