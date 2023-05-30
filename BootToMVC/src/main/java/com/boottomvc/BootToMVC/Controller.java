package com.boottomvc.BootToMVC;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello.jsp";
	}

}
