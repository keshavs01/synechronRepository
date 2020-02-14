package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Car;
import com.example.demo.entity.Driver;
import com.example.demo.entity.Offer;
import com.example.demo.entity.UserLoginRegistration;

@Configuration
public class WebConfig {
	
	@Bean
	public ModelAndView modelView() {
		return new ModelAndView();		
	}
	
	@Bean
	public UserLoginRegistration loginRegistration() {
		return new UserLoginRegistration();		
	}
	
	@Bean
	public Driver driver() {
		return new Driver();		
	}
	
	@Bean
	public Car car() {
		return new Car();		
	}
	
	@Bean
	public Offer offer() {
		return new Offer();		
	}
	

}
