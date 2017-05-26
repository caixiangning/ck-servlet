package org.servlet.annotation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 创建一个Servlet程序(使用注解方式配置映射关系)
 * url：http://localhost:8080/ck-servlet/annoServlet
 *
 * @author CaiXiangning 
 * @date May 26, 2017 
 * @email caixiangning@gmail.com
 */
@SuppressWarnings("serial")
@WebServlet(name="annoServlet", urlPatterns="/annoServlet")
// @WebServlet(name="annoServlet", value="/annoServlet")
// @WebServlet("/annoServlet")
public class AnnotationServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*super.doGet(req, resp);*/
		PrintWriter out = resp.getWriter();
		out.println("Hello Servlet!");
	}
}
