package com.account.service.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class AccountServiceController {
	
	@RequestMapping(method=RequestMethod.GET ,path ="/ping")
	public String ping() {
		return "Success";
	}
	
	
	
	
}
