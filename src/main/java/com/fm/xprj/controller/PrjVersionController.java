package com.fm.xprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrjVersionController {
	
	@GetMapping(value={"/prjVersion","/"})
	public String showPrjVersion(){
		
		return "prjVersion";
	}

}
