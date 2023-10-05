package com.sanju.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
//	@GetMapping("/report")
//	private String sendData(Map<String, Object> map) {
//		map.put("name", "sanju");
//		map.put("age", 23);
//		System.out.println("index page loading");
//		return "index";
//	}

	@GetMapping("/report")
	private String sendData(Map<String, Object> map) {
		map.put("favColors", new String[] { "red", "orange", "green" });
		map.put("nickNames", List.of("raja", "sanju", "naaga"));
		map.put("phoneNumbers", Set.of(1234567890l, 9876543210l, 1234987656l));
		map.put("IDDetails", Map.of("aadhaarNo", 1234567890, "voterID", 9876543210l));
		return "report";
	}
}
