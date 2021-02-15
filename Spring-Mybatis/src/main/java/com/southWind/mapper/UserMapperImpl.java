package com.southWind.mapper;

import com.southWind.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @ClassName UserMapperImpl
 * @Description TODO
 * @Author
 * @Date 2021/2/13
 **/

public class UserMapperImpl implements UserMapper {
    //我们的所有操作都使用sqlSession来执行，现在都使用sqlSessionTempLate
    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selUser() {
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        return mapper.selUser();
    }

}
