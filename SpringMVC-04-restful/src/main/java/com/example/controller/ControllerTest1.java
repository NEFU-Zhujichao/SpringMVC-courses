package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api/")
//注意：  加lib目录！！！！！！！
public class ControllerTest1 {
    @GetMapping("index/{id}/{age}")
    public String test1(@PathVariable int id, @PathVariable int age, Model model){
        int res = id + age;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
}
