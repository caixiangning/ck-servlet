package org.servlet.xml.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * 创建一个Servlet程序(使用XML方式配置映射关系)
 * url:http://localhost:8080/ck-servlet/xmlServlet
 * 
 * @author CaiXiangNing
 * @date May 24, 2017
 * @email caixiangning@gmail.com
 */
@SuppressWarnings("serial")
public class XmlServlet extends HttpServlet {
	
	/**
	 * 继承HttpServlet类并重写doGet方法可以接受GET请求
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* super.doGet(req, resp); */
		PrintWriter out = resp.getWriter();
		out.println("Hello Servlet!");
	}
}
