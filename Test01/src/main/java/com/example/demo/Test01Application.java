package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test01Application {

	public static void main(String[] args) {
		SpringApplication.run(Test01Application.class, args);
		System.out.println("P1");
		System.out.println("creada rama1");
		System.out.println("modificacion rama1");
	}

}
