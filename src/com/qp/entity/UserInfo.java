package com.qp.entity;

/**
 * 用户实体类
 * 
 * @author Administrator
 *
 */
public class UserInfo {
	private Integer stuId;
	private String stuName;
	private String stuPwd;
	private String card;
	private String sex;
	private String age;
	private String userTel;
	private String email;

	public UserInfo() {
	}

	public UserInfo(String name, String pwd, String cardId) {
		super();
		this.stuName = name;
		this.stuPwd = pwd;
		this.card = cardId;
	}

	public UserInfo(Integer stuId, String stuName, String stuPwd) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuPwd = stuPwd;
	}

	public UserInfo(String stuName, String stuPwd) {
		super();
		this.stuName = stuName;
		this.stuPwd = stuPwd;
	}

	public UserInfo(String stuName, String stuPwd, String email, String card) {
		super();
		this.stuName = stuName;
		this.stuPwd = stuPwd;
		this.email = email;
		this.card = card;
	}

	public UserInfo(String stuName, String card, String sex, String age, String userTel, String email) {
		super();
		this.stuName = stuName;
		this.sex = sex;
		this.age = age;
		this.card = card;
		this.userTel = userTel;
		this.email = email;
	}

	public UserInfo(Integer stuId, String stuName, String card, String sex, String age, String userTel,
			String email) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.card = card;
		this.sex = sex;
		this.age = age;
		this.userTel = userTel;
		this.email = email;
	}
	
	public UserInfo(Integer stuId, String stuName, String card, String pwd, String sex, String age, String userTel,
			String email) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuPwd = pwd;
		this.card = card;
		this.sex = sex;
		this.age = age;
		this.userTel = userTel;
		this.email = email;
	}
	
	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuPwd() {
		return stuPwd;
	}

	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserInfo [stuId=" + stuId + ", stuName=" + stuName + ", stuPwd=" + stuPwd + ", card="
				+ card + ", sex=" + sex + ", age=" + age + ", userTel=" + userTel
				+ ", email=" + email + "]";
	}
	
}
