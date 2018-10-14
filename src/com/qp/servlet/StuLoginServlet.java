package com.qp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qp.entity.UserInfo;
import com.qp.service.UserService;
import com.qp.service.impl.*;

/**
 * Servlet implementation class StuLoginServlet
 */
@WebServlet("/StuLoginServlet")
public class StuLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StuLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//编码
		request.setCharacterEncoding("UTF-8");
		//获取参数的值
		String name = request.getParameter("StuName");
		String pwd = request.getParameter("StuPwd");
		String cardId = request.getParameter("CardId").toString();
		
		UserService userservice = new UserServiceImpl();
		UserInfo i = userservice.userLogin(new UserInfo(name, pwd, cardId));
		
		if (i != null) {
			request.setAttribute("name", name);
			request.setAttribute("cardId", cardId);
			request.getSession().setAttribute("userId", i.getUserId());
			request.getSession().setAttribute("cardId", i.getCardId());
			request.getSession().setAttribute("name", name);
			request.getRequestDispatcher("frame.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "学号、用户名或密码错误");
			request.getRequestDispatcher("stuLogin.jsp").forward(request, response);
		}
	}

}
