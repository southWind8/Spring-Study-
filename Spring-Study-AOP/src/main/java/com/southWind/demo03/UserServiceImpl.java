package com.southWind.demo03;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author
 * @Date 2021/2/13
 **/

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void del() {
        System.out.println("del");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void search() {
        System.out.println("search");
    }
}
