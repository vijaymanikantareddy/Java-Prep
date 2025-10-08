package com.flm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/save")
	public String saveUser() {
		String name = userService.save();
		return name;
	}

	@GetMapping("/user")
	public void findUser() {
		userService.getUser();
	}

	@GetMapping("/all-users")
	public void findAllUsers() {
		userService.getAllUsers();
	}
}
