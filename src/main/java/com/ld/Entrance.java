package com.ld;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
//@MapperScan(basePackages = "com.ld.dao")
public class Entrance {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Entrance.class);
    }
}
