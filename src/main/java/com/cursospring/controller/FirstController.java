package com.cursospring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	
	@RequestMapping("/")
	public String index() {
		return "Pagina Inicial";
	}

	
	@RequestMapping("/showText")
	public String showText() {
		return "Hello Word";
	}
}
