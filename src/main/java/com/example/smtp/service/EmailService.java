package com.example.smtp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(String toEmail, String subject, String message) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(toEmail);
		mail.setSubject(subject);
		mail.setText(message);
		mail.setFrom("pravinssdabhade@gmail.com");

		mailSender.send(mail);
		System.out.println("Email sent to " + toEmail);
	}

}
