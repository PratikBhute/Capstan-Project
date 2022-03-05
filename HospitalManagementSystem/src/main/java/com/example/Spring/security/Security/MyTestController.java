package com.example.Spring.security.Security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class MyTestController {

	@GetMapping("/demo3")
	public String test2() {
		return "Hello";
	}
}
