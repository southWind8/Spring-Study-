package com.southWind.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest
{
    @Test
    public void Test()
    {
        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = Context.getBean("person", Person.class);
        person.getCat().shout();
        person.getDog().shout();
    }
}