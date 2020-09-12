package com.qst.servlet;

import com.qst.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getAttribute("id").toString());
        UserServiceImpl service = new UserServiceImpl();
        Boolean delete = service.delete(id);
        if (delete) {
            req.setAttribute("status", 1);
        } else {
            req.setAttribute("status", 0);
        }
    }
}
