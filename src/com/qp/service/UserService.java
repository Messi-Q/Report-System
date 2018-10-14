package com.qp.service;

import java.util.List;

import com.qp.entity.UserInfo;

public interface UserService {
	public int userRegister(UserInfo userinfo);
	public int userUpdate(UserInfo userinfo);
	public UserInfo userLogin(UserInfo userinfo);
	public boolean userExist(String username);
	/**
	 * 根据编号查询菜品详情
	 * @param typeID
	 * @return
	 */
	public List<UserInfo> findId(String cardId);
}
