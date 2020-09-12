package com.qst.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener()
public class AccessSessionLIstener implements HttpSessionListener {
    private int num = 0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        num++;
        se.getSession().getServletContext().setAttribute("num",num);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        num--;
        se.getSession().getServletContext().setAttribute("num",num);
    }
}
