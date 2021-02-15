package com.southWind.demo03;

/**
 * @ClassName test
 * @Description TODO
 * @Author
 * @Date 2021/2/13
 **/

public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        Proxy proxy=new Proxy();
        proxy.setUserService(userService);
        proxy.add();
    }
}
