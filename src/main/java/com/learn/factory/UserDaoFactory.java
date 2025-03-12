package com.learn.factory;

import com.learn.dao.UserDao;
import com.learn.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDaoFactory() {
        System.out.println("UserDaoFactory setup...");

    }
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
