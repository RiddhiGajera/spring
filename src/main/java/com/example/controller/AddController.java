package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddController {

	@GetMapping("/add")
	public String add(){
		System.out.println("In add...");
		return "Test";
	}
}
