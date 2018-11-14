package com.qp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qp.entity.AdminInfo;
import com.qp.service.AdminService;
import com.qp.service.impl.*;

/**
 * Servlet implementation class AdminInfoservlet
 */
@WebServlet("/AdminInfoServlet")
public class AdminInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminService as = new AdminServiceImp();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String Name = (String) request.getParameter("adminName");
		String pwd = (String) request.getParameter("pwd");
		String sql = "select * from AdminInfo where AdminName=? and AdminPwd=?";
		List<AdminInfo> rs = as.queryAdmin(sql, Name, pwd);
		String AdminName = null;
		int AdminId = 0;
		if (rs != null && rs.size() > 0) {
			for (int i = 0; i < rs.size(); i++) {
				AdminName = rs.get(i).getAdminName();
				AdminId = rs.get(i).getAdminId();
			}
			
			request.setAttribute("name", AdminName);
			request.setAttribute("AdminId", AdminId);
			request.getSession().setAttribute("name", AdminName);
			request.getRequestDispatcher("adminFrame.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "账号或密码错误");
			request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
		}
	}
}
