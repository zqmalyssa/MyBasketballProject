package com.fm.xprj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fm.xprj.model.Match;
import com.fm.xprj.model.User;
import com.fm.xprj.service.IAdminService;

@Controller
public class AdminController {
	
	@Autowired
	IAdminService adminService;
	
	@GetMapping("/admin/publishMatch")
	public String showAdminPublishMatchPage(Model model, HttpServletRequest request){
		System.out.println("调用showAdminPublishMatchPage方法"+System.currentTimeMillis());
		
		Match match=new Match();
		model.addAttribute("match",match);
		
		String s_pageNow = request.getParameter("pageNow");
		
		List<Match> allMatches = adminService.getAllMatches();
		int size = allMatches.size();
		
		int pageNow = 1;
		if(s_pageNow!=null){
			pageNow = Integer.parseInt(s_pageNow);
		}
		int pageSize = 4;
		int start = (pageNow-1)*pageSize;
		int pageCount = (size-1)/pageSize+1;
		List<Match> pageMatches = adminService.getMatchesByPage(pageSize, start);
		model.addAttribute("pageMatches", pageMatches);
		model.addAttribute("pageNow", pageNow);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("allMatches", allMatches);
		return "/admin/publishMatch";
	}
	
	@PostMapping("/admin/publish")
	public String publishMatch(@ModelAttribute("match") Match match,Model model){
		Match createMatch=adminService.createMatch(match);
		model.addAttribute("match", createMatch);
		//走的POST请求，这边也要放参数进来，否则不会显示
		List<Match> allMatches = adminService.getAllMatches();
		int size = allMatches.size();
		int pageNow = 1;
		int pageSize = 4;
		int start = (pageNow-1)*pageSize;
		int pageCount = (size-1)/pageSize+1;
		List<Match> pageMatches = adminService.getMatchesByPage(pageSize, start);
		model.addAttribute("pageMatches", pageMatches);
		model.addAttribute("pageCount", pageCount);
		return "/admin/publishMatch";
	}

}
