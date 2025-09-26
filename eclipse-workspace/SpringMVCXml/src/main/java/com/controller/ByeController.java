package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ByeController {
	@RequestMapping("/bye")
	@ResponseBody
	public String bye() {
		return "Bye Bye Dude";
	}
}
