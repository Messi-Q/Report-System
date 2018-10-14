package com.qp.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qp.dao.UserDao;
import com.qp.entity.AdminInfo;
import com.qp.entity.UserInfo;
import com.qp.util.DBUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public int userRegister(UserInfo userinfo) {
		Connection conn = DBUtil.getConn();
		String sql = "insert into stuinfo(StuName,StuPwd,Email,CardId)values(?,?,?,?)";
		int i = DBUtil.executeUpdate(conn, sql, userinfo.getUserName(), userinfo.getUserPwd(), userinfo.getEmail(),
				userinfo.getCardId());
		DBUtil.closeConn(conn);
		return i;
	}

	@Override
	public UserInfo userLogin(UserInfo userinfo) {
		UserInfo u = null;
		Connection conn = DBUtil.getConn();
		try {
			String sql = "select * from StuInfo where StuName=? and StuPwd=? and CardId=?";
			ResultSet rs = DBUtil.executeQuery(conn, sql, userinfo.getUserName(), userinfo.getUserPwd(),
					userinfo.getCardId());
			// 判断
			if (rs.next()) {
				u = new UserInfo();
				u.setUserId(rs.getInt("StuId"));
				u.setUserName(rs.getString("StuName"));
				u.setUserPwd(rs.getString("StuPwd"));
				u.setCardId(rs.getString("CardId"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn);
		}
		return u;
	}

	@Override
	public boolean userExist(String username) {
		boolean flg = true;
		Connection conn = DBUtil.getConn();
		try {
			String sql = "select StuName from stuinfo where StuName=?";
			ResultSet rs = DBUtil.executeQuery(conn, sql, username);
			if (rs.next()) {
				flg = true;
			} else {
				flg = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn);
		}
		return flg;
	}

	@Override
	public int userUpdate(UserInfo userinfo) {
		Connection conn = DBUtil.getConn();
		String sql = "update UserInfo set UserName=?,UserPwd=? where UserId=?";
		int i = DBUtil.executeUpdate(conn, sql, userinfo.getUserName(), userinfo.getUserPwd(), userinfo.getUserId());
		DBUtil.closeConn(conn);
		return i;
	}

	@Override
	public List<UserInfo> findId(String cardId) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		List<UserInfo> list = new ArrayList<UserInfo>();

		String sql = "select * from StuInfo where CardId = ?";

		ResultSet rs = DBUtil.executeQuery(conn, sql, cardId);
		try {
			while (rs.next()) {
				UserInfo a = new UserInfo(rs.getString("StuName"), rs.getString("Email"), rs.getString("CardId"),
						rs.getString("Sex"), rs.getString("Age"), rs.getString("Tel"));
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn);
		}
		return list;
	}

}
