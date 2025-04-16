package com.learn.service;

import com.learn.entity.User;
import com.learn.util.ResponseResult;

public interface UserService {
    ResponseResult<User> login(String username, String pwd);
}