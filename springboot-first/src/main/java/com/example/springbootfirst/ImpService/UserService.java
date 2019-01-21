package com.example.springbootfirst.ImpService;

import com.example.springbootfirst.model.User;

public interface UserService {

    User selectUserByLogin(String loginName, String loginPwd);
}
