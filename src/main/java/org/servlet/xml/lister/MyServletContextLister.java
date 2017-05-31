package org.servlet.xml.lister;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * Servlet监听器的使用(以监听上下文初始化、销毁为例)
 * 需要实现具体的监听器接口并在web.xml中使用<listener>标签进行配置
 *
 * @author CaiXiangning 
 * @date May 28, 2017 
 * @email caixiangning@gmail.com
 */
public class MyServletContextLister implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Servlet上下文对象进行初始化时执行的工作");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Servlet上下文对象进行销毁时执行的工作");
	}
}
