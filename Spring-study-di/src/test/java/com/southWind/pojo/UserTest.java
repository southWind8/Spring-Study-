package com.southWind.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void Test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        System.out.println(user);
    }

}