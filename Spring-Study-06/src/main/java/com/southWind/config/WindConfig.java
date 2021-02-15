package com.southWind.config;

import com.southWind.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName windConfig
 * @Description TODO
 * @Author
 * @Date 2021/2/9
 **/
@Configuration
/**
 * 这个也会被注册到spring中，因为他本来就是一个@component，@Configuration本事就是一个配置类，就和我们之前看的beans.xml是一样的
 */
public class WindConfig {
    @Bean
    public User getUser(){
        return new User("南风");
    }
}
