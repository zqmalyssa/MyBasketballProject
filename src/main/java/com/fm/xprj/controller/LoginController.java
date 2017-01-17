package com.fm.xprj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fm.xprj.exception.FMException;
import com.fm.xprj.exception.FMExceptionID;
import com.fm.xprj.model.User;
import com.fm.xprj.service.IUserService;

@Controller
public class LoginController extends BaseFMController{
	@Autowired
	IUserService userService;
	
	@GetMapping("/login")
	public String showLoginPage(Model model){
		User user=new User();
		model.addAttribute("user",user);
//		model.addAttribute("fmMsgCss","alert alert-warning");
//		model.addAttribute("fmMsg","HAHA");
		return "login";
	}
	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user,Model model,RedirectAttributes attr){
		try {
			user=userService.logIn(user.getLoginId(), user.getLoginPwd());
		} catch (FMException e) {
			handleFMException(e,attr);
			return "redirect:/login";  
		}

		model.addAttribute("user",user);
		return   "/user/myProfile";
		

	}
	@PostMapping("/register")
	public String register(@ModelAttribute("user") User user,Model model,RedirectAttributes attr){
		try {
			user=userService.register(user);
		} catch (FMException e) {
			handleFMException(e,attr);
			return "redirect:/login";  
		}
		model.addAttribute("user",user);
		return "/user/myProfile";


		
	}
	


}
