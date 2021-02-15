package com.southWind.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName pojo
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/13
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    private int id;
    private String name;
    private String pwd;
}
