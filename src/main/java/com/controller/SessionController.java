package com.controller;

 
import java.lang.reflect.Field;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.UserBean;
import com.dao.UserDao;

 
 
@Controller
public class SessionController {
	 
	@Autowired
	UserDao dao;

	@GetMapping("/signup")
	public String openSignup() {
		System.out.println("Signup/...");
		return "Signup";
	}
	@GetMapping("/login")
	public String openLogin() {
		System.out.println("Login/...");
		return "Login";
	}
	
	@PostMapping("/saveuser")
	public String saveUser(@Valid UserBean user,BindingResult result,Model model ) {
		
		if(result.hasErrors()) {
		System.out.println(user.getFirstName());
		for (FieldError err : result.getFieldErrors()) {
			
			model.addAttribute(err.getField(), err.getDefaultMessage());
		}
		model.addAttribute("User", user);
			return "Signup";
		}else {
			
			dao.insertUser(user);
			model.addAttribute("user",user);
			return "redirect:/login";
		}
		
		 
	}
	
}
