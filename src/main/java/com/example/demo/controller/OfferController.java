package com.example.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Offer;
import com.example.demo.repository.OfferRepository;

@Controller
public class OfferController {
		
	@Autowired
	private Offer offer; 
	
	@Autowired
	private OfferRepository offerRepo;
	
	@Autowired
	private ModelAndView modelView;
	
	@GetMapping(path="/viewOffers") 
	  public String findAll(Model model) {
		  System.out.println("Offer List"); 
		  List<Offer> allOffers=offerRepo.findAll();
		  long millis=System.currentTimeMillis(); 
		  java.sql.Date date=new java.sql.Date(millis);
		  
		  Predicate<Offer> isAfter = e -> e.getStartDate().before(date);
		  
		
		  
		  Predicate<Offer> isBefore = e -> e.getEndDate().after(date);
		  
		  
		  List<Offer> offerList=allOffers.stream().filter(isAfter.and(isBefore))
				  .collect(Collectors.toList());

		
		  
		 /*List<Offer> offerList=
		  offerRepo.getAllBetweenDates(date, date, date);*/
		 
		  System.out.println("OfferList:: "+offerList);
		  model.addAttribute("offerList", offerList);	
		  return "viewOffers";	  
		  
		  }
	

}
