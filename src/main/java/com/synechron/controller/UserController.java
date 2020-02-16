package com.synechron.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.synechron.entity.Car;
import com.synechron.entity.Driver;
import com.synechron.service.CarService;
import com.synechron.service.DriverService;
import com.synechron.service.UsersService;

@Controller
public class UserController {

	List<Car> carList = new ArrayList<>();
	List<Driver> driverList = new ArrayList<>();

	@Autowired
	UsersService usersService;
	CarService carService;
	DriverService driverService;

	@GetMapping("/user-page")
	public String userPage(Model model) {
		return "UserHome";
	}

}
