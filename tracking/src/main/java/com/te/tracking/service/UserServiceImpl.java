package com.te.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.tracking.bean.UserInfo;
import com.te.tracking.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired(required = false)
	private UserDao dao;

	@Override
	public UserInfo authenticate(Integer id, String password) {
		if (id < 0) {
			return null;
		}
		return dao.authenticate(id, password);

	}

	@Override
	public boolean register(UserInfo info) {
		return dao.register(info);
	}

}
