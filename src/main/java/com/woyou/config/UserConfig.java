package com.woyou.config;

import com.woyou.controller.UserController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class UserConfig {

    @Bean("userController")
    public UserController getUserController(){
        return new UserController();
    }
}
