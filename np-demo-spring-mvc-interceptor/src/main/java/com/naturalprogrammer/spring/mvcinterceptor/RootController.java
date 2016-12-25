package com.naturalprogrammer.spring.mvcinterceptor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello, world";
	}
}
