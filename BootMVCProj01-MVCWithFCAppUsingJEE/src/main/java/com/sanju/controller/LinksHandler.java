package com.sanju.controller;

import java.util.Set;

import com.sanju.service.ILinksService;
import com.sanju.service.LinksServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

public class LinksHandler {
	private ILinksService service;

	public LinksHandler() {
		service = new LinksServiceImpl();
	}

	public String showWishMessage(HttpServletRequest request) {
		String msg = service.generateWishMessages();
		request.setAttribute("wmsg", msg);
		return "wish_result";
	}

	public String showAllLangs(HttpServletRequest request) {
		Set<String> langs = service.fetchAllLanguages();
		request.setAttribute("langInfo", langs);
		return "all_langs";
	}

}
