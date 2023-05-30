package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String printMessage(Model model)
	{
		
		model.addAttribute("message","WELCOME TO Spring MVC");
		
		return "message";
	}
}
