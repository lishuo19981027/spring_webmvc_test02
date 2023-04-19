package com.itheima.controller;

import com.itheima.service.QuickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuickController {
    //直接注入Service
    //注入bean
    @Autowired
    private QuickService quickService;
    @RequestMapping("/show")
    public String show(){
        System.out.println("show running...."+quickService);
        return "/index.jsp";
    }
}
