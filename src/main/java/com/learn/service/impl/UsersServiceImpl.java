package com.learn.service.impl;

import com.learn.dao.UsersDao;
import com.learn.domain.Users;
import com.learn.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;

    public void save(Users users) {
        usersDao.save(users);
    }

    public Users findById(Integer id) {
        return usersDao.findById(id);
    }

    public void update(String name, String pwd, Integer id) {
        usersDao.update(name, pwd, id);
    }

    public void delete(Integer id) {
        usersDao.delete(id);
    }

    public List<Users> findAll() {
        return usersDao.findAll();
    }

    public void test(int t) {
        System.out.println("test");
    }
}
