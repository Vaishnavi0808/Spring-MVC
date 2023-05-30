package com.vaishnavi.demo.boottomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vaishnavi.demo.boottomvc.model.Student;

@Controller
public class MyController {
	
//	@GetMapping(value="/ok")
	@RequestMapping(value="/ok",method=RequestMethod.GET)
	public String getInfo(@ModelAttribute ("index")Student student)
	{
		return "index";
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public String showInfo(@ModelAttribute ("index")Student student)
	{
		return "submit";
	}

}
