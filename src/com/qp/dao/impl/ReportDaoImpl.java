package com.qp.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.qp.dao.ReportDao;
import com.qp.entity.Report;
import com.qp.util.DBUtil;

public class ReportDaoImpl implements ReportDao {

	@Override
	public int addReport(Report report) {
		Connection conn = DBUtil.getConn();
		String sql = "insert into reportinfo(StuCardId, ReportTitle, LastReportCont, ThisReportCont, NextReportCont, ReportTime) values (?, ?, ?, ?, ?, now())";
		int i = DBUtil.executeUpdate(conn, sql, report.getCardId(), report.getReportTitle(), report.getLastReportCont(),
				report.getThisReportCont(), report.getNextReportCont());
		DBUtil.closeConn(conn);
		return i;
	}

	@Override
	public ArrayList<Report> findAll(String cardId) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		ArrayList<Report> list = new ArrayList<Report>();
		try {
			String sql = "select * from reportinfo where StuCardId = ?";
			ResultSet rs = DBUtil.executeQuery(conn, sql, cardId);
			while (rs.next()) {
				Report report = new Report(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7));
				list.add(report);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn);
		}
		return list;
	}

	@Override
	public int deleteReport(int reportId) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		String sql = "delete from reportinfo where ReportId = ?";
		int i = DBUtil.executeUpdate(conn, sql, reportId);
		DBUtil.closeConn(conn);
		return i;
	}

	@Override
	public ArrayList<Report> findOneRow(int reportId) {
		// TODO Auto-generated method stub
		ArrayList<Report> list = new ArrayList<Report>();
		Connection conn = DBUtil.getConn();
		try {
			String sql = "select * from reportinfo where ReportId = ?";
			ResultSet rs = DBUtil.executeQuery(conn, sql, reportId);
			while (rs.next()) {
				Report report = new Report(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7));
				list.add(report);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn);
		}
		return list;
	}

	@Override
	public int updateReport(Report report) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		System.out.println(report);
		String sql = "update reportinfo set ReportTitle=?,LastReportCont=?,ThisReportCont=?,NextReportCont=?,ReportTime=now() where ReportId=?";
		int i = DBUtil.executeUpdate(conn, sql, report.getReportTitle(), report.getLastReportCont(), report.getThisReportCont(), report.getNextReportCont(), report.getReportId());
		System.out.println(i);
		DBUtil.closeConn(conn);
		return i;
	}

	@Override
	public ArrayList<Report> findSelectOne(int reportId) {
		ArrayList<Report> reportList = new ArrayList<Report>();
		Connection conn = DBUtil.getConn();
		try {
			String sql = "select * from reportinfo where ReportId=?";
			ResultSet rs = DBUtil.executeQuery(conn, sql, reportId);
			while (rs.next()) {
				Report report = new Report(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7));
				reportList.add(report);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DBUtil.closeConn(conn);
		}
		return reportList;
	}

}
