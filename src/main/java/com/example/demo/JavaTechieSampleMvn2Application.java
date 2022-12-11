package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTechieSampleMvn2Application {

	private static Logger Log=LoggerFactory.getLogger(JavaTechieSampleMvn2Application.class);
	
	public static void display() {
		System.out.println("syso first application");
		Log.debug("debug My first application");
		Log.info("info My first application");
	}
	public static void main(String[] args) {
		SpringApplication.run(JavaTechieSampleMvn2Application.class, args);
		display();
	}

}
