package com.itheima.controller;

import com.itheima.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class ParamController {

    //http:localhost:9999/user/100==>根据id查询
    //123
    @GetMapping("/user/{id}")
    public String findUserById(@PathVariable("id") int id){
        System.out.println("id==>"+id);
        return "/index.jsp";
    }
    //http:localhost:9999/param6?username=zhangsan&age=18&hobbies=zq&hobbies=pq&birthday=2018/11/11&address.city=tj&address.area=zh
    @GetMapping("/param6")
    public String param6(User user){
       System.out.println(user);
        return "/index.jsp";
    }
    //http:localhost:9999/param5?username=zhangsan&age=18
    @GetMapping("/param5")
    public String param5(@RequestParam Map<String,String> map){
        map.forEach((k,v)->{
                System.out.println(k+"===>"+v);
                });
        return "/index.jsp";
    }
    //http:localhost:9999/param4?hobby=zq&hobby=pq&hobby=tq
    @GetMapping("/param4")
    public String param1(@RequestParam List<String> hobby){
        for(String s:hobby){
            System.out.println(s);
        }
        return "/index.jsp";
    }
}
