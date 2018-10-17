package com.qp.service;

import java.util.ArrayList;

import com.qp.entity.Report;

public interface ReportService {
	public int addReport(Report report);
	public int deleteReport(int reportId);
	public int updateReport(Report report);
	public ArrayList<Report> findOneRow(int reportId);
	public ArrayList<Report> findAll(String cardId);
	public ArrayList<Report> findSelectOne(int reportId);
}
