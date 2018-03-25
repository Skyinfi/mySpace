package com.netease.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netease.course.model.User;
import com.netease.course.service.IUserService;


@Controller
@RequestMapping("/api")
public class UserCotroller {
	
	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping(value="/login")
	public String login(User user) {
		return String.valueOf(userService.login(user));
	}
}
