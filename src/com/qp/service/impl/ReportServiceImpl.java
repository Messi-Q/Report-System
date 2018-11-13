package com.qp.service.impl;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public int deleteReport(int reportId) {
		// TODO Auto-generated method stub
		return reportDao.deleteReport(reportId);
	}

	@Override
	public ArrayList<Report> findOneRow(int reportId) {
		// TODO Auto-generated method stub
		return reportDao.findOneRow(reportId);
	}

	@Override
	public int updateReport(Report report) {
		// TODO Auto-generated method stub
		return reportDao.updateReport(report);
	}

	@Override
	public ArrayList<Report> findSelectOne(int reportId) {
		// TODO Auto-generated method stub
		return reportDao.findSelectOne(reportId);
	}

	@Override
	public List<Report> findReportByCardId(String cardId) {
		// TODO Auto-generated method stub
		return reportDao.findReportByCardId(cardId);
	}

	@Override
	public List<Report> findReportByUserName(String userName) {
		// TODO Auto-generated method stub
		return reportDao.findReportByUserName(userName);
	}

	@Override
	public List<Report> findReportBySubmitTime(String submitTime) {
		// TODO Auto-generated method stub
		return reportDao.findReportBySubmitTime(submitTime);
	}

	@Override
	public ArrayList<Report> findAllReport() {
		// TODO Auto-generated method stub
		return reportDao.findAllReport();
	}

	@Override
	public List<Report> findReportByTitle(String reportTitle) {
		// TODO Auto-generated method stub
		return reportDao.findReportByTitle(reportTitle);
	}
}
