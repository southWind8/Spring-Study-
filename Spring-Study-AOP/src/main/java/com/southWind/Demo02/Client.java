package com.southWind.Demo02;

import java.util.UUID;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/12
 **/

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        UserServiceProxy proxy=new UserServiceProxy();
        proxy.setUserService1(userService);
        proxy.del();
    }
}
