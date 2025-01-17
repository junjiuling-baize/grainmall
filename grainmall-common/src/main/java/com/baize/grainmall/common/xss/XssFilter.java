/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.baize.grainmall.common.xss;

//import io.renren.common.xss.XssHttpServletRequestWrapper;

import jakarta.servlet.http.HttpServletRequest;

import javax.servlet.*;
import java.io.IOException;

/**
 * XSS过滤
 * @author Mark sunlightcs@gmail.com
 */
public class XssFilter implements Filter {

	@Override
	public void init(FilterConfig config) {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
		XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper(
				(HttpServletRequest) request);
		chain.doFilter((ServletRequest) xssRequest, response);
	}

	@Override
	public void destroy() {
	}

}
