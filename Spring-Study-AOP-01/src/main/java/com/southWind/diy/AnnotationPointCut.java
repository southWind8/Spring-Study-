package com.southWind.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @ClassName AnnotationPointCut
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/13
 **/
@Aspect//标注这个类是一个切面
//使用注解方式来实现aop
public class AnnotationPointCut {
    @Before("execution(* com.southWind.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=================方法执行前=================");
    }
    @After("execution(* com.southWind.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=================方法执行后=================");
    }
    //在环绕增强中，我们可以给定一个参数，代表我们需要获取处理切入的点
    @Around("execution(* com.southWind.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        //执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
    }
}

