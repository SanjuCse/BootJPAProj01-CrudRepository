package com.sanju.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowHomeController {
	@GetMapping("/welcome")
	public String showHomePage() {
		return "welcome to welcome page";
	}

	@GetMapping("/")
	public String showHomePage1() {
		return "welcome";
	}

	@RequestMapping("/mvc")
	public String display() {
		return "home";
	}
}