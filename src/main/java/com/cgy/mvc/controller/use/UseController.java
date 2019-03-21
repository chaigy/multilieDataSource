package com.cgy.mvc.controller.use;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgy.mvc.server.UseService;

@RestController
public class UseController {
	
	@Autowired
	private UseService useService;
	
	
	@GetMapping("/cgy")
	public String insert(String name,String pwd) {
		useService.insertCgy(name, pwd);
		return "success";
	}
	@GetMapping("/cgy1")
	public String insert1(String name,String pwd) {
		useService.insertCgy1(name, pwd);
		return "success";
	}
	
	@GetMapping("/cgy2")
	public String insert2(String name,String pwd) {
		useService.insert(name, pwd);
		return "success";
	}
	
	@GetMapping("get")
	public Object get(int page,int pageSize) {
		Object ret = useService.getInfo();
		return ret;
	}
	
}
