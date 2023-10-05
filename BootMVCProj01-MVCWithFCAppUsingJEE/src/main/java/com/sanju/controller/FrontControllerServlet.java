package com.sanju.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class FrontControllerServlet extends HttpServlet {
	private LinksHandler handler;

	@Override
	public void init() throws ServletException {
		handler = new LinksHandler();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FrontControllerServlet.doGet():: " + req.getServletPath());
		String lvn = null;
		if (req.getServletPath().equalsIgnoreCase("/wish")) {
			lvn = handler.showWishMessage(req);
		} else if (req.getServletPath().equalsIgnoreCase("/langInfo")) {
			lvn = handler.showAllLangs(req);
		} else {
			lvn = "home";
		}

		String destPage = null;
		if (lvn.equalsIgnoreCase("wish_result")) {
			destPage = "/show_wish.jsp";
		} else if (lvn.equalsIgnoreCase("all_langs")) {
			destPage = "/show_langs.jsp";
		} else {
			destPage = "/index.jsp";
		}

		RequestDispatcher rd = req.getRequestDispatcher(destPage);
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
