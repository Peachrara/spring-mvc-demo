package com.trasyapp.springdemo.mvc;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processForm2")
	public String shout(
			@RequestParam("studentName") String name, 
			Model model
			) {
		name = name.toUpperCase();
		String result = "YO! " + name;
		model.addAttribute("message", result);
		return "helloworld";
	}
	
}
