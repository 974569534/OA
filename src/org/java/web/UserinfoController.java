package org.java.web;

import org.java.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserinfoController {
	
	@Autowired
	private UserinfoService userinfoService;
	
	public String show(){
		return "";
	}
	
}
