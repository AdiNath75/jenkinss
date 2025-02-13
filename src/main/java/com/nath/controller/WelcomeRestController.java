package com.nath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringBoot")
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String getMessage() {
		
		return "Welcome to nath";
	}

	@GetMappping("/signup")
	public String signupPage(){
		return "Signup Here...!":
	}

}
