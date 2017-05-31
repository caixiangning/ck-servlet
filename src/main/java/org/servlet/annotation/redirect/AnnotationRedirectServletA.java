package org.servlet.annotation.redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 
 * url：http://localhost:8080/ck-servlet/annotationRedirectServletA
 *
 * @author CaiXiangning 
 * @date May 29, 2017 
 * @email caixiangning@gmail.com
 */
@SuppressWarnings("serial")
@WebServlet(name="annotationRedirectServletA", urlPatterns="/annotationRedirectServletA")
public class AnnotationRedirectServletA extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("annotationRedirectServletA重定向之前内容");
		resp.sendRedirect("annotationRedirectServletB");
		out.println("annotationRedirectServletA重定向之后内容");
	}
}
