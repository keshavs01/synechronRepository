package com.synechron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.entity.Users;
import com.synechron.repo.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;

	public Users authenticate(String email, String password) {
		return userRepository.findByEmailIdAndPassword(email, password);
	}

}
