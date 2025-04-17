package com.learn.dao;

import com.learn.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectByNameAndPassword(
            @Param("username") String name,
            @Param("pwd") String password
    );
}