package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public void hello(Model model) {
		
		// model.addAttribute("greeting", "Hello Jangnara~");
		model.addAttribute("greeting", "안녕~신동일222 ^-^/");
		
	}

}