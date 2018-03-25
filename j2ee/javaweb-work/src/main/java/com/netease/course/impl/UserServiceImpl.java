package com.netease.course.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netease.course.dao.IUserDao;
import com.netease.course.model.User;
import com.netease.course.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserDao userDao;
	
	public boolean login(User user) {
		return userDao.selectUser(user) == null?false:true;
	}
}
