package com.qp.service.impl;

import java.util.ArrayList;

import com.qp.dao.ReportDao;
import com.qp.dao.impl.ReportDaoImpl;
import com.qp.entity.Report;
import com.qp.service.ReportService;

public class ReportServiceImpl implements ReportService{
	ReportDao reportDao = new ReportDaoImpl();
	
	@Override
	public int addReport(Report report) {
		return reportDao.addReport(report);
	}

	@Override
	public ArrayList<Report> findAll(String cardId) {
		// TODO Auto-generated method stub
		return reportDao.findAll(cardId);
	}
}
