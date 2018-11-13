package com.qp.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qp.entity.Report;
import com.qp.service.ReportService;
import com.qp.service.impl.ReportServiceImpl;
import com.qp.service.impl.UserServiceImpl;
import com.qp.util.ItextUtil;

@WebServlet("/ExportServlet")
public class ExportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExportServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type");
		String reportId = request.getParameter("reportId");
		System.out.println(type + reportId);
		response.setContentType("application/octet-stream; charset=UTF-8");
		if ("word".equals(type)) {
			response.setHeader("content-disposition",
					"attachment;filename=" + new SimpleDateFormat("yyyyMMddHH:mm:ss").format(new Date()) + ".doc");
		} else if ("pdf".equals(type)) {
			response.setHeader("content-disposition",
					"attachment;filename=" + new SimpleDateFormat("yyyyMMddHH:mm:ss").format(new Date()) + ".pdf");
		}

		ReportService reportService = new ReportServiceImpl();
		OutputStream out = response.getOutputStream();
		ItextUtil itex = null;
		try {
			itex = ItextUtil.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Report> report = reportService.findSelectOne(Integer.parseInt(reportId));
		List<String> imageList = new ArrayList<String>();

		boolean result = itex.createRtfContext(report, imageList, out, type);
		if (result) {
//			request.setAttribute("teacherInfo", teacherInfo);
			request.getRequestDispatcher("usercenter.jsp").forward(request, response);
		} else {
			System.out.println("导出失败");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
