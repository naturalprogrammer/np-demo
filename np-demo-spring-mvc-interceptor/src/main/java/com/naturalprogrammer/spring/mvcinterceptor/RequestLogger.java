package com.naturalprogrammer.spring.mvcinterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class RequestLogger extends HandlerInterceptorAdapter {
	
    private static Log log = LogFactory.getLog(RequestLogger.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
        log.info(request.getMethod() + " " + request.getServletPath() + " received");
        
		return true;
	}

}
