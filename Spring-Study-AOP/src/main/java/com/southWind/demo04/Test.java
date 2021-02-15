package com.southWind.demo04;
/**
 * @ClassName Test
 * @Description TODO
 * @Author
 * @Date 2021/2/13
 **/

public class Test {
    public static void main(String[] args) {
        //真实角色
        Host host=new Host();
        //代理角色，现在没有
        ProxyTest test=new ProxyTest();
        //通过调用程序角色来处理我们要条用的接口对象
        test.setRent(host);
        Rent proxy =(Rent) test.getProxy();
        proxy.rent();
    }
}
