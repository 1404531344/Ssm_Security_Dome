package com.fz.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("role")
public class RoleController {

    /*
    * sprinigSecurity 提供的注解
    * */


    @Secured("ROLE_ADMIN")
    @RequestMapping("query")
    public String query(){
        System.out.println("查询");
        return "/home.jsp";
    }
    @Secured("ROLE_USER")
    @RequestMapping("save")
    public String save(){
        System.out.println("增加");
        return "/home.jsp";
    }
}
