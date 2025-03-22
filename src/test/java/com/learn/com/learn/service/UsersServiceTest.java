package com.learn.com.learn.service;

import com.learn.config.SpringConfig;
import com.learn.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UsersServiceTest {

    @Autowired
    private UsersService usersService;

    @Test
    public void findAll() {
        System.out.println(usersService.findAll());
    }
}
