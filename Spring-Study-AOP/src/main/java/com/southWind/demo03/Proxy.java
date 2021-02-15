package com.southWind.demo03;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @ClassName proxy
 * @Description TODO
 * @Author
 * @Date 2021/2/13
 **/
@NoArgsConstructor
@AllArgsConstructor
public class Proxy implements UserService{
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    private UserServiceImpl userService;
    @Override
    public void add() {
        message("add");
        userService.add();
    }

    @Override
    public void del() {
        message("del");
userService.del();
    }

    @Override
    public void update() {
        message("update");
userService.update();
    }

    @Override
    public void search() {
        message("search");
userService.search();
    }
    public void message(String msg){
        System.out.println("增加了"+msg+"方法");
    }
}
