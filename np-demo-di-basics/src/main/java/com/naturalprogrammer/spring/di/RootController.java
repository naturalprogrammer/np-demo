package com.naturalprogrammer.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {
	
	@Autowired
	private MailSender mailSender;
	
	@GetMapping
	public String index() {
		
		return mailSender.send();
	}
}
