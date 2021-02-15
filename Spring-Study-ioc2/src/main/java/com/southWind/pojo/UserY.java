package com.southWind.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserY
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/9
 **/

@AllArgsConstructor
public class UserY {
    private String name;
    public UserY() {
        System.out.println("被创建了");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name = "+name);
    }
}
