package com.learn.service.impl;

import com.learn.dao.AccountDao;
import com.learn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AccountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String out, String in, double money) {
        accountDao.outMoney(out,money);
        accountDao.inMoney(in,money);
    }
}
