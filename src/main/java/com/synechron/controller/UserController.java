package com.synechron.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.synechron.entity.Car;
import com.synechron.entity.Driver;
import com.synechron.entity.Trip;
import com.synechron.service.CarService;
import com.synechron.service.DriverService;
import com.synechron.service.TripService;
import com.synechron.service.UsersService;

@Controller
public class UserController {

	List<Car> carList = new ArrayList<>();
	List<Driver> driverList = new ArrayList<>();

	@Autowired
	UsersService usersService;
	@Autowired
	CarService carService;
	@Autowired
	DriverService driverService;
	@Autowired
	TripService tripService;

	@GetMapping("/user-page")
	public String userPage(Model model) {
		return "UserHome";
	}

	@GetMapping("/viewAndBookCar")
	public String viewAndBookCar(Model model) {
		carList = carService.viewAllCars();
		model.addAttribute("carList", carList);
		return "ViewAndBookCar";
	}

	@GetMapping("/bookCar")
	public String bookCar(Model model, @RequestParam Long carId) {
		Car car = carService.getCarById(carId);
		System.out.println(car);
		model.addAttribute("carObject", car);
		model.addAttribute("command",new Trip());
		return "BookCarPage";
	}
	
	@PostMapping("/bookCar")
	public String addTrip(@ModelAttribute("command")Trip trip) {
		tripService.addTrip(trip);
		return "success";
	}

}
