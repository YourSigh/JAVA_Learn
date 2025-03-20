package com.learn.service;

import com.learn.domain.Users;

import java.util.List;

public interface UsersService {
    void save(Users users);
    List<Users> findAll();
    Users findById(Integer id);
    void update(String name, String pwd, Integer id);
    void delete(Integer id);
}
