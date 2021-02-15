package com.southWind.demo05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyTest
 * @Description TODO
 * @Author
 * @Date 2021/2/13
 **/

public class ProxyTest implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setTest(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return  result;
    }
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
