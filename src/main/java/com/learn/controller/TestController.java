package com.learn.controller;

import com.learn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("Hello World");
        return "{message:'test'}";
    }

    @RequestMapping(value = "/json/post", method = RequestMethod.POST)
    @ResponseBody
    public String jsonPost(@RequestBody User user){
        System.out.println(user.toString());
        return "{message:'post'}";
    }
}
