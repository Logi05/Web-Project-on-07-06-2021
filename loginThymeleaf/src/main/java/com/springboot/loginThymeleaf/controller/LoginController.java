package com.springboot.loginThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.loginThymeleaf.entity.LoginForm;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String welcomePage()
	{
		return "welcome";
	}
	
	@GetMapping("/adlog")
	public String adloginPage()
	{
		return "login";
	}
	

	@GetMapping("/emplog")
	public String emploginPage()
	{
		return "emplogin";
	}
	
	
	
	
	/*@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginForm()
	{
		return "login";
	}*/
	
	@RequestMapping(value="/adlogin", method=RequestMethod.POST)
	public String adminlogin(@ModelAttribute(name="adloginform") LoginForm loginForm,Model model)
	{
		String username=loginForm.getUsername();
		String password=loginForm.getPassword();
		
		if("admin".equals(username) && "admin".equals(password))
		{
			return "home";
		}
		else
		{
			return "errorpage";
		}
		/*model.addAttribute("invalidCredentials", true);
		return "login";*/
	}
	
	@RequestMapping(value="/emplogin", method=RequestMethod.POST)
	public String emplogin(@ModelAttribute(name="emploginform") LoginForm loginForm,Model model)
	{
		String username=loginForm.getUsername();
		String password=loginForm.getPassword();
		
		if("admin".equals(username) && "admin".equals(password))
		{
			return "billhome";
		}
		else if("employee".equals(username) && "employee".equals(password))
		{
			return "billhome";
		}
		else
		{
			return "errorpage1";
		}
		/*model.addAttribute("invalidCredentials", true);
		return "login";*/
	}
	
	/*@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginform") LoginForm loginForm,Model model)
	{
		String role=loginForm.getRole();
		if("admin".equals(role) || "employee".equals(role))
		{
			return "home";
		}
		else
		{
			return "errorpage";
		}
		
	}*/
}
