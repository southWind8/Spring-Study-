package com.southWind.pojo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        UserY user =(UserY) Context.getBean("userY");
        user.show();
    }
}