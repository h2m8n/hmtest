package com.plog.web.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plog.web.domain.User;
import com.plog.web.respository.UserRepository;

import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	@Transactional
	public String register(User user) {
		String name = user.getName();
		String pw = user.getPw();
		String email = user.getEmail();
		
		User newUser = new User();
		newUser.setName(name);
		newUser.setPw(pw);
		newUser.setEmail(email);
		
		userRepository.save(newUser);
		
		return "register";
	}

}
