package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldProjectApplication.class, args);
		System.out.println("Hello World ");
	}

}
