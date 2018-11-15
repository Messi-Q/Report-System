package com.qp.dao;

import java.util.List;

import com.qp.entity.TeacherInfo;
import com.qp.entity.UserInfo;

public interface UserDao {
	public int userRegister(UserInfo userinfo);
	public int teacherRegister(TeacherInfo teacherinfo);
	public int userUpdate(UserInfo userinfo);
	public int teacherUpdate(TeacherInfo teacherInfo);
	public boolean userExist(String card);
	public boolean teacherExist(String card);
	public UserInfo userLogin(UserInfo userinfo);
	public TeacherInfo teacherLogin(TeacherInfo teacherInfo);
	/**
	 * 根据学号详情
	 * @param typeID
	 * @return
	 */
	public List<UserInfo> findId(String cardId);
	public List<TeacherInfo> findTeId(String cardId);
}
