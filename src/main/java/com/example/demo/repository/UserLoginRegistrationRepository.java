package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserLoginRegistration;

public interface UserLoginRegistrationRepository extends JpaRepository<UserLoginRegistration, Integer> {

	UserLoginRegistration findByUserIdAndPassword(String userId, String password);
	UserLoginRegistration findByUserId(String userId);
	
}
