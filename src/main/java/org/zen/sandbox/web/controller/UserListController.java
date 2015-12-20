package org.zen.sandbox.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zen.sandbox.persistence.entity.User;
import org.zen.sandbox.services.interfaces.UserService;

@Controller
public class UserListController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/userlist")
	public String userlist(Map<String,Object> model) {
		
		getList(model);
		
		return "userlist";
	}
	
	private void getList(Map<String,Object> model)
	{
		Page<User> userList = userService.findAllUser();
		
		//		Page<User> userList = userService.findByNom("OZen",null);
		
		model.put("userlist", userList.getContent());
	}
}
