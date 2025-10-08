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
}
