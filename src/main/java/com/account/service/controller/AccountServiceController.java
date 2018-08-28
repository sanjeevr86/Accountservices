package com.account.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountServiceController {
  
	@GetMapping (value="/ping")
	public String ping() {
		return "Success";
	}
	
	
}
