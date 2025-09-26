package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/fet")
public class HomeController {

	@RequestMapping("/hi")
	public String hi() {
		return "home";
	}

	@RequestMapping("/hello")
	@ResponseBody
	public String hi2() {
		return "home";
	}

	@RequestMapping("/data")
	public String home(Model model) {
		model.addAttribute("name", "Vijay");
		return "home";
	}

	@PostMapping("signup")
	public String signUp(Model model, HttpServletRequest http) {
		String email = http.getParameter("email");
		String password = http.getParameter("password");

		model.addAttribute("email", email);
		model.addAttribute("password", password);
		return "data";
	}
}
