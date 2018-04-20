package com.shimao.jsbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot应用标识注解
@SpringBootApplication
//注册mapper接口类
@MapperScan("com.shimao.jsbase.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
