package com.te.tracking.service;

import com.te.tracking.bean.UserInfo;

public interface UserService {

	public UserInfo authenticate(Integer id, String pwd);

	public boolean register(UserInfo info);

}
