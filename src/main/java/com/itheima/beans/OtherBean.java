package com.itheima.beans;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
@Component
public class OtherBean {
    @Bean("dataSource")
    public DataSource dataSource(@Value("${jdbc.driver}") String driverClassName,
          UserDao userDao){
        System.out.println(driverClassName);
        System.out.println(userDao);
        DruidDataSource dataSource = new DruidDataSource();
        return  dataSource;
    }
}
