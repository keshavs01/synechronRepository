package com.synechron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.entity.Users;
import com.synechron.repo.UserRepository;

@Service
public class UsersService {

	@Autowired
	UserRepository userRepository;

	public Users addUser(Users user) {
		return userRepository.save(user);
	}

	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}

}
