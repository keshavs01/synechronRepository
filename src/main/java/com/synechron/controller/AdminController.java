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
import com.synechron.service.CarService;
import com.synechron.service.DriverService;

@Controller
public class AdminController {

	@Autowired
	DriverService driverService;

	@Autowired
	CarService carService;

	List<Car> carList = new ArrayList<>();
	List<Driver> driverList = new ArrayList<>();

	@GetMapping("/admin-page")
	public String adminPage(Model model) {
		return "AdminHome";
	}

	// mapping to view the add driver form
	@GetMapping("/viewDriverForm")
	public String viewDriverForm(Model model) {
		model.addAttribute("command", new Driver());
		return "AddDriver";
	}

	// mapping to save the driver into database when user submits the form
	@PostMapping("/addDriver")
	public String addDriver(@ModelAttribute("command") Driver driver) {
		driverService.addDriver(driver);
		return "AdminHome";
	}

	@GetMapping("/viewCarForm")
	public String viewCarForm(Model model) {
		model.addAttribute("command", new Car());
		return "AddCar";
	}

	// mapping to save the car into database when user submits the form
	@PostMapping("/addCar")
	public String addCar(@ModelAttribute("command") Car car) {
		System.out.println("car: " + car);
		carService.addCar(car);
		return "AdminHome";
	}

	@GetMapping("/viewAllCars")
	public String viewAllCars(Model model) {
		carList = carService.viewAllCars();
		System.out.println(carList);
		model.addAttribute("carList", carList);
		return "ViewCars";
	}

	@GetMapping("/updateCar")
	public String updateCar(Model model, @RequestParam Long carId) {
		Car car = carService.getCarById(carId);
		model.addAttribute("command", car);
		return "UpdateCar";
	}

	@GetMapping("/deleteCar")
	public String deleteCar(Model model, @RequestParam Long carId) {
		carService.deleteCarById(carId);
		return viewAllCars(model);
	}

	@GetMapping("/viewAllDrivers")
	public String viewAllDrivers(Model model) {
		driverList = driverService.viewAllDrivers();
		model.addAttribute("driverList", driverList);
		return "ViewDrivers";
	}

	@GetMapping("/updateDriver")
	public String updateDriver(Model model, @RequestParam Long driverId) {
		System.out.println(driverId);
		Driver driver = driverService.getDriverById(driverId);
		model.addAttribute("command", driver);
		return "UpdateDriver";
	}

	@GetMapping("/deleteDriver")
	public String deleteDriver(Model model, @RequestParam Long driverId) {
		driverService.deleteDriverById(driverId);
		return viewAllDrivers(model); // we just called the view drivers method
	}
	
	@ModelAttribute("categoryList")
	   public List<String> getCategoryList() {
	      List<String> categoryList = new ArrayList<String>();
	      categoryList.add("sedan");
	      categoryList.add("hatchback");
	      categoryList.add("SUV");
	      categoryList.add("crossover");
	      return categoryList;
	   }

}
