package com.axe.todo.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
    @RequestMapping("/login")
    public String login(String username, String password, HttpServletRequest request) {
        System.out.println("用户名：" + username + "\t密码：" + password);
        request.setAttribute("username", username);
        request.setAttribute("password", password);

        return "succ";
    }
}
