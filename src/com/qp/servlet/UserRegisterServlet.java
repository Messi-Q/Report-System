package com.qp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qp.entity.TeacherInfo;
import com.qp.entity.UserInfo;
import com.qp.service.UserService;
import com.qp.service.impl.UserServiceImpl;

@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserRegisterServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 编码
		request.setCharacterEncoding("UTF-8");
		// 获取参数的值
		String name = request.getParameter("UserName");
		String pwd = request.getParameter("UserPwd");
		String email = request.getParameter("Email");
		String card = request.getParameter("Card");
		String regist = request.getParameter("Regist");
		
		if (regist.equals("学生注册")) {
			System.out.println("学生注册");
			// 封装：将用户输入的值封装成一个实体类对象
			UserInfo userinfo = new UserInfo(name, pwd, email, card);
			// 调用业务层
			UserService userservice = new UserServiceImpl();

			boolean flg = userservice.userExist(userinfo.getCard());

			if (flg) {
				request.setAttribute("error", "Accunt Existed!");
				request.getRequestDispatcher("regist.jsp").forward(request, response);
			} else {
				int i = userservice.userRegister(userinfo);
				if (i > 0) {
					request.getRequestDispatcher("success.jsp").forward(request, response);
				}
			}
		} else if (regist.equals("教师注册")) {
			System.out.println("教师注册");
			TeacherInfo teacherinfo = new TeacherInfo(name, pwd, email, card);
			// 调用业务层
			UserService userservice = new UserServiceImpl();
			
			boolean flg = userservice.teacherExist(teacherinfo.getCard());
			
			if (flg) {
				request.setAttribute("error", "Accunt Existed!");
				request.getRequestDispatcher("regist.jsp").forward(request, response);
			} else {
				int i = userservice.teacherRegister(teacherinfo);
				if (i > 0) {
					request.getRequestDispatcher("success.jsp").forward(request, response);
				}
			}
		}

	}

}
