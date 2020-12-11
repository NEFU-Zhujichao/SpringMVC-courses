package com.example.interceptor;

import com.example.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().contains("login")){
            return true;
        }
        User user = (User) request.getSession().getAttribute("user");
        if (user != null)
        return true;
        else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return false;
        }
    }
}
