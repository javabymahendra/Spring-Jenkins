package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	
	
	@GetMapping("/msg")
	public String hello(){
		
		return "Hello Spring world....";
	}
}
