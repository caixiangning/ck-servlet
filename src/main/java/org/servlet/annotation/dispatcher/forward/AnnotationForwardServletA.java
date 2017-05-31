package org.servlet.annotation.dispatcher.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * forward方法用于将请求和响应转发给其他资源(Servlet/JSP/HTML)
 * 调用forward方法之后该Servlet/JSP将不再执行，控制权转移给新的资源，并且如果响应内容没有提交则转发之前的响应内容将被清除
 * url：http://localhost:8080/ck-servlet/annotationForwardServletA
 *
 * @author CaiXiangning 
 * @date May 29, 2017 
 * @email caixiangning@gmail.com
 */
@SuppressWarnings("serial")
@WebServlet(name="annotationForwardServletA", urlPatterns="/annotationForwardServletA")
public class AnnotationForwardServletA extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("annotationForwardServletA转发之前内容");
		req.getRequestDispatcher("annotationForwardServletB").forward(req, resp);
		out.println("annotationForwardServletA转发之后内容");
	}
}
