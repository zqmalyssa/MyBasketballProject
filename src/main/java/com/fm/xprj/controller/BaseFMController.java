package com.fm.xprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fm.xprj.exception.FMException;
import com.fm.xprj.exception.FMExceptionID;
@Controller
public class BaseFMController {
	
	protected void handleFMException(FMException fmException,RedirectAttributes attr){
		if(null!=fmException){
			String msg=fmException.getMessage();
			String fmMsgCss="";
			switch (fmException.getType()) {
			case FMExceptionID.ERROR:
				fmMsgCss="alert alert-danger";
				break;
			case FMExceptionID.WARNING:
				fmMsgCss="alert alert-warning";
				break;
			default:
				fmMsgCss="alert alert-info";
				break;
			}
			attr.addFlashAttribute("fmMsgCss",fmMsgCss);
			attr.addFlashAttribute("fmMsg",msg);
		}
	}
	
	protected void handleFMException(FMException fmException, Model model){
		if(null!=fmException){
			String msg=fmException.getMessage();
			String fmMsgCss="";
			switch (fmException.getType()) {
			case FMExceptionID.ERROR:
				fmMsgCss="alert alert-danger";
				break;
			case FMExceptionID.WARNING:
				fmMsgCss="alert alert-warning";
				break;
			default:
				fmMsgCss="alert alert-info";
				break;
			}
			model.addAttribute("fmMsgCss",fmMsgCss);
			model.addAttribute("fmMsg",msg);
		}
	}


}
