package com.example.springbootfirst.configBean;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "object")
public class ConfigBean {
    private String name;
    private String say;
    private String allSay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public String getAllSay() {
        return allSay;
    }

    public void setAllSay(String allSay) {
        this.allSay = allSay;
    }
}
