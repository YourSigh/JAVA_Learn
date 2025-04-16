package com.learn.service.impl;

import com.learn.dao.UserMapper;
import com.learn.entity.User;
import com.learn.service.UserService;
import com.learn.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseResult<User> login(String username, String pwd) {
        User user = userMapper.selectByNameAndPassword(username, pwd);
        if (user != null) {
            return ResponseResult.success(user);
        } else {
            return ResponseResult.error(401, "用户名或密码错误");
        }
    }
}