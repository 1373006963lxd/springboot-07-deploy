package com.atguigu.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

/*访问template里面的静态页面记得加上thymeleaf依赖*/

    @GetMapping("/abc")
    public String hello(){
        return "hello1";
    }
}
