package com.student.api.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.student.api.service.*.*(..)) || execution(* com.student.api.controller.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("🔍 Before Method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.student.api.service.*.*(..)) || execution(* com.student.api.controller.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("✅ After Method: " + joinPoint.getSignature().getName());
    }

    @AfterThrowing(pointcut = "execution(* com.student.api.*.*.*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Throwable ex) {
        System.out.println("❌ Exception in " + joinPoint.getSignature().getName() + ": " + ex.getMessage());
    }
}
