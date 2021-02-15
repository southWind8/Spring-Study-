package com.southWind.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName s
 * @Description TODO
 * @Author
 * @Date 2021/2/13
 **/

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            //第一步，获取sql对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**既然有了 SqlSessionFactory ，顾名思义，我们就可以从中获得 SqlSession 的实例了。
     // SqlSession 完全包含了面向数据库执行org.apache.ibatis.jdbc.SQL 命令所需的所有方法。
     // 你可以通过 SqlSession 实例来直接执行已映射的 SQL 语句。
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
