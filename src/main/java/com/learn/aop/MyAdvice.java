package com.learn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.learn.service.impl.UsersServiceImpl.test())")
//    @Pointcut("execution(* *..*(..))")
    private void pt() {}

    @Before("pt()")
    public void logBefore() {
        System.out.println("Before advice running....");
    }

    @After("pt()")
    public void logAfter() {
        System.out.println("After advice running....");
    }

    @Around("pt()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around before advice running....");
        Object obj = joinPoint.proceed();
        System.out.println("Around after advice running....");
        return obj;
    }

    @AfterReturning("pt()")
    public void logAfterReturning() {
        System.out.println("After return advice running....");
    }

    @AfterThrowing("pt()")
    public void logAfterThrowing() {
        System.out.println("After throw advice running....");
    }
}
