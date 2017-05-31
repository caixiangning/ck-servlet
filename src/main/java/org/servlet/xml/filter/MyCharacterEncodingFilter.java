package org.servlet.xml.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * Servlet过滤器的使用(以设置字符编码为例)
 * 需要实现Filter接口并在web.xml中使用<filter>、<filter-mapping>标签进行配置
 *
 * @author CaiXiangning 
 * @date May 28, 2017 
 * @email caixiangning@gmail.com
 */
public class MyCharacterEncodingFilter implements Filter{

	protected String encoding = null;
	protected FilterConfig filterConfig = null;
	protected String ignore = "true";
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("过滤器进行初始化工作");
		this.filterConfig = filterConfig;
		this.encoding = filterConfig.getInitParameter("encoding");
		this.ignore = filterConfig.getInitParameter("ignore");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("过滤器做的工作");
		if(request.getCharacterEncoding() == null || "false".equals(ignore)){
			if(this.encoding != null){
				request.setCharacterEncoding(this.encoding);
				response.setCharacterEncoding(this.encoding);
			}
		}
		// 必须在过滤器中的doFilter方法最后调用chain.doFilter(request, response)方法
		// 通过该方法将使过滤器链的下一个过滤器被调用。如果调用该方法的过滤器是过滤器链中的最后一个过滤器，那么目标资源将被调用。
		// 如果不调用这个方法，则过滤器不会将请求发送给目标Servlet
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("过滤器进行销毁工作");
		this.encoding = null;
		this.ignore = null;
	}
}
