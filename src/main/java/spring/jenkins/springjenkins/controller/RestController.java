package spring.jenkins.springjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping("/check")
	public String helthCheck() {
		return "Running";
	}
}
