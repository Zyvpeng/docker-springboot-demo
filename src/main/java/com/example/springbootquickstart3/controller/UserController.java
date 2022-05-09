package com.example.springbootquickstart3.controller;

import com.example.springbootquickstart3.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String Login(User user, HttpServletRequest request){
        System.out.println(user);
        String username = request.getParameter("username");
        System.out.println(username);
        return "homepage.html";
    }


}
