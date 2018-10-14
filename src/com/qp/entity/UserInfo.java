package com.qp.entity;

/**
 * 用户实体类
 * 
 * @author Administrator
 *
 */
public class UserInfo {
	private Integer UserId;
	private String UserName;
	private String UserPwd;
	private String Card;
	private String Sex;
	private String Age;
	private String UserTel;
	private String Email;

	public UserInfo() {
	}

	public UserInfo(String name, String pwd, String cardId) {
		super();
		UserName = name;
		UserPwd = pwd;
		Card = cardId;
	}

	public UserInfo(Integer userId, String userName, String userPwd) {
		super();
		UserId = userId;
		UserName = userName;
		UserPwd = userPwd;
	}

	public UserInfo(String userName, String userPwd) {
		super();
		UserName = userName;
		UserPwd = userPwd;
	}

	public UserInfo(String userName, String userPwd, String email, String card) {
		super();
		UserName = userName;
		UserPwd = userPwd;
		Email = email;
		Card = card;
	}

	public UserInfo(String userName, String sex, String card, String age, String userTel, String email) {
		super();
		UserName = userName;
		Sex = sex;
		Age = age;
		Card = card;
		UserTel = userTel;
		Email = email;
	}

	public UserInfo(Integer userId, String userName, String userPwd, String sex, String age, String userTel,
			String email) {
		super();
		UserId = userId;
		UserName = userName;
		UserPwd = userPwd;
		Sex = sex;
		Age = age;
		UserTel = userTel;
		Email = email;
	}

	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer Userid) {
		UserId = Userid;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserPwd() {
		return UserPwd;
	}

	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getUserTel() {
		return UserTel;
	}

	public void setUserTel(String userTel) {
		UserTel = userTel;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCardId() {
		return Card;
	}

	public void setCardId(String card) {
		Card = card;
	}

}
