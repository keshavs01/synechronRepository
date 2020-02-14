package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.UserLoginRegistration;
import com.example.demo.repository.UserLoginRegistrationRepository;

@Controller
public class UserLoginRegistrationController {
	
	@Autowired
	private UserLoginRegistration loginRegistration;
	
	@Autowired
	private UserLoginRegistrationRepository loginRegisterRepo;
	
	@Autowired
	private ModelAndView modelView;
	
	@GetMapping(path="/")
	public ModelAndView init() {
		modelView.setViewName("indexPage");
		modelView.addObject("mainHeading", "Car Rental Agency");
		return modelView;		
	}
			
	@PostMapping(path="/login")
	public String onLogin(@Valid @ModelAttribute("command")UserLoginRegistration loginRegistration,BindingResult result,
			Model model) {	
		
		String nextPage="adminViewPage";

		UserLoginRegistration user=loginRegisterRepo.findByUserIdAndPassword(loginRegistration.getUserId(),loginRegistration.getPassword());		
		
		
	   if(user!=null ) {	
		   if(!user.isAdmin()) {
			   nextPage="userViewPage";  
		   }	   
		   		   							   	   
		}
	   else {
		   System.out.println("strat====");
		   model.addAttribute("errorMsg", "Wrong UserName or Password");	
		   nextPage="menu";
		   System.out.println("end====");
		   }
	return nextPage;			
	}	
	
	@GetMapping(path="/register")
	public String registerProcess(Model model) {
		System.out.println("Kwgtfdgjfkdg");
		model.addAttribute("command",loginRegistration);
		return "register";
	
	}
	
	@PostMapping(path="/register")
	public String onSubmit(@Valid @ModelAttribute("command")UserLoginRegistration loginRegistration,BindingResult result,
			Model model) {
		UserLoginRegistration existUser=loginRegisterRepo.findByUserId(loginRegistration.getUserId());
		if(existUser==null) {
		loginRegisterRepo.save(loginRegistration);				
		}
		else {
			model.addAttribute("registrationError", "UserId already exists");			
		}
		return "menu";
	}
	
	
	
	

}
