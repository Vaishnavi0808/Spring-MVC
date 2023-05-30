package com.mvctoboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(value="/hello")
		public String user() {
			return "Welcome";
		}
	}

