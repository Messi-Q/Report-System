package com.qp.dao;

import java.util.List;

import com.qp.entity.UserInfo;

public interface UserDao {
	public int userRegister(UserInfo userinfo);
	public int userUpdate(UserInfo userinfo);
	public boolean userExist(String username);
	public UserInfo userLogin(UserInfo userinfo);	
	/**
	 * 根据编号查询菜品详情
	 * @param typeID
	 * @return
	 */
	public List<UserInfo> findId(String cardId);
}
