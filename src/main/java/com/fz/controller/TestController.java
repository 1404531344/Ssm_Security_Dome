package com.fz.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.security.RolesAllowed;

@Controller
@RequestMapping("user")
public class TestController {

    @ResponseBody
    @RequestMapping("test")
    public String test(){
        return "test.1111111111";
    }

/*
* 权限测试
* */
    @RolesAllowed(value = {"ROLE_ADMIN"})
    @RequestMapping("query")
    public String query(){
        System.out.println("查询");
        return "/home.jsp";
    }
    @RolesAllowed(value = {"ROLE_USER"})
    @RequestMapping("save")
    public String save(){
        System.out.println("增加");
        return "/home.jsp";
    }





}
