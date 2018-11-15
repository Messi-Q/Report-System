package com.qp.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qp.dao.UserDao;
import com.qp.entity.TeacherInfo;
import com.qp.entity.UserInfo;
import com.qp.util.DBUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public int userRegister(UserInfo userinfo) {
		Connection conn = DBUtil.getConn();
		String sql = "insert into stuinfo(StuName,StuPwd,Email,CardId)values(?,?,?,?)";
		int i = DBUtil.executeUpdate(conn, sql, userinfo.getStuName(), userinfo.getStuPwd(), userinfo.getEmail(),
				userinfo.getCard());
		DBUtil.closeConn(conn);
		return i;
	}

	@Override
	public UserInfo userLogin(UserInfo userinfo) {
		UserInfo u = null;
		Connection conn = DBUtil.getConn();
		try {
			String sql = "select * from StuInfo where StuName=? and StuPwd=? and CardId=?";
			ResultSet rs = DBUtil.executeQuery(conn, sql, userinfo.getStuName(), userinfo.getStuPwd(),
					userinfo.getCard());
			// 判断
			if (rs.next()) {
				u = new UserInfo();
				u.setStuId(rs.getInt("StuId"));
				u.setStuName(rs.getString("StuName"));
				u.setStuPwd(rs.getString("StuPwd"));
				u.setCard(rs.getString("CardId"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn);
		}
		return u;
	}

	@Override
	public boolean userExist(String card) {
		boolean flg = true;
		Connection conn = DBUtil.getConn();
		try {
			String sql = "select CardId from stuinfo where CardId=?";
			ResultSet rs = DBUtil.executeQuery(conn, sql, card);
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
		String sql = "update StuInfo set StuName=?,Email=?,CardId=?,Sex=?,Age=?,Tel=? where CardId=?";
		System.out.println(userinfo.getSex());
		int i = DBUtil.executeUpdate(conn, sql, userinfo.getStuName(), userinfo.getEmail(), userinfo.getCard(),
				userinfo.getSex(), userinfo.getAge(), userinfo.getUserTel(), userinfo.getCard());
		DBUtil.closeConn(conn);
		System.out.println(i);
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
				UserInfo a = new UserInfo(rs.getInt("StuId"), rs.getString("StuName"), rs.getString("CardId"),
						rs.getString("StuPwd"), rs.getString("Sex"), rs.getString("Age"), rs.getString("Tel"),
						rs.getString("Email"));
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

	@Override
	public boolean teacherExist(String card) {
		// TODO Auto-generated method stub
		boolean flg = true;
		Connection conn = DBUtil.getConn();
		try {
			String sql = "select CardId from teinfo where CardId=?";
			ResultSet rs = DBUtil.executeQuery(conn, sql, card);
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
	public int teacherRegister(TeacherInfo teacherinfo) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		String sql = "insert into teinfo(TeName,TePwd,Email,CardId)values(?,?,?,?)";
		int i = DBUtil.executeUpdate(conn, sql, teacherinfo.getTeName(), teacherinfo.getTePwd(), teacherinfo.getEmail(),
				teacherinfo.getCard());
		DBUtil.closeConn(conn);
		return i;
	}

	@Override
	public TeacherInfo teacherLogin(TeacherInfo teacherInfo) {
		// TODO Auto-generated method stub
		TeacherInfo u = null;
		Connection conn = DBUtil.getConn();
		try {
			String sql = "select * from TeInfo where TeName=? and TePwd=? and CardId=?";
			ResultSet rs = DBUtil.executeQuery(conn, sql, teacherInfo.getTeName(), teacherInfo.getTePwd(),
					teacherInfo.getCard());
			// 判断
			if (rs.next()) {
				u = new TeacherInfo();
				u.setTeId(rs.getInt("TeId"));
				u.setTeName(rs.getString("TeName"));
				u.setTePwd(rs.getString("TePwd"));
				u.setCard(rs.getString("CardId"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn);
		}
		return u;
	}

	@Override
	public List<TeacherInfo> findTeId(String cardId) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		List<TeacherInfo> list = new ArrayList<TeacherInfo>();

		String sql = "select * from TeInfo where CardId = ?";

		ResultSet rs = DBUtil.executeQuery(conn, sql, cardId);
		try {
			while (rs.next()) {
				TeacherInfo a = new TeacherInfo(rs.getInt("TeId"), rs.getString("TeName"), rs.getString("CardId"),
						rs.getString("TePwd"), rs.getString("Sex"), rs.getString("Age"), rs.getString("Tel"),
						rs.getString("Email"));
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

	@Override
	public int teacherUpdate(TeacherInfo teacherInfo) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		String sql = "update TeInfo set TeName=?,Email=?,CardId=?,Sex=?,Age=?,Tel=? where CardId=?";
		System.out.println(teacherInfo.getSex());
		int i = DBUtil.executeUpdate(conn, sql, teacherInfo.getTeName(), teacherInfo.getEmail(), teacherInfo.getCard(),
				teacherInfo.getSex(), teacherInfo.getAge(), teacherInfo.getTeTel(), teacherInfo.getCard());
		DBUtil.closeConn(conn);
		System.out.println(i);
		return i;
	}

}
