package com.itheima;


import com.itheima.config.SpringConfig;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        //注解方式加载spring配置类
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        /*Object userDao = applicationContext.getBean("userDao");
        System.out.println(userDao);*/
        UserService userService = applicationContext.getBean(UserService.class);
        userService.show();
    }
}
