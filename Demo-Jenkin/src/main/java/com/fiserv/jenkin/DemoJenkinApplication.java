package com.fiserv.jenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinApplication.class, args);
		System.out.println("Welcome");
	}

}
