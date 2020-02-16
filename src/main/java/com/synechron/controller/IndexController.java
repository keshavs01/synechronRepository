package com.synechron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	
	@GetMapping("/")
	public ModelAndView init() {
		System.out.println("init method");
		ModelAndView mdlView = new ModelAndView("Index");
		return mdlView;
	}

}
