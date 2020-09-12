package com.qst.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 拦截请求定义字符集
 */

//@WebFilter
public class AFilter implements Filter {
    private String encode = null;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encode = filterConfig.getInitParameter("encode");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(encode);
        servletResponse.setCharacterEncoding(encode);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        encode=null;
    }
}

