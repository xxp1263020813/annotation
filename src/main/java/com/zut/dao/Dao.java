package com.zut.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Dao {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate template = ac.getBean("jdbcTemplate", JdbcTemplate.class);
    }
}
