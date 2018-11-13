package com.qp.dao;

import java.util.ArrayList;
import java.util.List;

import com.qp.entity.Report;

public interface ReportDao {
	public int addReport(Report report);
	public int deleteReport(int reportId);
	public int updateReport(Report report);
	public ArrayList<Report> findAll(String cardId);
	public ArrayList<Report> findAllReport();
	public ArrayList<Report> findOneRow(int reportId);
	public ArrayList<Report> findSelectOne(int reportId);
	public List<Report> findReportByCardId(String cardId);
	public List<Report> findReportByUserName(String userName);
	public List<Report> findReportBySubmitTime(String submitTime);
	public List<Report> findReportByTitle(String reportTitle);
}
