package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Driver;

import com.example.demo.entity.UserLoginRegistration;
import com.example.demo.repository.DriverRepository;
import com.example.demo.repository.UserLoginRegistrationRepository;

@Controller
public class DriverController {

	@Autowired
	private Driver driver;

	@Autowired
	private DriverRepository driverRepo;

	@Autowired
	private ModelAndView modelView;

	@GetMapping(path = "/addDriver")
	public String addDriver(Model model) {
		model.addAttribute("command", driver);
		return "addDriver";
	}

	@PostMapping(path = "/addDriver")
	public String onSubmitAddDriver(@Valid @ModelAttribute("command") Driver driver, BindingResult result,
			Model model) {
		String nextPage = "success";
		Driver existUser = driverRepo.findByPhoneNumber(driver.getPhoneNumber());
		if (existUser == null) {
			driverRepo.save(driver);

		} else {
			model.addAttribute("driverRegistrationError", "Driver already exists");
			nextPage = "addDriver";
		}

		return nextPage;
	}

	@GetMapping(path = "/deleteDriver/{id}")
	public String deleteDriver(@Valid @ModelAttribute("command") Driver driver, BindingResult result,
			@PathVariable("id") int id) {
		driverRepo.updateStatus(true, id);
		return "success";
	}

	@GetMapping(path = "/viewDrivers")
	public String findAll(Model model) {
		List<Driver> driverList = this.driverRepo.findByDeleteStatus(false);
		model.addAttribute("driverList", driverList);
		return "showDriverList";

	}

	@GetMapping(path = "/searchDriverBasedonCity")
	public String searchDriversByCity(Model model) {
		model.addAttribute("command", driver);
		return "searchDriver";
	}

	@GetMapping(path = "/showDriversByCity/{city}")
	public String showDriversByCity(@PathVariable("city") String city, Model model) {

		System.out.println("city=" + city);

		List<Driver> driverList = this.driverRepo.findByCity(city);
		
		String nextPage="showDriversByCity";
		if(!driverList.isEmpty()) {
			model.addAttribute("driverList", driverList);
			
		}			
		else {
				System.out.println("No car present......");
				model.addAttribute("driversNotPresent", "No drivers are available for this city");	
				nextPage="searchDriver";
			}
		return nextPage;
			
			
		
		
	}
	
	
	
	
	
	/*
	 * @GetMapping(path="/updateDriver") public String updateDriver(Model model) {
	 * model.addAttribute("command",driver); return "addDriver"; }
	 * 
	 * @PostMapping(path="/updateDriver") public String
	 * onSubmitUpdateDriver(@Valid @ModelAttribute("command") Driver driver,
	 * BindingResult result) { driverRepo.save(driver); return "success"; }
	 */

}
