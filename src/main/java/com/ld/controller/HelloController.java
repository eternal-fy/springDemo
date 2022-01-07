package com.ld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.SQLException;

@Controller
public class HelloController {
    @Autowired
    DataSource dataSource;

    @RequestMapping("/")
    public String hello() throws SQLException {
        System.out.println(dataSource.getConnection());
        return "Hello.html";
    }
}
