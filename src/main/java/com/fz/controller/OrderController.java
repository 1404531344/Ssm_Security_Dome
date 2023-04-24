package com.fz.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class OrderController {

    /*
     * 权限测试  spring的表达式是使用
     * */
    @PreAuthorize(value = "hasAnyRole('ROLE_ADMIN')")
    @RequestMapping("query")
    public String query(){
        System.out.println("查询");
        return "/home.jsp";
    }
    @PreAuthorize(value = "hasAnyRole('ROLE_USER')")
    @RequestMapping("save")
    public String save(){
        System.out.println("增加");
        return "/home.jsp";
    }


}
