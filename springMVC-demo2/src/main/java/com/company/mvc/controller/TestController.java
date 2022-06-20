package com.company.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wyt
 * @create 2022-06-15 10:27
 */
@Controller
public class TestController {
    //  通过@RequestMapping注解，可以通过请求路径匹配要处理的具体的请求
    //  /表示的当前工程的上下文路径
    @RequestMapping("/")
    public String index(){
        return "index";
    }


}
