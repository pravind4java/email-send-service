package com.example.smtp.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smtp.entities.EmailRequest;
import com.example.smtp.service.EmailService;

@RestController
@RequestMapping("/api/email")
public class EmailRestController {

	private final EmailService emailService;

    public EmailRestController(EmailService emailService) {
        this.emailService = emailService;
    }

	@PostMapping("/send")
	public String sendMail(@RequestBody @Valid EmailRequest email) {
		emailService.sendEmail(email.getTo(), email.getSubject(), email.getBody());
		return "Email send to " + email.getTo();
	}
}
