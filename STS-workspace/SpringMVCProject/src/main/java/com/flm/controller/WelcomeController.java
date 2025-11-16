package com.flm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/hi")
	public String sayHi() {
		return "hi";
	}
}
