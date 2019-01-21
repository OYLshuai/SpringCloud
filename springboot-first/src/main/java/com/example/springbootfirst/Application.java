package com.example.springbootfirst;

import com.example.springbootfirst.configBean.ConfigBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@RestController
@SpringBootApplication
@MapperScan("com.example.springbootfirst.mapper")
@EnableConfigurationProperties({ConfigBean.class})
public class Application {
    @Value("${object.name}")
    String name;

    @Value("${object.say}")
    String say;

    @RequestMapping("/")
    String home() {
        return "Hello " + name + say;
    }
    @RequestMapping("/now")
    String hehe() {
        //DateFormat yyymmdd = DataFormat.getDateTimeInstance();

        return "现在时间：" + DateFormat.getDateTimeInstance().format(new Date());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
