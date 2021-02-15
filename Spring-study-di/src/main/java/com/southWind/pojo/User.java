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
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    private String name;
    private int age;

}
