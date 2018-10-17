package com.qp.dao;

import java.util.ArrayList;

import com.qp.entity.Report;

public interface ReportDao {
	public int addReport(Report report);
	public int deleteReport(int reportId);
	public int updateReport(Report report);
	public ArrayList<Report> findAll(String cardId);
	public ArrayList<Report> findOneRow(int reportId);
	public ArrayList<Report> findSelectOne(int reportId);
}
