package com.qp.dao;

import java.util.ArrayList;

import com.qp.entity.Report;

public interface ReportDao {
	public int addReport(Report report);
	public ArrayList<Report> findAll(String cardId);
}
