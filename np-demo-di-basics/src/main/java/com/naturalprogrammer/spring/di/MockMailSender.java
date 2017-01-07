package com.naturalprogrammer.spring.di;

public class MockMailSender implements MailSender {

	@Override
	public String send() {
		
		return "Sent MOCK mail";
	}
}
