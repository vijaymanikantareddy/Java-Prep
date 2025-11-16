package com.flm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flm.model.User;

@Controller
public class UserController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "vijay");
		model.addAttribute("user", new User());
		return "home";
	}

	@PostMapping("/submit")
	public String submit(@RequestParam("name") String name, @RequestParam("password") String password, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("password", password);
		System.out.println(name + " " + password);
		return "success";
	}

	@PostMapping("/submitObject")
	public String submit(@ModelAttribute("user") User user, Model model) {
		model.addAttribute("name", user.getName());
		model.addAttribute("password", user.getPassword());
		System.out.println(user.getName() + " obj " + user.getPassword());
		return "success";
	}

	@GetMapping("/users")
	public String users(Model model) {
		List<User> users = new ArrayList();
		users.add(new User("ABC", "pass123"));
		users.add(new User("DEF", "secret123"));
		users.add(new User("FLM", "confidential"));
		model.addAttribute("usersList", users);
		return "users";
	}
}
