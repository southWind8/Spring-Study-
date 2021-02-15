package com.southWind.Demo02;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/12
 **/

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void del() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void search() {
        System.out.println("查询了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }
}
