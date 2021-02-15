package com.southWind.dao;

import com.southWind.Service.UserServiceImpl;
import com.southWind.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @org.junit.jupiter.api.Test
    public void Test(){
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在spring中管理了，我要使用从里面直接取出来就可以了！
//        Hello hello = (Hello)context.getBean("hello");
//        System.out.println(hello.toString());
        UserServiceImpl userServiceImpl =(UserServiceImpl)context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
    @Test
    public void Test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //容器在手天下我有，需要什么就get就ok了
       UserServiceImpl userServiceImpl =(UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

    }
}