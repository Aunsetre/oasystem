package com.aunsetre.service.service.impl;

import com.aunsetre.mapping.UserMapper;
import com.aunsetre.pojo.User;
import com.aunsetre.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    public UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    /*@Override
    public User login(String name, String pwd) {
        User user=userMapper.login(name,pwd);
        return user;
    }*/

    @Override
    public User login(String name, String pwd) {
        return null;
    }
}
