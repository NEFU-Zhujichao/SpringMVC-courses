package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/")
public class ModelTest1 {
    @GetMapping("t1")
    public String test1(Model model){
        model.addAttribute("msg","ModelTest1");
        return "test";
        //return "redirect:/index.jsp";
    }
}
