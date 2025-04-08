package com.learn.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    @Transactional
    void transfer(String out, String in, double money);
}
