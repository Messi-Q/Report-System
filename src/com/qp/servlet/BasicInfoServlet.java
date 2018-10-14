package com.qp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qp.entity.UserInfo;
import com.qp.service.UserService;
import com.qp.service.impl.UserServiceImpl;

/**
 * Servlet implementation class BasicInfoUpdateServlet
 */
@WebServlet("/BasicInfoServlet")
public class BasicInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BasicInfoServlet() {
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
		// 编码
		request.setCharacterEncoding("UTF-8");
		// 获取参数的值
		String cardId = request.getParameter("cardId");
		System.out.println(cardId);
		
		UserService userservice = new UserServiceImpl();
		List<UserInfo> userInfo = userservice.findId(cardId);
		
		request.setAttribute("userInfo",userInfo);
		request.getRequestDispatcher("userInfo.jsp").forward(request, response);
	}

}
