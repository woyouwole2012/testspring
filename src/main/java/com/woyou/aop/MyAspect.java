package com.woyou.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut(value = "execution(* com.woyou.service.*.*(..))")
    public void cutPoint(){}

    @Before("cutPoint()")
    public void before(JoinPoint joinPoint){
        System.out.println("before --- ");
    }
}
