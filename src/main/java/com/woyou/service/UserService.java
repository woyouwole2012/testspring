package com.woyou.service;

import com.woyou.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Value("${woyou.name}")
    private String name ;

    public void save(){

        System.out.println(name);
        userDao.save();
    }
}
