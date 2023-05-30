package com.vaishnavi.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
	
	@RequestMapping("/this")
	public String user()
	{
		return "this";
	}

}
