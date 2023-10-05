package com.sanju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
//	@GetMapping("/welcome")
//	public String showHomePage() {
//		return "welcome to welcome page";
//	}

	@RequestMapping("/index")
	public String showHomePage() {
		return "index";
	}

	@RequestMapping("/home")
	public String showHomePage1() {
		return "home";
	}
}