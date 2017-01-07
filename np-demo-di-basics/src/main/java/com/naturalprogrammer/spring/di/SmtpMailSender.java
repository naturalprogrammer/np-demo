package com.naturalprogrammer.spring.di;

public class SmtpMailSender implements MailSender {

	@Override
	public String send() {
		
		return "Sent SMTP mail";
	}

}
