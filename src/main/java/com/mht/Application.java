package com.mht;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: SpringBoot启动类
 * @author: 张逸峰
 * @create: 2019-07-25 19:08
 **/
@SpringBootApplication
@MapperScan("com.mht.mapper")
public class Application {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);

    }
}
