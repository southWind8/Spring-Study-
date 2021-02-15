package com.southWind.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 86139
 * @ClassName User
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/9
 **/
@Component
/**
 * @component 组件
 * @value   相当于property name=“”，使用注解配置，如果复杂建议还是走配置文件
 */
public class User {
    @Value("南风")
    public String name;

}
