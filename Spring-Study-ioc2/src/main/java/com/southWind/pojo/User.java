package com.southWind.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/9
 **/

@Data
@Builder
public class User {
    private String name;
    public User(String name) {
      this.name=name;
    }
    public void show(){
        System.out.println("name = "+name);
    }
}
