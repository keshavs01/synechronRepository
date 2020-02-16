package com.synechron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.synechron.entity.LoginCredentials;
import com.synechron.entity.Users;
import com.synechron.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@GetMapping("/login-page")
	public String loginPage(Model model) {
		model.addAttribute("command", new LoginCredentials());
		return "Login";
	}

	@PostMapping("/login")
	public String onLogin(@ModelAttribute("command") LoginCredentials loginCredentials) {
		System.out.println(loginCredentials);
		// check authentication
		Users user = loginService.authenticate(loginCredentials.getEmail(), loginCredentials.getPassword());
		System.out.println(user);

		// if authentication fails keep on login page and show error message
		if (user == null) {
			return "Login";
		} else {
			// if authentication passes
			// check role
			// if admin redirect to admin page
			if (user.getRole() != null && user.getRole().equalsIgnoreCase("admin")) {
				return "AdminHome";
			}
			// if normal user redirect to user page
			return "UserHome";
		}
	}
}
