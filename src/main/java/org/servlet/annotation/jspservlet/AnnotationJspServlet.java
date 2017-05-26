package org.servlet.annotation.jspservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * 使用JSP+Servlet的Servlet程序
 * url:http://localhost:8080/ck-servlet/annoJspServlet
 * 
 * @author CaiXiangNing
 * @date May 26, 2017
 * @email caixiangning@gmail.com
 */
@SuppressWarnings("serial")
@WebServlet("/annoJspServlet")
public class AnnotationJspServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 转发或者重定向到JSP如果使用相对路径则都是相对于webapp目录，所以这里使用WEB-INF作为相对路径开始目录
		req.getRequestDispatcher("WEB-INF/jsp/xmljsp.jsp").forward(req, resp);
	}
}
