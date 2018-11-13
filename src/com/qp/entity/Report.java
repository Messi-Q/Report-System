package com.qp.entity;

public class Report {
	private int reportId;
	private String cardId;
	private String stuName;
	private String reportTitle;
	private String lastReportCont;
	private String thisReportCont;
	private String nextReportCont;
	private String reportTime;

	public Report() {
	}

	public Report(int reportId, String stuName, String reportTitle, String lastReportCont, String thisReportCont,
			String nextReportCont) {
		super();
		this.reportId = reportId;
		this.stuName = stuName;
		this.reportTitle = reportTitle;
		this.lastReportCont = lastReportCont;
		this.thisReportCont = thisReportCont;
		this.nextReportCont = nextReportCont;
	}
	
	public Report(int reportId, String cardId, String stuName, String reportTitle, String reportTime) {
		super();
		this.reportId = reportId;
		this.cardId = cardId;
		this.stuName = stuName;
		this.reportTitle = reportTitle;
		this.reportTime = reportTime;
	}
	
	public Report(String cardId, String stuName, String reportTitle, String lastReportCont, String thisReportCont,
			String nextReportCont) {
		super();
		this.cardId = cardId;
		this.stuName = stuName;
		this.reportTitle = reportTitle;
		this.lastReportCont = lastReportCont;
		this.thisReportCont = thisReportCont;
		this.nextReportCont = nextReportCont;
	}
	
	public Report(String cardId, String reportTitle, String lastReportCont, String thisReportCont,
			String nextReportCont) {
		super();
		this.cardId = cardId;
		this.reportTitle = reportTitle;
		this.lastReportCont = lastReportCont;
		this.thisReportCont = thisReportCont;
		this.nextReportCont = nextReportCont;
	}

	public Report(int reportId, String cardId, String reportTitle, String reportTime) {
		super();
		this.reportId = reportId;
		this.cardId = cardId;
		this.reportTitle = reportTitle;
		this.reportTime = reportTime;
	}
	
	public Report(int reportId, String cardId, String stuName, String reportTitle, String lastReportCont, String thisReportCont, String nextReportCont,
			String reportTime) {
		super();
		this.reportId = reportId;
		this.cardId = cardId;
		this.stuName = stuName;
		this.reportTitle = reportTitle;
		this.lastReportCont = lastReportCont;
		this.thisReportCont = thisReportCont;
		this.nextReportCont = nextReportCont;
		this.reportTime = reportTime;
	}

	public int getReportId() {
		return reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getReportTitle() {
		return reportTitle;
	}

	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}

	public String getLastReportCont() {
		return lastReportCont;
	}

	public void setLastReportCont(String lastReportCont) {
		this.lastReportCont = lastReportCont;
	}

	public String getThisReportCont() {
		return thisReportCont;
	}

	public void setThisReportCont(String thisReportCont) {
		this.thisReportCont = thisReportCont;
	}

	public String getNextReportCont() {
		return nextReportCont;
	}

	public void setNextReportCont(String nextReportCont) {
		this.nextReportCont = nextReportCont;
	}

	public String getReportTime() {
		return reportTime;
	}

	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}

}
