package com.qp.dao.impl;

import java.sql.Connection;

import com.qp.dao.TimeDao;
import com.qp.util.DBUtil;

public class TimeDaoImpl implements TimeDao{

	@Override
	public int insertTime(String Time) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		String sql = "insert into dateinfo(DateTi)values(?)";
		int i = DBUtil.executeUpdate(conn, sql, Time);
		DBUtil.closeConn(conn);
		return i;
	}

}
