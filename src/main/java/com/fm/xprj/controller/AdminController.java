package com.fm.xprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@GetMapping("/admin/publishMatch")
	public String showUserProfilePage(){
		
		return "/admin/publishMatch";
	}

}
