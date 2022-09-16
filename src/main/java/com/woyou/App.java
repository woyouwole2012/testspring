package com.woyou;

import com.woyou.controller.UserController;
import com.woyou.dao.UserDao;
import com.woyou.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
//        UserService userService1 = applicationContext.getBean("userService1", UserService.class);
        UserController userController = applicationContext.getBean("userController", UserController.class);
//        UserService userService2 = new UserService();
//        Config config = applicationContext.getBean("config", Config.class);
//        System.out.println(userDao);
//        userService.save();
//        Config config1 = new Config();
//        System.out.println(config);
//        System.out.println(config1);
//        System.out.println(userService);
//        System.out.println(userService1);
//        System.out.println(userService2);
        System.out.println(userController);

        userService.save();
    }
}
