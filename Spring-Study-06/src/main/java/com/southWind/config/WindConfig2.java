package com.southWind.config;

import com.southWind.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName WindCongig2
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/9
 **/
@Configuration
@ComponentScan("com.southWind.pojo")
public class WindConfig2 {
    @Bean
    public User getUser(){
        return new User("南风2");
    }
}
