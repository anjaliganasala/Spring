package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@RequestMapping("/hi")
	@ResponseBody
	public String Hi() {
		return "home";
				
	}
	@RequestMapping("/home")
	public String Bye() {
		return "home";
     }
	@RequestMapping("/data")
	public String home(Model model) {
		model.addAttribute("name", "Anjali");
		return "home";
	}
	@PostMapping("/signup")
	public String signUp(Model model,HttpServletRequest http) {
		
	 String email =	(String) http.getParameter("email");
	 String password = (String) http.getParameter("password");
	 
	 System.out.println(email);
	 System.out.println(password);
	 
	 model.addAttribute("email",email);
	 model.addAttribute("password",password);
	 return "data";
	}
}
