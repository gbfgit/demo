package com.spb.cp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Test01SpringBoot01Application {

	public static void main(String[] args) {
		SpringApplication.run(Test01SpringBoot01Application.class, args);
	}

	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String index()
	{ 
		return "Hello Spring Boot";
	}
}
