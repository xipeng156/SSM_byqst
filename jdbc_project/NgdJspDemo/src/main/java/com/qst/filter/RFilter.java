package com.qst.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 过滤器实现权限控制
 */
public class RFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /**
         * 判断会话是否存在
         */
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        Object o = session.getAttribute("username");
        if (o!=null){
            String username = session.getAttribute("username").toString();
            if (username != null) {
                filterChain.doFilter(servletRequest, servletResponse);
            } else {
                ((HttpServletResponse)servletResponse).sendRedirect("/login.jsp");
            }
        }else {
            ((HttpServletResponse)servletResponse).sendRedirect("/login.jsp");
        }
    }
}
