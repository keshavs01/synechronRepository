package com.synechron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.synechron.entity.Users;
import com.synechron.service.UsersService;

@Controller
public class RegistrationController {

	@Autowired
	UsersService usersService;

	@GetMapping("/registration-page")
	public String registrationPage(Model model) {
		model.addAttribute("command", new Users());
		return "Registration";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute("command") Users user) {
		usersService.addUser(user);
		return "UserHome";
	}
}
