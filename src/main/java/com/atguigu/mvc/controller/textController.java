package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class textController {

    @RequestMapping("/")
    public String text(){
        return "index";
    }
}
