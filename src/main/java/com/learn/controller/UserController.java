package com.learn.controller;

import com.learn.entity.User;
import com.learn.service.UserService;
import com.learn.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseResult<User> login(
            @RequestParam("username") String name,
            @RequestParam("pwd") String password) {
        System.out.println("登录！" + name + ":" + password);
        return userService.login(name, password);
    }
}