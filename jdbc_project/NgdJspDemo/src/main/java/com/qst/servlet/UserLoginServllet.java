package com.qst.servlet;

import com.qst.entity.Users;
import com.qst.service.UserService;
import com.qst.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login",loadOnStartup = 1)
public class UserLoginServllet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserService service = new UserServiceImpl();
        Users users = service.login(new Users(username, password));
        System.out.println("servlet_user"+users.toString());
        if (users!=null) {
            System.out.println("servlet success");
            req.setAttribute("users", users);
            req.getRequestDispatcher("success.jsp").forward(req,resp);
//            resp.sendRedirect();
        }
        else System.out.println("error");
//        System.out.println(username+"   "+password);


    }
}
