package com.southWind.config;

import com.southWind.pojo.User;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WindConfigTest extends TestCase {

    public void testGetUser() {
        AnnotationConfigApplicationContext Context = new AnnotationConfigApplicationContext(WindConfig2.class);
        User getUser = Context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
    }
}