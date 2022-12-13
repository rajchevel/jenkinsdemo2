package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/getstudents")
	public String getStudents() {
		String str;
		str= "My new string";
		return "First student project - getStudents"+str;
	}
}
