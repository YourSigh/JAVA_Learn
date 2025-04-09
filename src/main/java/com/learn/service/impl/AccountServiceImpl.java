package com.learn.service.impl;

import com.learn.dao.AccountDao;
import com.learn.service.AccountService;
import com.learn.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Service("AccountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    @Override
    public void transfer(String out, String in, double money) {
        try {
            accountDao.outMoney(out,money);
            int i = 1/ 0;
            accountDao.inMoney(in,money);
        } finally {
            logService.log(out, in, money);
        }
    }
}
