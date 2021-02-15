package com.southWind.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName Log
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/13
 **/

public class Log  implements MethodBeforeAdvice {

    @Override
    //method：是一个方法，要执行的目标对象的方法
    //object：参数
    //target：目标对象
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
