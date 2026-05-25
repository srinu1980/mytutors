package com.cts;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/greet")
	public String greet() {
		return "Welcome";
	}

	@GetMapping("/hello")
	public ModelAndView sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		ModelAndView mv = new ModelAndView("hello");
		return mv;
	}

}
