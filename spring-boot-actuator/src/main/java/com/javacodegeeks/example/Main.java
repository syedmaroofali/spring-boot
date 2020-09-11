package com.javacodegeeks.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
@SpringBootApplication
public class Main {

      @GetMapping

    public String getstatus() {

        return ("Your App is Up and Running");

    }
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
           

}

