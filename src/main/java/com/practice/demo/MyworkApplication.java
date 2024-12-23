package com.practice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@SpringBootApplication

@ComponentScan({ "com.practice.service", "com.practice.demo.config", 
	    "com.practice.demo.controller",
		"com.practice.demo.repository",
		"com.practice.demo.pojo"})
public class MyworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyworkApplication.class, args);

	}

}
