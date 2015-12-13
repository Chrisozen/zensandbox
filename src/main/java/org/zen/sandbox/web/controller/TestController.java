package org.zen.sandbox.web.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", "aaaaaaaaa");
		
		System.out.println("test");
		
		return "test";
	}
}
