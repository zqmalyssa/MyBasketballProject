package com.fm.xprj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fm.xprj.model.User;
import com.fm.xprj.service.IUserService;
import com.fm.xprj.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	IUserService userService;
	
//	@GetMapping("/user/home")
//	public String showUserHomePage(){
//		
//		return "/user/home";
//	}
//	@GetMapping("/user/reserve")
//	public String showUserReservePage(){
//		
//		return "/user/reserveMatch";
//	}
//	@GetMapping("/user/profile")
//	public String showUserProfilePage(Model model){
//		User user=userService.getUserById(0);
//		model.addAttribute("user", user);
//		return "/user/myProfile";
//	}
////	@RequestMapping(value="/user/update",method=RequestMethod.POST)
////	public String updateUser(@ModelAttribute("user") User user,Model model){
////		System.out.println(user);
////		return "/user/myProfile";
////	}
//	
//	@GetMapping("/user/updatePage")
//	public String showUserUpdatePage(Model model){
//		User user=userService.getUserById(0);
//		model.addAttribute("user", user);
//		return "/user/myProfileUpdate";
//	}
//	@PostMapping("/user/update")
//	public String updateUser(@ModelAttribute("user") User user,Model model){
//		System.out.println(user);
//		return "/user/myProfile";
//	}
	
	
	@GetMapping("/users/{id}/profile")
	public String showUserProfilePage(@PathVariable("id") int id,Model model){
		User user=userService.getUserById(id);
		model.addAttribute("user", user);
		return "/user/myProfile";
	}
	@GetMapping("/users/{id}/profile/update")
	public String showUserProfileUpdatePage(@PathVariable("id") int id,Model model){
		User user=userService.getUserById(id);
		model.addAttribute("user", user);
		return "/user/myProfileUpdate";
	}
	@PostMapping("/users/profile")
	public String updateUserProfile(@ModelAttribute("user") User user,Model model){
		User updatedUser=userService.updateUser(user);
		model.addAttribute("user", updatedUser);
		return "/user/myProfile";
	}
	@GetMapping("/users/{id}/reserveMatch")
	public String ShowReserveMatchPage(){
		return "/user/reserveMatch";
	}
	@PostMapping("/users/reserveMatch")
	public String reserveMatch(@ModelAttribute("user") User user,Model model){
		return "";
	}
	
	
	

}
