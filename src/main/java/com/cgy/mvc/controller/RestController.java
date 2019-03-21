package com.cgy.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping("/rest")
	public String rest(int i) {
		int j =1/i;
		return "rest result...";
	}
}
