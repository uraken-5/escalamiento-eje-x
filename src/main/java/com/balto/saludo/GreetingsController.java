package com.balto.saludo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	
	@GetMapping("/greet")
	public String greet() {
		return "hi ! i`m balto ";
	}
	

}
