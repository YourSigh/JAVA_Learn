package com.learn.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.learn.service.impl.UsersServiceImpl.findAll())")
    private void pt() {}

    @Before("pt()")
    public void log() {
        System.out.println("Logging...");
    }
}
