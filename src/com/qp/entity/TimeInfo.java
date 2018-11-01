package com.qp.entity;

public class TimeInfo {
	private Integer DateId;
	private String DateTi;
	
	public TimeInfo() {
	}
	
	public TimeInfo(String DateTi) {
		this.DateTi = DateTi;
	}
	
	public TimeInfo(Integer DateId, String DateTi) {
		this.DateId = DateId;
		this.DateTi = DateTi;
	}
	
	public Integer getDateId() {
		return DateId;
	}
	public void setDateId(Integer dateId) {
		DateId = dateId;
	}
	public String getDateTi() {
		return DateTi;
	}
	public void setDateTi(String dateTi) {
		DateTi = dateTi;
	}
	
}
