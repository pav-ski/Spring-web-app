package com.pav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController {

	@RequestMapping("/hello")
	public ModelAndView greet(@RequestParam("name") String name) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("name", name);
		System.out.println("IN A CONTROLLER");
		
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView dashboard() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");

		return mv;
	}
	
	
}
