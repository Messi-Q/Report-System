package com.qp.service;

import java.util.ArrayList;

import com.qp.entity.Report;

public interface ReportService {
	public int addReport(Report report);
	public ArrayList<Report> findAll(String cardId);
}
