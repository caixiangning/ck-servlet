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
 * 
 * @author CaiXiangNing
 * @date May 24, 2017
 * @email caixiangning@gmail.com
 */
@SuppressWarnings("serial")
public class FirstServlet extends	HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*super.doGet(req, resp);*/
		PrintWriter out = resp.getWriter();
		out.println("Hello FirstServlet!");
	}
}
