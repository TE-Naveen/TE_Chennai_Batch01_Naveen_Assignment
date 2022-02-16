package com.te.tracking.dao;

import com.te.tracking.bean.UserInfo;

public interface UserDao {

	public UserInfo authenticate(Integer id, String password);

	public boolean register(UserInfo info);
}
