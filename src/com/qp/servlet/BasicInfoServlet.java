package com.qp.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qp.entity.TeacherInfo;
import com.qp.entity.UserInfo;
import com.qp.service.UserService;
import com.qp.service.impl.UserServiceImpl;

/**
 * Servlet implementation class BasicInfoUpdateServlet
 */
@WebServlet("/BasicInfoServlet")
public class BasicInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BasicInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String opt = request.getParameter("opt");
		if (opt.equals("updateInfo")) {
			this.updateInfo(request, response);
		} else if (opt.equals("find")) {
			this.find(request, response);
		} else if (opt.equals("finds")) {
			this.finds(request, response);
		} else if (opt.equals("findTeacher")) {
			this.findTeacher(request, response);
		} else if (opt.equals("findsTeacher")) {
			this.findsTeacher(request, response);
		} else if (opt.equals("updateTeInfo")) {
			this.updateTeInfo(request, response);
		}

	}

	private void updateTeInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 编码
		request.setCharacterEncoding("UTF-8");
		// 获取参数的值
		String teName = request.getParameter("TeName");
		String cardId = request.getParameter("CardId");
		String sex = request.getParameter("Sex");
		String age = request.getParameter("Age");
		String tel = request.getParameter("TeTel");
		String email = request.getParameter("Email");

		TeacherInfo teacherInfo = new TeacherInfo(teName, cardId, sex, age, tel, email);

		int i = this.userService.teacherUpdate(teacherInfo);
		if (i > 0) {
			this.find(request, response);
		}
	}

	private void findsTeacher(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 编码
		request.setCharacterEncoding("UTF-8");
		// 获取参数的值
		String cardId = request.getParameter("cardId");

		UserService userservice = new UserServiceImpl();
		List<TeacherInfo> teacherInfo = userservice.findTeId(cardId);

		request.setAttribute("teacherInfo", teacherInfo);
		request.getRequestDispatcher("updateTeInfo.jsp").forward(request, response);
	}

	private void findTeacher(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 编码
		request.setCharacterEncoding("UTF-8");
		// 获取参数的值
		String cardId = request.getParameter("cardId");

		UserService userservice = new UserServiceImpl();
		List<TeacherInfo> teacherInfo = userservice.findTeId(cardId);

		request.setAttribute("teacherInfo", teacherInfo);
		request.getRequestDispatcher("teacherInfo.jsp").forward(request, response);

	}

	private void updateInfo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 编码
		request.setCharacterEncoding("UTF-8");
		// 获取参数的值
		String stuName = request.getParameter("StuName");
		String cardId = request.getParameter("CardId");
		String sex = request.getParameter("Sex");
		String age = request.getParameter("Age");
		String tel = request.getParameter("UserTel");
		String email = request.getParameter("Email");

		UserInfo userInfo = new UserInfo(stuName, cardId, sex, age, tel, email);

		int i = this.userService.userUpdate(userInfo);
		if (i > 0) {
			this.find(request, response);
		}

	}

	protected void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 编码
		request.setCharacterEncoding("UTF-8");
		// 获取参数的值
		String cardId = request.getParameter("cardId");

		UserService userservice = new UserServiceImpl();
		List<UserInfo> userInfo = userservice.findId(cardId);

		request.setAttribute("userInfo", userInfo);
		request.getRequestDispatcher("userInfo.jsp").forward(request, response);
	}

	protected void finds(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 编码
		request.setCharacterEncoding("UTF-8");
		// 获取参数的值
		String cardId = request.getParameter("cardId");

		UserService userservice = new UserServiceImpl();
		List<UserInfo> userInfo = userservice.findId(cardId);

		request.setAttribute("userInfo", userInfo);
		request.getRequestDispatcher("updateInfo.jsp").forward(request, response);
	}

}
