package com.southWind.mapper;

import com.southWind.pojo.User;
import com.southWind.utils.MybatisUtils;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperTest extends TestCase {

    public void testSelUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> userList = userMapper.selUser();
        for (User user : userList) {
            System.out.println(user);

        }
    }
}