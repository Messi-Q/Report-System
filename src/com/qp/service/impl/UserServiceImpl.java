package com.qp.service.impl;

import java.util.List;

import com.qp.dao.UserDao;
import com.qp.dao.impl.UserDaoImpl;
import com.qp.entity.TeacherInfo;
import com.qp.entity.UserInfo;
import com.qp.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userdao=new UserDaoImpl();
	
	@Override
	public int userRegister(UserInfo userinfo) {
		return userdao.userRegister(userinfo);
	}

	@Override
	public UserInfo userLogin(UserInfo userinfo) {
		return userdao.userLogin(userinfo);
	}

	@Override
	public boolean userExist(String card) {
		return userdao.userExist(card);
	}

	@Override
	public int userUpdate(UserInfo userinfo) {
		return userdao.userUpdate(userinfo);
	}

	@Override
	public List<UserInfo> findId(String cardId) {
		// TODO Auto-generated method stub
		UserDao user = new UserDaoImpl();
		List<UserInfo> list=user.findId(cardId);
		return list;
	}

	@Override
	public boolean teacherExist(String card) {
		// TODO Auto-generated method stub
		return userdao.teacherExist(card);
	}

	@Override
	public int teacherRegister(TeacherInfo teacherinfo) {
		// TODO Auto-generated method stub
		return userdao.teacherRegister(teacherinfo);
	}

	@Override
	public TeacherInfo teacherLogin(TeacherInfo teacherInfo) {
		// TODO Auto-generated method stub
		return userdao.teacherLogin(teacherInfo);
	}

	@Override
	public List<TeacherInfo> findTeId(String cardId) {
		// TODO Auto-generated method stub
		UserDao user = new UserDaoImpl();
		List<TeacherInfo> list=user.findTeId(cardId);
		return list;
	}

	@Override
	public int teacherUpdate(TeacherInfo teacherInfo) {
		// TODO Auto-generated method stub
		return userdao.teacherUpdate(teacherInfo);
	}

}
