package com.southWind.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @ClassName Person
 * @Description TODO
 * @Author
 * @Date 2021/2/9
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Person {
    /**如果显示的定义了属性为false就说明这个对象可以为null，否则不允许为空
     * @Resource 也可以进行自动装配
     */

    @Autowired(required = false)
    private Cat cat;
    @Autowired(required = false)
    @Qualifier(value = "dog")
    private Dog dog;
    private String name;
}
