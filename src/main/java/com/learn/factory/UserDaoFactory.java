package com.learn.factory;

import com.learn.daoBat.UserDao;
import com.learn.daoBat.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDaoFactory() {
        System.out.println("UserDaoFactory setup...");

    }
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
