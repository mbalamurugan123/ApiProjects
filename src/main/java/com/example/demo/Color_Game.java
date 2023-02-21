package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Color_Game {
	private String yourFavColor = "White";
	
	@GetMapping("/")
	
	public String getName() {
		return "My favorite color is "+yourFavColor;
	}
}
