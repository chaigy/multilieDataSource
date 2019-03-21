package com.cgy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
	
	
	@RequestMapping(value="/index")
	public String index(int i) {
		int j =1/i;
		return "index";
	}
}
