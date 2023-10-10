package com.example.springjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	@GetMapping("/message")
	public String message() {
		return "Message from  jenkins controller";
	}
}
