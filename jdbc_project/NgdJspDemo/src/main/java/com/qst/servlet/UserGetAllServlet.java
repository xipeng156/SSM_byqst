package com.qst.servlet;

import com.alibaba.fastjson.JSON;
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
import java.util.List;

@WebServlet("/getAll")
public class UserGetAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        List<Users> list = userService.getAll();
        resp.setContentType("application/javascript");
        Object json = JSON.toJSON(list);
        PrintWriter writer = resp.getWriter();
        writer.write(json.toString());
//        System.out.println(json.toString());
//        writer.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        req.setCharacterEncoding("utf-8");
//      修改爲application/javascript
        resp.setContentType("application/javascript");
        resp.setCharacterEncoding("utf-8");

        UserService userService = new UserServiceImpl();
        List<Users> list = userService.getAll();
        String lists = JSON.toJSONString(list);
        PrintWriter writer = resp.getWriter();
        writer.print(lists);
        System.out.println(lists);
        writer.close();
    }
}
