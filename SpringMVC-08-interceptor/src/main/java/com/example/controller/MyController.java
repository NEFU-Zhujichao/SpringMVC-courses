package com.example.controller;

import com.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class MyController {
    @GetMapping("/a1")
    public String test(){
        return "test";
    }
    @GetMapping("/jumpSuccess")
    public String jumpWelcome(){
        return "welcome";
    }
    @PostMapping("/login")
    public String loginTo(String username, String pwd, HttpServletRequest request, HttpServletResponse response){
        String url = "";
        HttpSession session = request.getSession();
        if (username.equals("admin") && pwd.equals("123456")){
            User user = new User();
            user.setName("admin");user.setPwd("123456");
            session.setAttribute("user",user);
            url = "welcome";
        }else {
            session.setAttribute("user",null);
            url = "redirect:login.jsp";
        }
        return url;
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        return "redirect:login.jsp";
    }
}
