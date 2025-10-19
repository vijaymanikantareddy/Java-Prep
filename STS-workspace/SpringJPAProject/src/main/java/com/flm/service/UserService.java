package com.flm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flm.dao.UserRepository;
import com.flm.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public String save() {
		User user = new User("Vijay", 20);
		User savedUser = userRepository.save(user);
		return savedUser.getName();
	}

	public void getUser() {
		Optional<User> userInfo = userRepository.findById(1);
		User user = userInfo.get();
		System.out.println(user);
	}

	public void getAllUsers() {
		List<User> users = userRepository.findAll();
		System.out.println(users);
	}

	public void getUserByName() {
		User user2 = userRepository.findByUserName("Vijay");
		System.out.println(user2);
	}

	public void getUserByAge() {
		User user3 = userRepository.findByUserAge(20);
		System.out.println(user3);
	}

	public void findByName() {
		User user = userRepository.findByName("Vijay");
		System.out.println(user);
	}

	public User findByNameAndAge(String name, int age) {
		User user = userRepository.findByNameAndAge(name, age);
		return user;
	}

	public List<User> findByNameOrAge(String name, int age) {
		List<User> users = userRepository.findByNameOrAge(name, age);
		return users;
	}

	public List<User> findByNameStartingWith(String name) {
		List<User> users = userRepository.findByNameStartingWith(name);
		return users;
	}
}
