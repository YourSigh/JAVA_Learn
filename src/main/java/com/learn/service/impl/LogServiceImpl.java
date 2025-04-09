package com.learn.service.impl;

import com.learn.dao.LogDao;
import com.learn.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("LogService")
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    @Override
    public void log(String out, String in, Double money) {
        logDao.log("由" + out + "转入" + in + "金额为" + money);
    }
}
