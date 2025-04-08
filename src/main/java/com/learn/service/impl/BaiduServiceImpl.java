package com.learn.service.impl;

import com.learn.service.BaiduService;
import org.springframework.stereotype.Service;

@Service("BaiduService")
public class BaiduServiceImpl implements BaiduService {
    @Override
    public boolean login(String username, String password) {
        return password.equals("root");
    }
}
