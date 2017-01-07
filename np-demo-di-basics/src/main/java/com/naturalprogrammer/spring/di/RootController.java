package com.naturalprogrammer.spring.di;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {
	
	private MailSender mailSender = new MockMailSender();
	
	@GetMapping
	public String index() {
		
		return mailSender.send();
	}
}
