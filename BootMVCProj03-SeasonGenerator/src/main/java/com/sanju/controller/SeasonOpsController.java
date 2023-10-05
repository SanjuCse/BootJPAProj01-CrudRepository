package com.sanju.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanju.service.ISeasonFinderService;

@Controller
public class SeasonOpsController {
	@Autowired
	private ISeasonFinderService service;

	@RequestMapping("/")
	public String showHome() {
		return "home";
	}

	@RequestMapping("/season")
	public String showSeason(Map<String, Object> map) {
		String msg = service.findSeason();
		map.put("resultMsg", msg);
		return "display";
	}
}
