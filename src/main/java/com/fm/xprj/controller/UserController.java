package com.fm.xprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/user/home")
	public String showUserHomePage(){
		
		return "/user/home";
	}
	@GetMapping("/user/reserve")
	public String showUserReservePage(){
		
		return "/user/reserveMatch";
	}
	@GetMapping("/user/profile")
	public String showUserProfilePage(){
		
		return "/user/myProfile";
	}

}
