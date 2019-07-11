package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication1 {

	public static void main(String[] args) {
		System.out.printf("1");
		System.out.printf("2");
		SpringApplication.run(DemoApplication1.class, args);
	}
}
