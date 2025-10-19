package com.flm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.flm.dao.UserRepository;
import com.flm.model.User;

@Service
public class UserPageService {
	@Autowired
	UserRepository userRepository;

	public Page<User> getUserByPage(int pageNumber, int size) {
		PageRequest request = PageRequest.of(pageNumber, size);
		Page<User> page = userRepository.findAll(request);
		return page;
	}

	public Page<User> getUserByPageAndSort(int pageNumber, int size) {
		Sort ascending = Sort.by("age").ascending();
		PageRequest request = PageRequest.of(pageNumber, size, ascending);
		Page<User> page = userRepository.findAll(request);
		return page;
	}
}
