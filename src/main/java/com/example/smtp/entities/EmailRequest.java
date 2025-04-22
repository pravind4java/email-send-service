package com.example.smtp.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailRequest {
	
	@NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email format")
	@Pattern(
		    regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",
		    message = "Email must be valid"
		)
	private String to;
	
	@NotBlank(message = "Subject is required")
	private String subject;
	
	@NotBlank(message = "Body is required")
	private String body;

}
