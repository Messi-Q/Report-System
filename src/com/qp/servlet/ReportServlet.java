package com.qp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qp.entity.Report;
import com.qp.service.ReportService;
import com.qp.service.impl.ReportServiceImpl;
import com.qp.util.DBUtil;

/**
 * Servlet implementation class ReportServlet
 */
@WebServlet("/ReportServlet")
public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReportServlet() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 编码
		request.setCharacterEncoding("UTF-8");
		String opt = request.getParameter("opt");

		if (opt.equals("add")) {
			this.add(request, response);
		} else if (opt.equals("findAll")) {
			this.findAll(request, response);
		} else if (opt.equals("delete")) {
			this.delete(request, response);
		} else if (opt.equals("doUpdate")) {
			this.doUpdate(request, response);
		} else if (opt.equals("doSelectOne")) {
			this.doSelectOne(request, response);
		} else if (opt.equals("upload")) {
			this.upload(request, response);
		} else if (opt.equals("toUpdate")) {
			this.toUpdate(request, response);
		}
	}

	private void toUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String reportId = request.getParameter("reportId");
		ReportService reportService = new ReportServiceImpl();
		ArrayList<Report> reportList = reportService.findOneRow(Integer.parseInt(reportId));
		request.setAttribute("reportList", reportList);
		request.getRequestDispatcher("updateReport.jsp").forward(request, response);

	}

	// 跳转到addReport.jsp页面
	private void upload(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cardId = request.getParameter("cardId");

		request.setAttribute("cardId", cardId);
		request.getRequestDispatcher("addReport.jsp").forward(request, response);

	}

	private void doSelectOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String reportId = request.getParameter("reportId");
		ReportService reportService = new ReportServiceImpl();
		ArrayList<Report> reportList = reportService.findSelectOne(Integer.parseInt(reportId));
		request.setAttribute("reportList", reportList);
		request.getRequestDispatcher("report.jsp").forward(request, response);
	}

	private void doUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cardId = request.getParameter("cardId");
		String reportId = request.getParameter("reportId");
		String reportTitle = request.getParameter("reportTitle");
		String lastReportCont = request.getParameter("lastReportCont");
		String thisReportCont = request.getParameter("thisReportCont");
		String nextReportCont = request.getParameter("nextReportCont");
		
		Report report = new Report(Integer.parseInt(reportId), reportTitle, lastReportCont, thisReportCont, nextReportCont);
		
		ReportService reportService = new ReportServiceImpl();
		int i = reportService.updateReport(report);
		if (i > 0) {
			request.setAttribute("cardId", cardId);
			this.findAll(request, response);
		}
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cardId = request.getParameter("cardId");
		String reportId = request.getParameter("reportId");
		ReportService reportService = new ReportServiceImpl();
		int i = reportService.deleteReport(Integer.parseInt(reportId));
		if (i > 0) {
			request.setAttribute("cardId", cardId);
			this.findAll(request, response);
		}
	}

	// 查询
	private void findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cardId = request.getParameter("cardId");
		ReportService reportService = new ReportServiceImpl();
		ArrayList<Report> reportList = reportService.findAll(cardId);
		request.setAttribute("reportList", reportList);
		request.getRequestDispatcher("reportList.jsp").forward(request, response);
	}

	// 添加周报
	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cardId = request.getParameter("cardId");
		String reportTitle = request.getParameter("reportTitle");
		String lastReportCont = request.getParameter("lastReportCont");
		String thisReportCont = request.getParameter("thisReportCont");
		String nextReportCont = request.getParameter("nextReportCont");

		Report report = new Report(cardId, reportTitle, lastReportCont, thisReportCont, nextReportCont);

		ReportService reportService = new ReportServiceImpl();

		int i = reportService.addReport(report);

		if (i > 0) {
			request.setAttribute("cardId", cardId);
			this.findAll(request, response);
		}
	}

}
