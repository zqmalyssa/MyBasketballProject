package com.fm.xprj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fm.xprj.model.User;
import com.fm.xprj.service.IUserService;

@Controller
public class LoginController {
	@Autowired
	IUserService userService;
	
	@GetMapping("/login")
	public String showLoginPage(Model model){
		User user=new User();
		model.addAttribute("user",user);
		return "login";
	}
	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user,Model model){
		user=userService.logIn(user.getLoginId(), user.getLoginPwd());
		model.addAttribute("user",user);
		return   "/user/myProfile";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute("user") User user,Model model){
		user=userService.createUser(user);
		model.addAttribute("user",user);
		return "/user/myProfile";
		
	}

}
