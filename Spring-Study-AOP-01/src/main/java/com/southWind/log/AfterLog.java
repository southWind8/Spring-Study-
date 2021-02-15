package com.southWind.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName AfterLog
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/13
 **/

public class AfterLog implements AfterReturningAdvice {


    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"这个方法,"+"返回的结果为:"+returnValue);
    }
}
