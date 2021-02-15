package com.southWind.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/9
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String>hobbies;
    private Map<String,String> card;
    private Set<String> games;
    private Properties info;
    private String wife;


}
