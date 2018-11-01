package com.qp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qp.entity.TimeInfo;
import com.qp.service.TimeService;
import com.qp.service.impl.TimeServiceImpl;

/**
 * Servlet implementation class SetTimeServlet
 */
@WebServlet("/SetTimeServlet")
public class SetTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SetTimeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 编码
		request.setCharacterEncoding("UTF-8");
		// 获取参数的值
		String date = request.getParameter("date");
		System.out.println(date);
				
		TimeService timeService = new TimeServiceImpl();
		
		int i = timeService.insertTime(date);
		
		if (i > 0) {
			request.setAttribute("date", date);
			request.getRequestDispatcher("teacherInfo.jsp").forward(request, response);
		}
		
	}

}
