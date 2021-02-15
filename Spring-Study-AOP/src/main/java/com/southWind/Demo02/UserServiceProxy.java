package com.southWind.Demo02;

/**
 * @ClassName UserServiceProxy
 * @Description TODO
 * @Author
 * @Date 2021/2/12
 **/

public class UserServiceProxy implements UserService{
UserServiceImpl userService1;
public void setUserService1(UserServiceImpl userService1){
    this.userService1=userService1;
}
    @Override
    public void add() {
    log("add");
        userService1.add();
    }

    @Override
    public void del() {
    log("del");
    userService1.del();
    }

    @Override
    public void search() {
    log("search");
        userService1.search();
    }

    @Override
    public void update() {
    log("update");
        userService1.update();
    }
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
