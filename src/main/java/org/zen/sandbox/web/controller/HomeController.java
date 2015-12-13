package org.zen.sandbox.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Controller
public class HomeController extends BaseController {
	
	@Value("${application.message:Hello World}")
	private String message;
	
	private final RequestMappingHandlerMapping handlerMapping;
	
	@Autowired
	 public HomeController(RequestMappingHandlerMapping handlerMapping) {
	  this.handlerMapping = handlerMapping;
	 }
	
	@RequestMapping("/map")
	public String map(Map<String, Object> model) {
		
		Set<RequestMappingInfo> rmSet = handlerMapping.getHandlerMethods().keySet();
		
		List<String> paramList = rmSet.stream()
				.map(rm -> rm.getPatternsCondition().getPatterns().iterator().next())
				.collect(Collectors.toList());
				
		model.put("paramList",paramList);
		
		return "map";
	}
	
	@RequestMapping("/bootstraptest")
	public String bootstraptest() {
		return "bootstraptest";
	}
	
	@RequestMapping("/home")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", "aaaaaaaaa");
		
		
		logger.info("Home Controller !");
		
		return "home";
	}
	
	@RequestMapping("/jsontest") 
    public @ResponseBody Map<String, String> callSomething () {
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("url", "http://www.emule-zenzone.com");
        map.put("message", message);
        
        return map;
    }
}
