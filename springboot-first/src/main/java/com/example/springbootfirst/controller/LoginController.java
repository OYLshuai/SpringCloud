package com.example.springbootfirst.controller;

import com.example.springbootfirst.ImpService.UserService;
import com.example.springbootfirst.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/rest")
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User Login(@RequestBody User user) {
        System.out.printf("用户名" + user.getUsername());
        System.out.printf("用户密码" + user.getPassword());

        User userBean = userService.selectUserByLogin(user.getUsername(),user.getPassword());

        return userBean;
    }

}
