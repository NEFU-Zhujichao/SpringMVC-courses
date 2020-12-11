package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if (method.equals("add")){
            req.getSession().setAttribute("info","执行了add方法");
        }else {
            if (method.equals("delete"))
            req.getSession().setAttribute("info","执行了delete方法");
            else req.getRequestDispatcher("/common/error.jsp").forward(req,resp);
        }
        //请求转发不需要写项目全路径
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
        //重定向需要些项目全路径，且访问不到/WEB-INF 目录下的东西
        //resp.sendRedirect(req.getContextPath()+"/common/error.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
