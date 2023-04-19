package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//注解开发
//@Component(value = "userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Value("zhangsan")
    private String username;

    @Override
    public void show() {
        System.out.println(username);
    }
}
