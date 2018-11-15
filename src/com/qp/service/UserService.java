package com.qp.service;

import java.util.List;

import com.qp.entity.TeacherInfo;
import com.qp.entity.UserInfo;

public interface UserService {
	public int userRegister(UserInfo userinfo);
	public int teacherRegister(TeacherInfo teacherinfo);
	public int userUpdate(UserInfo userinfo);
	public int teacherUpdate(TeacherInfo teacherInfo);
	public UserInfo userLogin(UserInfo userinfo);
	public TeacherInfo teacherLogin(TeacherInfo teacherInfo);
	public boolean userExist(String card);
	public boolean teacherExist(String card);
	/**
	 * 根据学号详情
	 * @param typeID
	 * @return
	 */
	public List<UserInfo> findId(String cardId);
	public List<TeacherInfo> findTeId(String cardId);
}
