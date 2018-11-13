package com.qp.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.qp.dao.ReportDao;
import com.qp.entity.Report;
import com.qp.util.DBUtil;

public class ReportDaoImpl implements ReportDao {

	@Override
	public int addReport(Report report) {
		Connection conn = DBUtil.getConn();
		String sql = "insert into reportinfo(StuCardId, StuName, ReportTitle, LastReportCont, ThisReportCont, NextReportCont, ReportTime) values (?, ?, ?, ?, ?, ?, now())";
		int i = DBUtil.executeUpdate(conn, sql, report.getCardId(), report.getStuName(), report.getReportTitle(), report.getLastReportCont(),
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
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
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
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
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
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
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

	@Override
	public List<Report> findReportByCardId(String cardId) {
		// TODO Auto-generated method stub
		ArrayList<Report> reportList = new ArrayList<Report>();
		Connection conn = DBUtil.getConn();
		try {
			String sql = "select * from reportinfo where StuCardId=?";
			ResultSet rs = DBUtil.executeQuery(conn, sql, cardId);
			while (rs.next()) {
				Report report = new Report(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(8));
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

	@Override
	public List<Report> findReportByUserName(String userName) {
		// TODO Auto-generated method stub
		ArrayList<Report> reportList = new ArrayList<Report>();
		Connection conn = DBUtil.getConn();
		try {
			String sql = "select * from reportinfo where StuName like ? order by StuName";
			ResultSet rs = DBUtil.executeQuery(conn, sql, "%" + userName + "%");
			while (rs.next()) {
				Report report = new Report(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(8));
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

	@Override
	public List<Report> findReportBySubmitTime(String submitTime) {
		// TODO Auto-generated method stub
		return findUserReport(submitTime);
	}
	
	private List<Report> findUserReport(Object submitTime) {
		ArrayList<Report> reportList = new ArrayList<Report>();
		Connection conn = DBUtil.getConn();
		try {
			ResultSet rs = null;
			String sql = "select * from reportinfo where ReportTime > ? and ReportTime < date_add(?,interval 1 day) order by ReportTime";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
			if (submitTime == null)
				submitTime = new Date();
			if (submitTime instanceof java.util.Date) {
				rs = DBUtil.executeQuery(conn, sql, sdf.format(submitTime), sdf.format(submitTime));
			}
			if (submitTime instanceof String) {
				rs = DBUtil.executeQuery(conn, sql, submitTime, submitTime);
			}
			while (rs.next()) {
				Report report = new Report(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(8));
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

	@Override
	public ArrayList<Report> findAllReport() {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		ArrayList<Report> list = new ArrayList<Report>();
		try {
			String sql = "select * from reportinfo";
			ResultSet rs = DBUtil.executeQuery(conn, sql);
			while (rs.next()) {
				Report report = new Report(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
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
	public List<Report> findReportByTitle(String reportTitle) {
		// TODO Auto-generated method stub
		ArrayList<Report> reportList = new ArrayList<Report>();
		Connection conn = DBUtil.getConn();
		try {
			String sql = "select * from reportinfo where ReportTitle like ? order by ReportTitle";
			ResultSet rs = DBUtil.executeQuery(conn, sql, "%" + reportTitle + "%");
			while (rs.next()) {
				Report report = new Report(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(8));
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
