package com.southWind.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
@Test
    public void Test(){
    ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
    Student student =(Student)Context.getBean("student");
    System.out.println(student.toString());
 }
}