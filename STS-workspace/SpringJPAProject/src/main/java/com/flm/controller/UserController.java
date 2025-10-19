package com.flm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flm.model.User;
import com.flm.service.UserPageService;
import com.flm.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserPageService userPageService;

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

	@GetMapping("/user-byname")
	public void findUserByName() {
		userService.getUserByName();
	}

	@GetMapping("/user-byage")
	public void findUserByAge() {
		userService.getUserByAge();
	}

	@GetMapping("/findbyname")
	public void findByName() {
		userService.findByName();
	}

	@GetMapping("/bynameandage")
	public User findByNameAndAge(@RequestParam(name = "name") String name, @RequestParam(name = "age") int age) {
		User user = userService.findByNameAndAge(name, age);
		return user;
	}

	@GetMapping("/bynameorage")
	public List<User> findByNameOrAge(@RequestParam(name = "name") String name, @RequestParam(name = "age") int age) {
		List<User> users = userService.findByNameOrAge(name, age);
		return users;
	}

	@GetMapping("/bynamestart")
	public List<User> findByNameStartingWith(@RequestParam(name = "name") String name) {
		List<User> users = userService.findByNameStartingWith(name);
		return users;
	}

	@GetMapping("/bypage")
	public Page<User> getUsersByPage(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
		return userPageService.getUserByPage(page, size);
	}

	@GetMapping("/bypagesorted")
	public Page<User> getUsersByPageAndSort(@RequestParam(name = "page") int page,
			@RequestParam(name = "size") int size) {
		return userPageService.getUserByPageAndSort(page, size);
	}
}
