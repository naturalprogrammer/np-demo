package com.naturalprogrammer.spring.di;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!dev")
public class SmtpMailSender implements MailSender {

	@Override
	public String send() {
		
		return "Sent SMTP mail";
	}

}
