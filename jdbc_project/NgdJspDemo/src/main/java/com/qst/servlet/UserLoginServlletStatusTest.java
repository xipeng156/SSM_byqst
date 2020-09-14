package com.qst.servlet;

import com.qst.entity.JsonUsers;
import com.qst.entity.Users;
import com.qst.service.UserService;
import com.qst.service.impl.UserServiceImpl;
import com.qst.utils.GetJson;
import com.qst.utils.StatusCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/loginStatus",loadOnStartup = 1)
public class UserLoginServlletStatusTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserService service = new UserServiceImpl();
        Users users = service.login(new Users(username, password));
        System.out.println("servlet_user"+users.toString());
        ArrayList<Users> list = new ArrayList<>();
        list.add(users);
        JsonUsers jsonUsers = new JsonUsers(StatusCode.SUCCESS, list);
        if (users!=null) {
            String s = new GetJson().setStatus(jsonUsers);
            System.out.println(s);
            PrintWriter writer = resp.getWriter();
            writer.write(s);
            req.getRequestDispatcher("success.jsp").forward(req,resp);
            writer.close();
        }
        else System.out.println("error");
    }
}
