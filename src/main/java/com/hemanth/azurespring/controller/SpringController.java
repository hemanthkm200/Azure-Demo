package com.hemanth.azurespring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Azure";
	}
}
