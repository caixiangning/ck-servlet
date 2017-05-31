package org.servlet.xml.filter;

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
 * @date May 28, 2017 
 * @email caixiangning@gmail.com
 */
@SuppressWarnings("serial")
@WebServlet("/characterEncodingServlet")
public class CharacterEncodingServletTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("中国");
	}
	
}
