package com.plog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plog.web.domain.User;
import com.plog.web.service.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {
	@Autowired
	UserService userService;

	
	@RequestMapping("/register")
	public String register(User user) {
		
		userService.register(user);
		
		return "register";
	}
}
