package com.example.Spring.AOP;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopAspect {

    @Pointcut("@annotation(com.example.Spring.AOP.LogExecutionTime")
    public void pointcut(){}

    @Around("pointcut()")
    public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();

        System.out.println("Method " + joinPoint.getSignature() + " executed in " + (end - start ) + " ms");

        return result;
    }


}
