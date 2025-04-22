package com.example.smtp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.smtp.service.EmailService;

@RestController
@RequestMapping("/api/email")
public class EmailRestController {

	@Autowired
	private EmailService emailService;

	@PostMapping("/send")
	public String sendMail(@RequestParam String to, @RequestParam String subject, @RequestParam String body) {
		emailService.sendEmail(to, subject, body);
		return "Email send to " + to;
	}
}
