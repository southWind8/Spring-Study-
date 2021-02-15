package com.southWind.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName Proxy
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/13
 **/

public class ProxyTest implements InvocationHandler {
    //被代理的接口
   private Rent rent;
   public void setRent(Rent rent){
       this.rent=rent;
   }

    //生成得到的代理类
public Object getProxy(){
    return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
}
    @Override
    //处理代理实例，并且返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(rent, args);

        return result;
    }
}
