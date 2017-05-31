package org.servlet.annotation.dispatcher.include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * include方法用于将其他资源(Servlet/JSP/HTML)的响应内容包含在本资源(Servlet/JSP)中
 * 调用include方法之后该Servlet/JSP将可以继续执行，被调用的Servlet/JSP的响应内容被包含在调用include方法的位置
 * 并入原资源(Servlet/JSP)的响应内容中一起提交给客户端。
 * url：http://localhost:8080/ck-servlet/annotationIncludeServletA
 *
 * @author CaiXiangning 
 * @date May 29, 2017 
 * @email caixiangning@gmail.com
 */
@SuppressWarnings("serial")
@WebServlet(name="annotationIncludeServletA", urlPatterns="/annotationIncludeServletA")
public class AnnotationIncludeServletA extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("annotationIncludeServletA转发之前内容");
		req.getRequestDispatcher("annotationIncludeServletB").include(req, resp);
		out.println("annotationIncludeServletA转发之后内容");
	}
}
