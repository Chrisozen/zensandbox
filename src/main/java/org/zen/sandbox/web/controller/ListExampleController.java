package org.zen.sandbox.web.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zen.sandbox.web.formEntity.User;

@Controller
public class ListExampleController {
	@RequestMapping("/bootstraptest")
	public String bootstraptest(Map<String,Object> model) {
		
		return "bootstraptest";
	}
	
	@RequestMapping("/userlist")
	public String userlist(Map<String,Object> model) {
		
		getList(model);
		
		return "userlist";
	}
	
	private void getList(Map<String,Object> model)
	{
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User("Chris","Ozen","3 rue du zen","Janville"));
		userList.add(new User("Chris1","Ozen1","4 rue du zen","Janville1"));
		userList.add(new User("Chris2","Ozen2","5 rue du zen","Janville2"));
		userList.add(new User("Chris3","Ozen3","6 rue du zen","Janville3"));
	
		model.put("userlist", userList);
	}
}
