package com.netease.course.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.netease.course.dao.IContentDao;
import com.netease.course.model.Context;

public class ContextServiceImpl implements IContentDao{
	@Autowired
	private IContentDao iContentDao;

	public Context ShowContext(Context context, int temp) {
		// TODO Auto-generated method stub
		return iContentDao.ShowContext(context, temp);
	}
	
	
}
