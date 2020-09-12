package com.qst.servlet;

import com.qst.entity.Users;
import com.qst.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getAttribute("username").toString();
        String userPwd = req.getAttribute("userPwd").toString();
        Users users = new Users(username, userPwd);
        UserServiceImpl service = new UserServiceImpl();
        Boolean update = service.update(users);
        if (update)
            req.setAttribute("status",1);
        else req.setAttribute("status",0);
    }
}
