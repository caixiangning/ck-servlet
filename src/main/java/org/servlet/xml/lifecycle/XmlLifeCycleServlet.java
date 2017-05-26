package org.servlet.xml.lifecycle;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Servlet生命周期：加载和实例化、初始化、请求处理、销毁。
 * Servlet生命周期通过javax.servlet.Servlet接口中的init()、service()、destroy三个方法来表示。
 * (在web.xml中配置load-on-startup属性，并且值>=0则Servlet容器启动的时候即加载并实例化Servlet，否则延迟加载)
 * 
 * 非延迟加载url:http://localhost:8080/ck-servlet/xmlLifeCycleServlet
 * 延迟加载url:http://localhost:8080/ck-servlet/xmlLifeCycleLazyServlet
 * 
 * @author CaiXiangNing
 * @date May 26, 2017
 * @email caixiangning@gmail.com
 */
@SuppressWarnings("serial")
public class XmlLifeCycleServlet extends HttpServlet{
	
	public XmlLifeCycleServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("1.Servlet执行实例化操作");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("2.Servlet执行初始化操作");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 请求时该方法未被执行，这是因为重写了
		System.out.println("4.执行GET请求处理过程");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("3.Servlet执行service方法");
		// 如果不调用父类的super.service(req, resp);方法则doGet不会执行(这是因为在父类service中根据请求类型调用了相应的doXXX方法)
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("5.执行销毁操作");
	}
}
