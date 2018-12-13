//package com.test.charging.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.core.annotation.Order;
//
//import com.hnapay.sis.charging.service.MerCalculateFeeService;
//import com.test.charging.restfulcontroller.MerFeeController;
//
//@Order(3)
//@WebFilter(urlPatterns = "/*",filterName = "DefaultFilter")
//public class DefaultFilter implements Filter,ApplicationContextAware{
//	
//	private ApplicationContext context;
//
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//	}
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		HttpServletRequest req = (HttpServletRequest) request;
//		System.out.println(req.getRequestURI());
//		MerCalculateFeeService diBean = context.getBean(MerCalculateFeeService.class);
//		MerFeeController needDiBean = context.getBean(MerFeeController.class);
//		needDiBean.setService(diBean);
//		//throw new IOException("调用自定义过滤器成功");
//	}
//
//	@Override
//	public void destroy() {
//	}
//
//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		context = applicationContext;
//	}
//
//}
