package com.example.controller;

import com.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/a1")
    public List<User> test1(){
        List<User> list = new ArrayList<>();
        list.add(new User("朱继超1",1,"男"));
        list.add(new User("朱继超2",2,"男"));
        list.add(new User("朱继超3",3,"男"));
        return list;
    }

    @RequestMapping("/a2")
    public String test2(String username,String pwd){
        //检测逻辑不正确，使用时请重新设计登录验证逻辑
        String status = "false";
        if (username != null){
            if (username.equals("admin")){
                status = "true";
            }
        }
        if (pwd != null){
            if (pwd.equals("123456")){
                status = "true";
            }
        }
        return status;
    }

}
