package com.example.springbootfirst.controller;

import com.example.springbootfirst.configBean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping("/luge")
    public String luge(){
        return configBean.getName() + configBean.getSay();
    }

    @RequestMapping("/allSay")
    public String allSay(){
        return configBean.getAllSay();
    }
}
