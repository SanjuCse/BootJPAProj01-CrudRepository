package com.sanju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/ops")
public class RenderingController {

	@RequestMapping("/report")
	public String showReport() throws Exception {
		return "show_report";
	}

	@RequestMapping({ "/report1", "/report2", "/report3" })
	public String showReport1() throws Exception {
		return "show_report";
	}

	@RequestMapping("/REPORT")
	public String showReport2() throws Exception {
		return "show_report1";
	}

//	@RequestMapping
//	public String showIndexPage() {
//		return "index";
//	}
//	--------------OR----------------

//	@RequestMapping("/")
//	private String showIndexPage1() {
//		return "welcome";
//	}

//	---------------------------------------------
	@GetMapping("report4")
	private String showReport3() {
		return "show_report";
	}

	@PostMapping("report4")
	private String showReport4() {
		return "show_report1";
	}

	@PatchMapping("report4")
	private String showReport5() {
		return "show_report1";
	}

//	---------------------------------------------
	@GetMapping("/")
	private String showIndexPage1() {
		return "welcome";
	}

	@PostMapping("/")
	private String showIndexPage2() {
		return "welcome";
	}

	@PatchMapping("/")
	private String showIndexPage3() {
		return "welcome";
	}

//	---------------------------------------------
	@GetMapping("/forward")
	private String showIndexPageViaRedirection() {
		return "forward:/";
	}
}
