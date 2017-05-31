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
 * 
 *
 * @author CaiXiangning 
 * @date May 29, 2017 
 * @email caixiangning@gmail.com
 */
@SuppressWarnings("serial")
@WebServlet(name="annotationIncludeServletB", urlPatterns="/annotationIncludeServletB")
public class AnnotationIncludeServletB extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("annotationIncludeServletA转发到annotationIncludeServletB后annotationIncludeServletB处理部分");
	}
}
