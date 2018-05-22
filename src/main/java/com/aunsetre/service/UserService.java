package com.aunsetre.service;

import com.aunsetre.pojo.User;

import java.util.List;

public interface UserService {
    User login(String name, String pwd);
    List<User> selectAll();
}
