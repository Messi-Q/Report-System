package com.qp.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

}
