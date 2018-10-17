package com.qp.entity;

public class TeacherInfo {
	private Integer teId;
	private String teName;
	private String tePwd;
	private String card;
	private String sex;
	private String age;
	private String teTel;
	private String email;
	
	public TeacherInfo() {
	}

	public TeacherInfo(String name, String pwd, String cardId) {
		super();
		this.teName = name;
		this.tePwd = pwd;
		this.card = cardId;
	}

	public TeacherInfo(Integer teId, String teName, String tePwd) {
		super();
		this.teId = teId;
		this.teName = teName;
		this.tePwd = tePwd;
	}

	public TeacherInfo(String teName, String tePwd) {
		super();
		this.teName = teName;
		this.tePwd = tePwd;
	}

	public TeacherInfo(String teName, String tePwd, String email, String card) {
		super();
		this.teName = teName;
		this.tePwd = tePwd;
		this.email = email;
		this.card = card;
	}

	public TeacherInfo(String teName, String card, String sex, String age, String teTel, String email) {
		super();
		this.teName = teName;
		this.sex = sex;
		this.age = age;
		this.card = card;
		this.teTel = teTel;
		this.email = email;
	}

	public TeacherInfo(Integer teId, String teName, String card, String sex, String age, String teTel,
			String email) {
		super();
		this.teId = teId;
		this.teName = teName;
		this.card = card;
		this.sex = sex;
		this.age = age;
		this.teTel = teTel;
		this.email = email;
	}
	
	public TeacherInfo(Integer teId, String teName, String card, String pwd, String sex, String age, String teTel,
			String email) {
		super();
		this.teId = teId;
		this.teName = teName;
		this.tePwd = pwd;
		this.card = card;
		this.sex = sex;
		this.age = age;
		this.teTel = teTel;
		this.email = email;
	}
	
	public Integer getTeId() {
		return teId;
	}
	public void setTeId(Integer teId) {
		this.teId = teId;
	}
	public String getTeName() {
		return teName;
	}
	public void setTeName(String teName) {
		this.teName = teName;
	}
	public String getTePwd() {
		return tePwd;
	}
	public void setTePwd(String tePwd) {
		this.tePwd = tePwd;
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
	public String getTeTel() {
		return teTel;
	}
	public void setTeTel(String teTel) {
		this.teTel = teTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
