package com.cts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody

@RestController
public class HomeController {

	// localhost:8080/
	// @GetMapping("/")

	@RequestMapping(value = "/", method = RequestMethod.GET)

	public String greeting() {
		return "Good Afternoon";

	}

	@GetMapping("/login")
	public String login() {
		return "Login Page!";

	}

	@GetMapping("/about")
	public String about() {
		return "About Page!";

	}

	@GetMapping("/reg")
	public String registration() {
		return "Registration Page!";

	}

}
