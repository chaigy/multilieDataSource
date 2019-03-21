package com.cgy.mvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice(basePackages= {"com.cgy.mvc.controller"})
public class ExceptionController {
	
	
/*	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String restException() {
		return "我是rest的错误信息";
	}
	*/
	@ExceptionHandler(RuntimeException.class)
	public ModelAndView jspException(Exception e,HttpServletRequest req) {
		System.out.println("e"+e);
		
		Map<String, String[]> arg = req.getParameterMap();
		for(String key: arg.keySet()) {
			System.out.println("key:"+key);
			System.out.println(req.getParameter(key));
		}
		ModelAndView map = new ModelAndView();
		map.setViewName("error");
		return map;
	}
	
}
