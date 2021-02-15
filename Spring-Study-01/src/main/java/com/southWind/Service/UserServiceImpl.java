package com.southWind.Service;

import com.southWind.dao.UserDao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PublicKey;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/8
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserServiceImpl implements UserService {
private UserDao userDao;
public void setUserDao(UserDao userDao){
    this.userDao=userDao;
}
    @Override
    public void getUser() {
    userDao.getUserDao();
    }
}
