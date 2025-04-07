package com.learn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.learn.service.impl.UsersServiceImpl.test(..))")
//    @Pointcut("execution(* *..*(..))")
    private void pt() {}

    @Before("pt()")
    public void logBefore(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("Before advice running....");
    }

//    @After("pt()")
//    public void logAfter() {
//        System.out.println("After advice running....");
//    }

//    @Around("pt()")
//    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("Around before advice running....");
//        Object obj = joinPoint.proceed();
//        System.out.println("Around after advice running....");
//        return obj;
//    }

//    @AfterReturning("pt()")
//    public void logAfterReturning() {
//        System.out.println("After return advice running....");
//    }

//    @AfterThrowing("pt()")
//    public void logAfterThrowing() {
//        System.out.println("After throw advice running....");
//    }

    @Pointcut("execution(* com.learn.service..*(..))")
    private void servicePt() {};

//    @Around("servicePt()")
    public Object time(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object res = null;
        for (int i = 0; i < 100000; i++) {
            res = joinPoint.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("万次执行" + joinPoint.getSignature().getDeclaringTypeName() + "的" + joinPoint.getSignature().getName() + "方法需要" + (end - start) + "ms");
        return res;
    }
}
