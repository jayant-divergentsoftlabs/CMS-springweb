package com.divergent.springmvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LoginController {

	private static final long serialVersionUID = 1L;

	@PostMapping("/adminlogin")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("password");

		if (password.equals("root")) {
			ModelAndView modelAndView = new ModelAndView("adminpanel");
			return modelAndView;
		} else {
			ModelAndView modelAndView = new ModelAndView("index");
			modelAndView.addObject(password, "Incorrect Username and Password");
			return modelAndView;
		}
	}

}
