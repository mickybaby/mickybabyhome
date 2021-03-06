package com.mooc.house;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.mooc.house.mapper")
@EnableAsync
public class HouseApplication {
    /**
     * git 代码的提交修改
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HouseApplication.class, args);
    }
    /**
     * 修改代码 2
     */
}
