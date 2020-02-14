package com.example.demo.controller;

import java.util.List;

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

import com.example.demo.entity.Car;
import com.example.demo.entity.CarCategory;
import com.example.demo.entity.Driver;
import com.example.demo.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	private Car car;
	
	@Autowired
	private CarRepository carRepo;
	
	@Autowired
	private ModelAndView modelView;
	
	@GetMapping(path="/addCar")
	public String addCar(Model model) {
		model.addAttribute("command",car);
		model.addAttribute("carCtegories", CarCategory.values());
		return "addCar";		
	}
	
	@PostMapping(path="/addCar")
	public String onSubmitAddCar(@Valid @ModelAttribute("command") Car car, 
			BindingResult result,Model model) {
		String nextPage= "success";
		Car existUser=carRepo.findByRegistrationNumber(car.getRegistrationNumber());
		if(existUser==null) {
			carRepo.save(car);
			System.out.println("Car adding");
			
		}
		else {
			model.addAttribute("carRegistrationError", "Car already exists");		
			nextPage="addCar";
		}
		
		return nextPage;
		
	}
	
	  @GetMapping(path="/viewCars") 
	  public String findAll(Model model) {
		  System.out.println("Car List");
		  List<Car> carList=  this.carRepo.findByDeleteStatus(false); 
		  model.addAttribute("carList", carList);			 			 
		  return "showCarsList";	  
		  
		  }
	
	  @GetMapping(path="/deleteCar/{id}")
		public String onSubmitdeleteDriver(@Valid @ModelAttribute("command") Car car,
				BindingResult result,@PathVariable("id")int id) {	
			carRepo.updateStatus(true, id);
			return "success";		
		}
	  
	  @GetMapping(path = "/searchCarsBasedOnCategory")
		public String searchCarsByCategory(Model model) {
			model.addAttribute("command", car);
			return "searchCar";
		}

		@GetMapping(path = "/showCarsByCategory/{category}")
		public String showCarsByCategory(@PathVariable("category") CarCategory category, Model model) {
			String nextPage="searchCar";
			List<Car> carList = null;
			try {
			 carList = this.carRepo.findByCarCategoryAndDeleteStatus(category,false);
			}
			catch(Exception e) {
				System.out.println("Exception occured");
			}
			
			
			if(!carList.isEmpty()) {
			model.addAttribute("carList", carList);
			nextPage= "showCarsByCategory";
		}			
			else {
				System.out.println("No car present......");
				model.addAttribute("carNotFoundError", "No car is present for this category");	
				nextPage="searchCar";
			}
			
			return nextPage;
		}
}
				
	

		
		



