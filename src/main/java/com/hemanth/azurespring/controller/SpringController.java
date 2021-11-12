package com.hemanth.azurespring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@RequestMapping("/hello")
	public void hello() {
		System.out.println("Hello Azure");
	}
}
