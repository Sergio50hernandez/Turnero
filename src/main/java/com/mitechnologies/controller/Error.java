package com.mitechnologies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Error {



	
	ModelAndView mav= new ModelAndView();
	
	
	@GetMapping("/error")
	public ModelAndView principalView()
	{
		System.out.println("entro a error ---------------");
		return new ModelAndView("error:");
	}
}