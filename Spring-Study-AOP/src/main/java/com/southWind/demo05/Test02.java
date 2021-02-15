package com.southWind.demo05;

/**
 * @ClassName Test02
 * @Description TODO
 * @Author
 * @Date 2021/2/13
 **/

public class Test02 {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        ProxyTest proxyTest=new ProxyTest();
        proxyTest.setTest(userService);
        UserService proxy = (UserService)proxyTest.getProxy();
        proxy.del();

    }
}
