package com.zhangshi.multiblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhangshi.multiblog.mapper")
public class MultiblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiblogApplication.class, args);
    }

}
