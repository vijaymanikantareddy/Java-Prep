package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/home2")
	@ResponseBody
	public String home2() {
		return "home";
	}

}
