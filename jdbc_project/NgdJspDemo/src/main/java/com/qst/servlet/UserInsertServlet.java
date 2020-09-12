package com.qst.servlet;

import com.qst.entity.Users;
import com.qst.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserServiceImpl service = new UserServiceImpl();
        String username = req.getAttribute("username").toString();
        String password = req.getAttribute("password").toString();
        Boolean insert = service.insert(new Users(username,password));
        if (insert)
            req.setAttribute("status",1);
        else req.setAttribute("status",0);
    }
}