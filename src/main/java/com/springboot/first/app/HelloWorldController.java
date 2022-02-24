package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//GET HTTP Method
	//URI: http://localost:8080/hello-world
	
	@GetMapping("/hello-world")
	
	public String helloWorld() {
		return "Hello World";
	}

}
