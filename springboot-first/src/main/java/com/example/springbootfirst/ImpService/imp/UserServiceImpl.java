package com.example.springbootfirst.ImpService.imp;

import com.example.springbootfirst.ImpService.UserService;
import com.example.springbootfirst.mapper.UserMapper;
import com.example.springbootfirst.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserByLogin(String loginName, String loginPwd) {
        return userMapper.selectUserForLogin(loginName,loginPwd);
    }
}
